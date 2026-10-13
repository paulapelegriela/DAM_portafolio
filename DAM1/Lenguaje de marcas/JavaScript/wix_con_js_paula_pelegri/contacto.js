const formulario = document.querySelector("#formulario"); //Selecciona el form de contact.html
const email = document.querySelector("#email"); //Selecciona el input del email para validarlo
const nombre = document.querySelector("#nombre"); //Selecciona el input del nombre para validarlo
const telefono = document.querySelector("#telefono"); //Selecciona el input del telefono para validarlo
const resultadoformulario = document.querySelector("#resultado-formulario"); //Selecciona el mensaje del formulario
const emailError = document.querySelector("#email-error"); //Selecciona el mensaje de error del email


formulario.addEventListener("submit", function (evento) { //Cuando se envie el formulario, se ejecuta esta función
    evento.preventDefault(); //Evita que se envie el formulario para poder validar los campos

    //Si algún campo está vacío
    if (nombre.value.trim() === "" || email.value.trim() === "" || telefono.value.trim() === "") {
        resultadoformulario.textContent = "Por favor, rellene todos los campos."; //sale este mensaje
        resultadoformulario.className = "error"; //Se añade la clase de error

    } else if (!email.validity.valid) { //Si el email no es válido
        showError(); //Muestra el error del email

    } else {
        resultadoformulario.textContent = `Formulario enviado por ${nombre.value}. 
        Nos pondremos en contacto contigo lo antes posible.`;
        resultadoformulario.className = "Correcto";
        formulario.reset();
        emailError.textContent = "";
    }
});


email.addEventListener("input", function () { //Se verifica al introducir el correo

    if (email.validity.valid) { //Validamos si es correcto o no
        emailError.textContent = ''; //Si es correcto, se borra el mensaje de error
        emailError.className = "error";
    } else {
        showError(); //Si no es correcto, se muestra el mensaje de error
    }
});


function showError() { //Función para mostrar el mensaje de error

    if (email.validity.valueMissing) { //Si el campo del email esta vacio
        emailError.textContent = "Debe introducir una dirección de correo electrónico.";
    } else if (email.validity.typeMismatch) { //Si el formato del email es incorrecto
        emailError.textContent = "El correo electrónico no es válido.";
    } else if (email.validity.tooShort) { //Si el email es demasiado corto
        emailError.textContent = `El correo electrónico debe tener al menos ${email.minLength} caracteres; 
        ha introducido ${email.value.length}.`;
    }
    emailError.className = "error active"; //Se añade la clase de error para que el mensaje se vea
}
