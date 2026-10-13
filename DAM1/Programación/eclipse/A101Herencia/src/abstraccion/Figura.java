package abstraccion;

public abstract class Figura {

	protected double posicionX;
	protected double posicionY;

	//Constructores
	
	public Figura() {
		super();
	}

	public Figura(double posicionX, double posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	//Metodo abstracto
	
	protected abstract double calcularArea();
	
}
