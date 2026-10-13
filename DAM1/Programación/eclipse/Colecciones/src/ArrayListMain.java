import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListMain {

	public static void main(String[] args) {

		inicioPrograma();
		
		int indice;
		
		//Declarar ArrayList
		List<Persona> persona = new ArrayList<Persona>();
		
		//Iniciar ArrayList
		persona.add(new Persona(1, "Roberto", "Dinamita", "12345678D"));
		persona.add(new Persona(2, "Ernesto", "Mate", "23456789M"));
		persona.add(new Persona(3, "Armando", "Gresca", "34567890G"));
		persona.add(new Persona(4, "Enrique", "Ándres", "45678901A"));
		
		//Mostrar tamaño lista
		System.out.println("\n ---------" + "\n ARRAYLIST" + "\n ---------");
		System.out.println("\n Tamaño : " + persona.size() + " elementos");
		
		//Mostrar el primer y último elemento de la lista
		System.out.println(" Primer elemento: " + persona.get(0).getNombre());
		System.out.println(" Último elemento: " + persona.get(persona.size()-1).getNombre());

		//Recorrido con for
		System.out.println("\n ------- Recorrido con FOR -------");
		for (indice = 0; indice < persona.size(); indice++) {
			System.out.println(" [" + indice + "]: " 
					+ persona.get(indice).getIdPersona() + " "
					+ persona.get(indice).getNombre() + " "
					+ persona.get(indice).getApellido());
		}
		
		//Insertar al principio
		persona.add(0, new Persona(5, "Alberto", "Netti", "56789012P"));
		
		//Insertar al final
		persona.add((persona.size()), new Persona(6, "Marisa", "Bado", "67890123B"));
		
		//Recorrido foreach
		System.out.println("\n ------- Recorrido FOREACH -------");
		indice = 0;
		for (Persona pers: persona) {
			System.out.println(" [" + indice + "]: " 
					+ pers.getIdPersona() + " "
					+ pers.getNombre() + " "
					+ pers.getApellido());
			indice++;
		}

		//Trabajar con arrays 
		Persona[] arrayPersona = new Persona[persona.size()];
		
		//Convertir ArrayList to Array
		persona.toArray(arrayPersona);
		
		//BORRAR ELEMENTO con ITERADOR
		
		String borrarPersona = "Enrique";
		System.out.println();
		System.out.println("\n ---------------------------------" +
		 "\n Borrar " + borrarPersona + " con ITERATOR");
		System.out.println( "---------------------------------\n");
		
		//Crear objeto ITERADOR
		Iterator<Persona> it1 = persona.iterator();
		
		//Borrar elemento nombre = borrarPersona
		while (it1.hasNext()) {
			String nombrePersona = it1.next().getNombre();
			if (nombrePersona.equals(borrarPersona)) {
				it1.remove();
			}
		}//while
		
		
			
		finPrograma();
	} //main

	public static void inicioPrograma() {
		System.out.println( "Inicio del Programa ARRAYLIST");
		System.out.println( "		desarrollado por PPE");
	}

	public static void finPrograma() {
		System.out.println( "\nFin del Programa");
	}
}//class
