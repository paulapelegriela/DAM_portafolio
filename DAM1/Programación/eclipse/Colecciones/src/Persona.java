
public class Persona {

	//Atributos
	private int idPersona;
	private String nombre;
	private String Apellido;
	private String dni;
	
	//Constructores
	public Persona() {
		super();
	}
	public Persona(int idPersona, String nombre, String apellido, String dni) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		Apellido = apellido;
		this.dni = dni;
	}
	
	//Getters & Setters
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", Apellido=" + Apellido + ", dni=" + dni
				+ "]";
	}
	
	
	
	
}
