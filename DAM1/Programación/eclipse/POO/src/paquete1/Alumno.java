package paquete1;

public class Alumno {

	//Atributos
	
	private int id;
	private String nombre;
	private String apellido;
	
	//CONSTRUCTORES
	
	//sin parametros/por defecto
	public Alumno() {
		
	}
	//con parametros
	public Alumno(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//GETTER Y SETTERS

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//Metodo saludar
	public void saludar() {
		
		System.out.println("Hola soy " + nombre + " " + apellido);
	}

	//Metodo evaluar
	public String evaluar(double nota) {		
		String mensaje;
		
		if (nota >= 5) {
			
			mensaje = (nombre + " es APTO");
		}else {
			mensaje = (nombre + " es NO APTO");
		}
		
		return mensaje;
	}

}//class


