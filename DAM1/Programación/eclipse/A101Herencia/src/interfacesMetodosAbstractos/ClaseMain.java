package interfacesMetodosAbstractos;

import java.text.DecimalFormat;


public class ClaseMain {
public static void main(String[] args) {
		
		DecimalFormat dec = new DecimalFormat("##.00");
		
		//Objeto de tipo cuadrado
		Cuadrado cuadrado1 = new Cuadrado (3.1);
		//Area del cuadrado
		System.out.println("\n--------- CUADRADO ----------");
		System.out.println("Lado = "+dec.format(cuadrado1.lado));
		System.out.println("El área del cuadrado es: " + dec.format(cuadrado1.calcularArea()));
		cuadrado1.dibujar();
		
		Circulo circulo1 = new Circulo (2.1);
		
		//Area del circulo
		System.out.println("\n--------- CIRCULO -----------");
		System.out.println("Radio = "+dec.format(circulo1.radio));
		System.out.println("El área del circulo es: " + dec.format(circulo1.calcularArea()));
		circulo1.dibujar();
		circulo1.rotar();
		System.out.println("\n-----------------------------");
	}
}
