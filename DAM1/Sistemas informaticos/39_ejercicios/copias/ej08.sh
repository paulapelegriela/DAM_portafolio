#!/bin/bash

#menú simple con opciones.

while true
do
	echo
	echo "----MENU----"
	echo "1. Saludar"
	echo "2. Mostrar hora"
	echo "3. Directorio actual"
	echo "4. Salir"
	echo

	read -p "Elige una opción: " opcion

	case $opcion in
		
		1)
		read -p "Introduce tu nombre: " nombre
		echo "Hola $nombre, bienvenido/a a mi script!"
		;;
	
		2) echo "son las: " 
		date ;;

		3) echo "Actualmente estas en: "
		pwd ;;
			
		4) exit ;;

		*) echo "Opción no valida" ;;
	esac
done
