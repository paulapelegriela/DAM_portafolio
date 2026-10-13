package interfacesMetodosAbstractos;

public class Circulo implements IFigura, IDibujar, IRotar {

	protected double radio;
	
	//Constructores
	
		public Circulo() {
			super();
		}

		public Circulo(double radio) {
			this.radio = radio;
		}
		@Override
		public double calcularArea() {
			double resultado = Math.PI * radio * radio;
			return resultado;
		}
		
		@Override
		public void dibujar() {
			System.out.println("Estoy dibujando un circulo.");
		}
		@Override
		public void rotar() {
			System.out.println("Estoy rotando un circulo.");
		}
}
