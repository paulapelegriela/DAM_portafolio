package herencia;

public class Consultor extends Persona{

	//Atributos

	private int idConsultor;
	private double tarifaHora;
	private String nombreConsultora;

	//Constructores

	public Consultor() {
		super();
	}

	public Consultor(int idPersona, String dni, String nombre, String apellido, String domicilio, String telefono,
			int idConsultor, double tarifaHora, String nombreConsultora) {
		super(idPersona, dni, nombre, apellido, domicilio, telefono);
		this.idConsultor = idConsultor;
		this.tarifaHora = tarifaHora;
		this.nombreConsultora = nombreConsultora;
	}

	//Getters y Setters

	public int getIdConsultor() {
		return idConsultor;
	}
	public void setIdConsultor(int idConsultor) {
		this.idConsultor = idConsultor;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}
	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}

	public String getNombreConsultora() {
		return nombreConsultora;
	}
	public void setNombreConsultora(String nombreConsultora) {
		this.nombreConsultora = nombreConsultora;
	}

	//Metodos personalizados de apoyo

	public void visualizarConsultor(Consultor consultor) {

		//Visualizar datos de consultor1 (GET)
		System.out.println("----------------------" + "\n***** Consultor\t*****" + "\n----------------------");
		System.out.println("Id Cons. : " + consultor.getIdConsultor() + 
				"\nDNI	 : " + consultor.dni + 
				"\nNombre	 : " + consultor.nombre + 
				"\nApellido : " + consultor.apellido +
				"\nTarifa/h.: " + consultor.getTarifaHora() +
				"\nEmpresa	 : " + consultor.getNombreConsultora());

	}

}
