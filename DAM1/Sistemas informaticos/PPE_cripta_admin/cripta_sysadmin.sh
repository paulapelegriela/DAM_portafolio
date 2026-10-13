#!/bin/bash

# variables del juego
vida=100
puntos=0
llaves=0
jugador=""
log="partidas.log"

inventario=()

# funciones base

bienvenida() {
    whiptail --msgbox "🏰 castillo maldito\n\nuna tormenta te obliga a refugiarte..." 10 60
    whiptail --msgbox "sin darte cuenta...\nhas entrado en un castillo abandonado." 10 60

    jugador=$(whiptail --inputbox "viajero... dime tu nombre:" 10 60 3>&1 1>&2 2>&3)

    whiptail --msgbox "bienvenido/a $jugador.\nlas puertas se cierran tras de ti..." 12 60
    whiptail --msgbox "una voz susurra:\n\n'nadie entra sin pagar un precio...'" 12 60
    whiptail --msgbox "debes avanzar por el castillo...\nsuperar sus pruebas...\ny escapar." 12 60
}

estado() {
    whiptail --msgbox "jugador: $jugador\nvida: $vida\npuntos: $puntos\nllaves: $llaves\ninventario: ${inventario[*]}" 12 60
}

guardar_log() {
    resultado=$1
    ruta_script="$(cd "$(dirname "$0")" && pwd)"
    echo "$jugador | puntos:$puntos | vida:$vida | resultado:$resultado" >> "$ruta_script/partidas.log"
}

derrota() {
    whiptail --msgbox "💀 has caído en el castillo maldito..." 10 50
    guardar_log "derrota"
    exit
}

# ver historial de partidas (ultimas 5)

ver_historial() {

    ruta_script="$(cd "$(dirname "$0")" && pwd)"

    if [ -f "$ruta_script/partidas.log" ]; then
        contenido=$(tail -n 5 "$ruta_script/partidas.log")
        whiptail --msgbox "$contenido" 20 70
    else
        whiptail --msgbox "no hay partidas registradas todavía." 10 60
    fi
}

# evento aleatorio

evento_aleatorio() {
    evento=$((RANDOM % 3))

    case $evento in
        0)
            whiptail --msgbox "⚠️ una trampa se activa (-15 vida)" 10 50
            vida=$((vida-15))
            ;;
        1)
            whiptail --msgbox "🧪 encuentras una poción" 10 50
            inventario+=("pocion")
            ;;
        2)
            whiptail --msgbox "💰 encuentras monedas (+10 puntos)" 10 50
            puntos=$((puntos+10))
            ;;
    esac
}

usar_pocion() {
    for i in "${!inventario[@]}"; do
        if [ "${inventario[$i]}" == "pocion" ]; then
            whiptail --yesno "¿beber poción? (+20 vida)" 10 50
            if [ $? -eq 0 ]; then
                vida=$((vida+20))
                unset 'inventario[$i]'
            fi
            break
        fi
    done
}

# sala 1: guardian

sala_guardian() {

    whiptail --msgbox "avanzas por un pasillo oscuro..." 12 60
    whiptail --msgbox "una bestia aparece entre las sombras." 12 60
    whiptail --msgbox "'cada decisión tiene consecuencias...'" 12 60

    opcion=$(whiptail --menu "¿qué haces?" 15 50 3 \
    1 "hablar con la bestia" \
    2 "atacar" \
    3 "huir" 3>&1 1>&2 2>&3)

    case $opcion in
        1)
            whiptail --msgbox "la bestia te da una llave." 10 50
            llaves=1
            puntos=$((puntos+10))
            ;;
        2)
            if [ $((RANDOM % 2)) -eq 0 ]; then
                whiptail --msgbox "te hiere (-30 vida)" 10 50
                vida=$((vida-30))
            else
                whiptail --msgbox "la derrotas (+20 puntos)" 10 50
                puntos=$((puntos+20))
            fi
            ;;
        3)
            whiptail --msgbox "escapas (-5 puntos)" 10 50
            puntos=$((puntos-5))
            ;;
    esac

    whiptail --msgbox "la criatura desaparece..." 10 60
}

