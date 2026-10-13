package palabraStatic;

public class Coche {

	//Atributos de instancia
	private String patente;
	private String marca;
	private double precio;
	private String color;
	
	//Atributo de clase
	private static double dcto;

	//Constructores vacío y con todos los campos
	
	public Coche() {
		
	}

	public Coche(String patente, String marca, double precio, String color) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
	}
	
	//Getters y Setters

	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}

	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	public static double getDcto() {
		return dcto;
	}
	public static void setDcto(double dcto) {
		Coche.dcto = dcto;
	}

	//Metodos personalizados
	
	public double aplicarDescuento() {
		return (precio - (precio * dcto/100));
	}

	//Mostrar precio
	
	public void mostrarPrecio(Coche coche) {
		System.out.println(coche.patente + ": " +coche.aplicarDescuento());
	}
	
	@Override
	public String toString() {
		return "Coche [patente=" + patente + "\t marca=" + marca + "\t precio=" + precio + "\t color=" + color + "\t dcto="
				+ dcto + "]";
	}
	
	

}
