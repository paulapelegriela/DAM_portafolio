package ejercicioEnClase;

import java.util.Scanner;

public class ClaseMain {
	
	//Variables globales
    static final int MIN = 2, MAX = 5;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

    	//Inicio del programa
        inicioPrograma();

        //Solicitamos dos veces un numero y lo guardamos en dos variables
        int filas = OperacionMatriz.solicitarNumero("filas", MIN, MAX, entrada);
        int columnas = OperacionMatriz.solicitarNumero("columnas", MIN, MAX, entrada);
        
        //Creamos las tres matrices
        int[][] matrizA = OperacionMatriz.crearMatriz(filas, columnas);
        int[][] matrizB = OperacionMatriz.crearMatriz(filas, columnas);
        int[][] matrizC = OperacionMatriz.sumarMatrices(matrizA, matrizB);

        //Mostramos las tres matrices
        System.out.println(Color.azul + "\nMatriz A:");
        OperacionMatriz.mostrarMatriz(matrizA, Color.azul);

        System.out.println(Color.azul + "\nMatriz B:");
        OperacionMatriz.mostrarMatriz(matrizB, Color.azul);

        System.out.println(Color.rojo + "\nMatriz C (A + B):");
        OperacionMatriz.mostrarMatriz(matrizC, Color.rojo);

        //Fin del programa
        finPrograma();
    }

    public static void inicioPrograma() {
        System.out.println(Color.blanco + "Inicio del Programa Sumar matrices");
        System.out.println(Color.blanco + "		desarrollado por PPE");
    }

    public static void finPrograma() {
        System.out.println(Color.blanco + "\nFin del Programa");
        entrada.close();
    }
}
