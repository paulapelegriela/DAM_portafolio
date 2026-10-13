
public class ClaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Integer
		 */
		
		MiClaseGenerica<Integer> objetoInt = new MiClaseGenerica<>(-10, -20);
		
		/*
		 * Double
		 */
		MiClaseGenerica<Double> objetoDob = new MiClaseGenerica<>(-10.5, -20.5);
		
		/*
		 * String
		 */
		MiClaseGenerica<String> objetoStr = new MiClaseGenerica<>("Paula", " Pelegri");
		
		//Mostrar objetos int
		System.out.println("\nTipo de dato Integer");
		System.out.println("\nOperando1: " + objetoInt.getOperando1());
		System.out.println("Operando2: " + objetoInt.getOperando2());
		
		//Mostrar objetos double
		System.out.println("\nTipo de dato Double");
		System.out.println("\nOperando1: " + objetoDob.getOperando1());
		System.out.println("Operando2: " + objetoDob.getOperando2());

		//Mostrar objetos String
		System.out.println("\nTipo de dato String");
		System.out.println("\nOperando1: " + objetoStr.getOperando1());
		System.out.println("Operando2: " + objetoStr.getOperando2());	
		
		//Sumar operandos enteros
		System.out.println("\nSuma de operadores de tipo Integer: " +
		(objetoInt.getOperando1()+objetoInt.getOperando2()));
		
		//Sumar operandos enteros
		System.out.println("\nSuma de operadores de tipo Double: " +
		(objetoDob.getOperando1()+objetoDob.getOperando2()));
		
		//Sumar de enteros y decimales
		System.out.println("\nSuma de los operandos 1 de ambos: " +
		(objetoInt.getOperando1()+objetoDob.getOperando1()));
		System.out.println("\nSuma de los operandos 2 de ambos: " +
		(objetoInt.getOperando2()+objetoDob.getOperando2()));
		
		//Concatenación de cadenas
		System.out.println("\nConcatenación de cadenas: " +
		(objetoStr.getOperando1()+objetoStr.getOperando2()));
	}

}
