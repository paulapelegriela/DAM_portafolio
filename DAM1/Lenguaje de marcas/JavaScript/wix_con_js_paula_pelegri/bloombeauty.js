//Boton que hace que cambien todos los textos y fondo de claro a oscuro.

const boton = document.getElementById("btn"); //Seleccionamos el botón para cambiar el tema

boton.addEventListener('click', () => {
  // .toggle añade si no existe, elimina si existe
  document.body.classList.toggle('dark');
});

//Añadir una lista dinamica para añadir tareas e ir añadiendo mas o ir eliminando.

//Seleccionamos los elementos
const input = document.getElementById("tareaInput");
const button = document.getElementById("agregarTarea");
const lista = document.getElementById("listaTareas");

//Cuando hacemos click en el +
button.addEventListener("click", function() {

    //Guardamos lo que escribe el usuario
    let tarea = input.value;

    //Si está vacío no añade nada
    if (tarea == "") {
        return;
    }

    //Creamos el li
    let li = document.createElement("li");

    //Creamos el checkbox
    let checkbox = document.createElement("input");

    //Le ponemos tipo checkbox
    checkbox.type = "checkbox";

    
    li.append(tarea + " "); //Texto de la tarea
    li.appendChild(checkbox); //Añadimos el checkbox después del texto

    //Añadimos la tarea a la lista
    lista.appendChild(li);

   
    checkbox.addEventListener("click", function() { //Cuando se marque el checkbox elimina la tarea
        li.remove();
    });

    //Vacía el input
    input.value = "";
});