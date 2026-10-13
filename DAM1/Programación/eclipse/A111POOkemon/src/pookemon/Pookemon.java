package pookemon;

public abstract class Pookemon {

	//Atributos comunes
	public int numPokedex;
	public String nombre;
	public double altura;
	public double peso;
	public String categoria;
	public String tipo;
	public String habilidad;


	//Constructores
	public Pookemon() {
		super();
	}

	public Pookemon(int numPokedex, String nombre, double altura, double peso, String categoria, String tipo,
			String habilidad) {
		super();
		this.numPokedex = numPokedex;
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.tipo = tipo;
		this.habilidad = habilidad;
	}

	//Métodos comunes
	public abstract void atacarPlacaje();
	public abstract void atacarAraniazo();
	public abstract void atacarMordisco();
}
