package herencia;

public class Empleado extends Persona {

	//Atributos

	private int idEmpleado;
	private int categoria;
	private String cargo;
	private double sueldo;

	//Constructores
	
	public Empleado() {
		super();
	}

	public Empleado(int idPersona, String dni, String nombre, String apellido, String domicilio, String telefono,
			int idEmpleado, int categoria, String cargo, double sueldo) {
		super(idPersona, dni, nombre, apellido, domicilio, telefono);
		this.idEmpleado = idEmpleado;
		this.categoria = categoria;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	//Getter y Setters

	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
		//Asignamos sueldos por categorias
		asignarSueldoCategoria(categoria);
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	//Metodos personalizados

	private void asignarSueldoCategoria(int categoria) {

		//Salario según categoria
		switch (categoria) {
		case 1: //Desarrollador
			sueldo = 2000;
			break;

		case 2: //QA Manager
			sueldo = 3000;
			break;

		case 3: //JP
			sueldo = 4000;
			break;

		default:
			System.err.println(" ERROR: " + "Categoría " + categoria + " incorrecta.");
		}

	} //asignarSueldoCategoria

	public void visualizarEmpleado(Empleado empleado) {

		//Visualizar datos de empleado1 (GET)
		System.out.println("----------------------" + "\n***** Empleado\t*****" + "\n----------------------");
		System.out.println("Id Empl. : " + empleado.getIdEmpleado() + 
				"\nDNI	 : " + empleado.dni + 
				"\nNombre	 : " + empleado.nombre + 
				"\nApellido : " + empleado.apellido +
				"\nCategoria: " + empleado.getCategoria() +
				"\nCargo	 : " + empleado.getCargo() +
				"\nSueldo	 : " + empleado.getSueldo());

	}



}//Class
