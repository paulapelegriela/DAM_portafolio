package cuaderno;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularNotaMediaPPE {
	//Variable global
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("\n INICIO del PROGRAMA: CalcularNotaMediaPPE U6");
		System.out.println("\n\t desarrollado por PPE");
		
		//Variables
		int numNotas;
		
		
		//Formatear decimales
		DecimalFormat dec = new DecimalFormat("#.##");
		
		//Solicitar num total
		do {
			System.out.println("\n Introduce el numero total de notas: ");
			numNotas=entrada.nextInt();
		}while(numNotas <= 0);
		
		//construir tabla
		double [] notas =new double [numNotas];
		
		//Solicitar notas
		double suma = 0;
		for (int i=0;i<notas.length;i++) {
			System.out.println("Nota ("+(i+1) +"): ");
			notas[i]= entrada.nextDouble();
			suma = suma + notas[i];
		}
		//Mostrar tabla
		//System.out.println(Arrays.toString(notas));
		
		//Mostrar nota (con un for-each)
		int i=1;
		for (double nota:notas) {
			System.out.println("Nota (" +i+ "): "+ dec.format(nota) + ";");
			i++;
		}
		
		
		//Mostrar media
		double media = suma/numNotas;
		System.out.println("\nNota media: " + dec.format(media));
		
		//Nota redondeada
		int redondeo = (int)(media +0.5);
		System.out.println("Nota final redondeada: " + redondeo);
		
		//FIN
		entrada.close();
		System.out.println("\n FIN del Programa");
	}
}
