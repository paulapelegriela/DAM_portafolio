package abstraccion;

public class Circulo extends Figura {

	//Atributos
	private double radio;

	//Constructores
	
	public Circulo() {
		super();
	}

	public Circulo(double posicionX, double posicionY, double radio) {
		super(posicionX, posicionY);
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		double resultado = Math.PI * radio * radio;
		return resultado;
	}
}
