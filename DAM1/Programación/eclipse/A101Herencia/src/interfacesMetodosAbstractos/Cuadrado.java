package interfacesMetodosAbstractos;

public class Cuadrado implements IFigura, IDibujar{

	protected double lado;

	//Contructores
	
	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}
	//Metodos abstractos
		
	@Override
	public void dibujar() {
		System.out.println("Estoy dibujando un cuadrado.");
	}
	
	@Override
	public double calcularArea() {
		double resultado = lado * lado;
		return resultado;
	}

}
