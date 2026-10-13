package paquete2;
import paquete1.Alumno;
public class ClaseMain {

	public static void main(String[] args) {

		//Crear objeto
		Alumno alumno1 = new Alumno (1, "Paula", "Pelegri");
		Alumno alumno2 = new Alumno ();

		alumno2.setId(2);
		alumno2.setNombre("Javi");
		alumno2.setApellido("Bravo");
		
		System.out.println("El id del alumno1 es: " + alumno1.getId());
		System.out.println("El id del alumno2 es: " + alumno2.getId());
		alumno1.saludar();
		alumno2.saludar();
		System.out.println(alumno1.evaluar(4.1));
		System.out.println(alumno2.evaluar(7.1));
	}//Main

}//Class
