/**
 *  MCD
 */
package mcd;

import java.util.Scanner;

/**
 * Calcular el Maximo Comun Divisor de dos numeros.
 * MCD (a,b)
 */
public class MaximoComunDivisor {

	static int num1, num2, resultado;
	static String mensaje;
	static Scanner entrada = new Scanner(System.in);

	/**
	 * Metodo main
	 * @param args
	 */
	public static void main(String[] args) {

		//Inicio programa

		inicioPrograma();

		//capturar numeros pantalla
		mensaje = "\n Primer numero: ";
		num1= capturarNumeros(mensaje);

		mensaje = "\n Segundo numero: ";
		num2= capturarNumeros(mensaje);

		//Calcular MCD

		resultado = mcd(num1, num2);

		//Mostrar resultado

		mostrarResultado();

		//Fin de programa

		finPrograma();
	}//main


	/**
	 * Inicio de programa
	 */
	private static void inicioPrograma() {
		System.out.println( "\n INICIO del Programa: MCD de 2 numeros");
		System.out.println("\t desarrollado por PPE");
	}

	/**
	 * Cspturar los dos numeros de pantalla
	 * @param texto - recibe Primer numero / Segundo numero
	 * @return - devuelve número introducido por pantalla
	 */
	private static int capturarNumeros(String texto) {
		int num;

		do {
			System.out.println(texto);
			num = entrada.nextInt();
		}while(num <=1);
		return num;
	}

	/**
	 * Calcular MCD de dos numeros
	 * @param n1
	 * @param n2
	 * @return - MCD de dos numeros
	 */

	private static int mcd(int n1, int n2){

		if (n1 == 0)
			return n2; //Primer caso base
		else if (n2 == 0)
			return n1; //Segundo caso base
		else {
			int min = n1 <= n2 ? n1 : n2; //minimo entre n1 y n2
			int max = n1 <= n2 ? n2 : n1; //maximo entre n1 y n2
			return mcd(min, max-min);
		}
	} //mcd

	/**
	 * Mostrar resultado 
	 * Muestra el MCD (a,b)
	 */

	private static void mostrarResultado() {
		System.out.println("\n\t MCD (" + num1 + "," + num2 + ")= " + resultado);
	}

	/**
	 * Fin de programa
	 */
	private static void finPrograma() {
		System.out.println("\n FIN del Programa");
		entrada.close();
	}
}//class
