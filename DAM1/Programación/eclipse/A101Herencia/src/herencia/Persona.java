package herencia;

public class Persona {

	//Atributos

	protected int idPersona;
	protected String dni;
	protected String nombre;
	protected String apellido;
	protected String domicilio;
	protected String telefono;

	//Constructores 

	public Persona() {
		super();
	}

	public Persona(int idPersona, String dni, String nombre, String apellido, String domicilio, String telefono) {
		this.idPersona = idPersona;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}


}
