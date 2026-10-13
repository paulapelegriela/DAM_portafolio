package abstraccion;

public class Cuadrado extends Figura {

	//Atributos
	
	private double lado;

	//Contructores
	
	public Cuadrado() {
		super();
	}

	public Cuadrado(double posicionX, double posicionY, double lado) {
		super(posicionX, posicionY);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double resultado = lado * lado;
		return resultado;
	}
	
}
