package ejerciciosNavidad;

import java.util.Scanner;

public class A073ArrayBidimensional {

	// Variables globales
	static Scanner entrada = new Scanner(System.in);
	static int[][] matriz = new int[3][5];

	public static void main(String[] args) {

		inicioPrograma();

		rellenarMatriz();
		mostrarMatriz();

		finPrograma();

	}// fin main

	// inicio del programa
	public static void inicioPrograma() {
		System.out.println("Programa: matriz de enteros aleatorios");
		System.out.println("\tdesarrollado por PPE\n");
		System.out.println("\tMatriz (3x5)\n");
	}

	// rellena la matriz con numeros aleatorios entre 1 y 10
	public static void rellenarMatriz() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
	}

	// muestra la matriz con formato, sumas de filas y columnas
	public static void mostrarMatriz() {

		int[] sumaColumnas = new int[5];
		int total = 0;

		System.out.println("\t--------------------------");

		for (int i = 0; i < matriz.length; i++) {
			int sumaFila = 0;
			System.out.print("\t|");

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.printf(" %02d |", matriz[i][j]);
				sumaFila += matriz[i][j];
				sumaColumnas[j] += matriz[i][j];
			}

			System.out.println("  Fila " + (i + 1) + " = " + sumaFila);
			System.out.println("\t--------------------------");
		}

		System.out.print("\n\t|");

		for (int j = 0; j < sumaColumnas.length; j++) {
			System.out.printf(" %02d |", sumaColumnas[j]);
			total += sumaColumnas[j];
		}

		System.out.println("  Total = " + total);
	}

	// fin del programa
	public static void finPrograma() {
		System.out.println("\nFin del programa");
		entrada.close();
	}

}// fin class
