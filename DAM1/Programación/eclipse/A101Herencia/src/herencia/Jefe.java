package herencia;

public class Jefe extends Empleado{

	//Atributos
	
	private int idJefe;
	private String dptoJefe;
	
	//Constructores
	
	public Jefe() {
		
	}
	
	public Jefe(int idPersona, String dni, String nombre, String apellido, String domicilio, String telefono,
			int idEmpleado, int categoria, String cargo, double sueldo, int idJefe, String dptoJefe) {
		super(idPersona, dni, nombre, apellido, domicilio, telefono, idEmpleado, categoria, cargo, sueldo);
		this.idJefe = idJefe;
		this.dptoJefe = dptoJefe;
	}

	//Metodos getter y setters 
	
	public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	public String getDptoJefe() {
		return dptoJefe;
	}

	public void setDptoJefe(String dptoJefe) {
		this.dptoJefe = dptoJefe;
	}
	
	//Metodos personalizados de apoyo
	
	public void visualizarJefe(Jefe jefe) {
		
		//Visualizar datos de jefe1 (GET)
		System.out.println("----------------------" + "\n***** \tJefe\t*****" + "\n----------------------");
		System.out.println("Id Empl. : " + jefe.getIdEmpleado() + 
				"\nDNI	 : " + jefe.dni + 
				"\nNombre 	 : " + jefe.nombre + 
				"\nApellido : " + jefe.apellido +
				"\nCategoria: " + jefe.getCategoria() +
				"\nCargo    : " + jefe.getCargo() +
				"\nSueldo   : " + jefe.getSueldo());

	}
	
	
}
