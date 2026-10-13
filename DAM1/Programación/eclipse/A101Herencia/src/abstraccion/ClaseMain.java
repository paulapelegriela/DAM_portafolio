package abstraccion;

import java.text.DecimalFormat;
public class ClaseMain {

	public static void main(String[] args) {
		
		DecimalFormat dec = new DecimalFormat("##.00");
		
		//Objeto de tipo cuadrado
		
		Figura cuadrado1 = new Cuadrado (0,0,2);

		//Area del cuadrado
		System.out.println("\n-----------------------");
		System.out.println("El área del cuadrado es: " + dec.format(cuadrado1.calcularArea()));
		System.out.println("\n-----------------------");
		//Objeto de tipo circulo
		
		Figura circulo1 = new Circulo (0,0,2);
		
		//Area del circulo
		System.out.println("\n-----------------------");
		System.out.println("El área del circulo es: " + dec.format(circulo1.calcularArea()));
		System.out.println("\n-----------------------");
	}

}
