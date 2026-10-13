/* =========================
   AVISO DE PHISHING
   ========================= */

const formulario = document.getElementById("loginForm");

formulario.addEventListener("submit", function(event) {

    event.preventDefault();

    alert(
        "⚠️ Acabas de sufrir un ataque de phishing.\n\nCuidao."
    );

});


/* =========================
   SELECTOR DE IDIOMA
   ========================= */

const botonIdioma = document.getElementById("botonIdioma");
const listaIdiomas = document.getElementById("listaIdiomas");

const idiomas = document.querySelectorAll(
    "#listaIdiomas .idioma"
);

const idiomaSeleccionado = document.getElementById(
    "idiomaSeleccionado"
);


/* ABRIR / CERRAR */

botonIdioma.addEventListener("click", function(event) {

    event.stopPropagation();

    listaIdiomas.classList.toggle("abierto");

});


/* SELECCIONAR IDIOMA */

idiomas.forEach(function(idioma) {

    idioma.addEventListener("click", function() {

        idiomaSeleccionado.textContent = idioma.textContent;

        idiomas.forEach(function(elemento) {

            elemento.classList.remove(
                "seleccionado"
            );

        });

        idioma.classList.add(
            "seleccionado"
        );

        listaIdiomas.classList.remove(
            "abierto"
        );

    });

});


/* CERRAR AL HACER CLICK FUERA */

document.addEventListener("click", function() {

    listaIdiomas.classList.remove(
        "abierto"
    );

});