# sala 2: acertijo

sala_acertijo() {

    whiptail --msgbox "una sala con antorchas y símbolos antiguos..." 12 60
    whiptail --msgbox "'solo los sabios avanzan'" 10 60

    r=$((RANDOM % 3))

    case $r in
        0)
            pregunta="blanco por dentro, verde por fuera. ¿qué es?"
            solucion="pera"
            ;;
        1)
            pregunta="cuanto más quitas, más grande es. ¿qué es?"
            solucion="agujero"
            ;;
        2)
            pregunta="oro parece, plata no es. ¿qué es?"
            solucion="platano"
            ;;
    esac

    respuesta=$(whiptail --inputbox "$pregunta" 10 60 3>&1 1>&2 2>&3)

    if [[ "$respuesta" == "$solucion" ]]; then
        whiptail --msgbox "correcto (+15 puntos)" 10 50
        puntos=$((puntos+15))
    else
        whiptail --msgbox "incorrecto (-20 vida)" 10 50
        vida=$((vida-20))
    fi

    whiptail --msgbox "las puertas se abren..." 10 60
}

# sala 3: minijuego con bucle

sala_minijuego() {

    whiptail --msgbox "un antiguo juego mágico aparece..." 12 60
    whiptail --msgbox "'solo quien acierte podrá continuar...'" 10 60

    numero=$((RANDOM % 5 + 1))

    while true
    do
        intento=$(whiptail --inputbox "elige un número del 1 al 5" 10 50 3>&1 1>&2 2>&3)

        [ -z "$intento" ] && continue

        if [ "$intento" -eq "$numero" ]; then
            whiptail --msgbox "¡correcto! has superado la prueba (+20 puntos)" 10 50
            puntos=$((puntos+20))
            break

        elif [ "$intento" -lt "$numero" ]; then
            vida=$((vida-5))
            whiptail --msgbox "El numero deseado es mayor...\n-5 de vida" 10 50

        else
            vida=$((vida-5))
            whiptail --msgbox "El numero deseado es menor...\n-5 de vida" 10 50
        fi

        [ $vida -le 0 ] && derrota
    done

    whiptail --msgbox "la magia desaparece..." 10 60
}

# sala final

sala_cofre() {

    if [ $llaves -eq 1 ]; then

        whiptail --msgbox "llegas a la sala del trono...\nun cofre te espera." 12 60

        final=$((RANDOM % 3))

        case $final in
            0)
                whiptail --msgbox "🏆 final 1: libertad\n\nescapas del castillo." 12 60
                guardar_log "victoria"
                exit
                ;;
            1)
                whiptail --msgbox "💀 final 2: maldición\n\nquedas atrapado para siempre." 12 60
                guardar_log "derrota"
                exit
                ;;
            2)
                whiptail --msgbox "🔒 final 3: torre\n\nla bestia te encierra en la torre más alta." 12 60
                guardar_log "derrota"
                exit
                ;;
        esac

    else
        whiptail --msgbox "el cofre está cerrado...\nquizás debas explorar mejor el castillo." 10 50
    fi
}

# flujo del juego

jugar() {

    evento_aleatorio
    usar_pocion
    sala_guardian

    [ $vida -le 0 ] && derrota

    evento_aleatorio
    usar_pocion
    sala_acertijo

    [ $vida -le 0 ] && derrota

    evento_aleatorio
    sala_minijuego

    [ $vida -le 0 ] && derrota

    sala_cofre
}

# menu principal

menu() {
    while true
    do
        opcion=$(whiptail --menu "menu principal" 15 50 5 \
        1 "jugar" \
        2 "estado" \
        3 "historial de partidas" \
        4 "instrucciones" \
        5 "salir" 3>&1 1>&2 2>&3)

        case $opcion in
            1) jugar ;;
            2) estado ;;
            3) ver_historial ;;
            4) whiptail --msgbox "explora el castillo y sobrevive." 10 60 ;;
            5) guardar_log "derrota"; exit ;;
        esac
    done
}

# inicio

bienvenida
menu
