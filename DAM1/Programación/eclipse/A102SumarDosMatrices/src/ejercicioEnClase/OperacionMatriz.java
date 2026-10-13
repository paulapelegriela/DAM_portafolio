package ejercicioEnClase;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperacionMatriz {
	
	//Variable global
	static final DecimalFormat dec = new DecimalFormat("00");
    
	//Pedir número
	public static int solicitarNumero(String tipo, int min, int max, Scanner entrada) {

	    int num;
	    //Elegir entre dos tipos seleccionados en el main: filas o columnas
	    do {
	        System.out.print(Color.blanco + "\nCantidad de " + tipo + " [" + min + ".." + max + "]: ");
	        num = entrada.nextInt();

	        if (num < min || num > max) {
	            System.err.println(Color.rojo + "Error: te has salido de los límites (" + min + " - " + max + ")");
	        }

	    } while (num < min || num > max);

	    return num;
	}

    //Crear matriz con Math random
    public static int[][] crearMatriz(int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        return matriz;
    }

    //Sumar matrices A y B
    public static int[][] sumarMatrices(int[][] A, int[][] B) {

        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    //Mostrar matriz 
    public static void mostrarMatriz(int[][] matriz, String color) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(color + "| ");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(dec.format(matriz[i][j]) + " | ");
            }

            System.out.println();
        }
    }
}
