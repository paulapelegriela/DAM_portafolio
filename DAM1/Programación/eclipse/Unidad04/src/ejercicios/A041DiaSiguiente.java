package ejercicios;

import java.util.Scanner;

public class A041DiaSiguiente {

	// Variables globales
	static int dia, mes, anio;
	static boolean fechaCorrecta;
	static Scanner entrada = new Scanner(System.in);

	//inicio main 
	public static void main(String[] args) {
		
		inicioPrograma();
		
		capturarDatosPantalla();
		fechaCorrecta = validarFecha();
		mostrarResultado();
		
		if (fechaCorrecta) {
			calcularDiaSiguiente();
			mostrarDiaSiguiente();
		}
		
		finPrograma();
	}//fin main

	//módulos

	public static void inicioPrograma() {
		System.out.println("\n INICIO del Programa: Día Siguiente");
		System.out.println("\t desarrollado por PPE");
	}

	public static void capturarDatosPantalla() {

		System.out.print("\n Día (dd): ");
		dia = entrada.nextInt();

		System.out.print("\n Mes (mm): ");
		mes = entrada.nextInt();

		System.out.print("\n Año (yyyy): ");
		anio = entrada.nextInt();
	}

	public static boolean validarFecha() {
		if (dia < 1 || mes < 1 || mes > 12 || anio < 1) {
			return false;
		}

		switch (mes) {
			case 2:
				return dia <= 28;
			case 4: case 6: case 9: case 11:
				return dia <= 30;
			default:
				return dia <= 31;
		}
	}

	public static void mostrarResultado() {
		if (fechaCorrecta) {
			System.out.println("\n Fecha correcta: " + dia + "/" + mes + "/" + anio);
		} else {
			System.err.println("\n Fecha incorrecta: " + dia + "/" + mes + "/" + anio);
		}
	}

	public static void calcularDiaSiguiente() {
		dia++; 
		
		//cambio de mes
		switch (mes) {
			case 2:
				if (dia > 28) {
					dia = 1;
					mes++;
				}
				break;
			case 4,6,9,11:
				if (dia > 30) {
					dia = 1;
					mes++;
				}
				break;
			default:
				if (dia > 31) {
					dia = 1;
					mes++;
				}
				break;
		}
		//cambio de año
		if (mes > 12) {
			mes = 1;
			anio++;
		}
	}

	public static void mostrarDiaSiguiente() {
		System.out.println(" Día siguiente: " + dia + "/" + mes + "/" + anio);
	}

	public static void finPrograma() {
		System.out.println("\n FIN del Programa");
		entrada.close();
	}
}//class
