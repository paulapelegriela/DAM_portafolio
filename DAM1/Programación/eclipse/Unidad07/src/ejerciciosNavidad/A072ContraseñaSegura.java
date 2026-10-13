package ejerciciosNavidad;

import java.util.Scanner;

public class A072ContraseñaSegura {

	// Variables globales
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		inicioPrograma();
		pedirYValidarContrasena();
		finPrograma();

	}// fin main

	// MÓDULOS

	// inicio del programa
	public static void inicioPrograma() {
		System.out.println("Programa: contraseña segura");
		System.out.println("desarrollado por PPE\n");
	}

	// pide la contraseña y lanza la validación
	public static void pedirYValidarContrasena() {

		System.out.print("Introduce una contraseña:");
		String contrasena = entrada.nextLine();

		validarContrasena(contrasena);
	}

	// valida la contraseña y muestra los mensajes
	public static void validarContrasena(String c) {

		boolean mayuscula = false;
		boolean numero = false;

		// longitud
		if (c.length() < 8) {
			System.out.println("\nLa contraseña debe contener al menos 8 caracteres");
		}

		// espacios en blanco
		if (c.contains(" ")) {
			System.out.println("La contraseña contiene caracteres en blanco");
		}

		// recorrido de la contraseña
		for (int i = 0; i < c.length(); i++) {
			char letra = c.charAt(i);

			if (Character.isUpperCase(letra)) {
				mayuscula = true;
			}

			if (Character.isDigit(letra)) {
				numero = true;
			}
		}

		if (!mayuscula) {
			System.out.println("La contraseña debe contener al menos una letra mayúscula");
		}

		if (!numero) {
			System.out.println("La contraseña debe contener al menos un número");
		}

		// si cumple todo
		if (c.length() >= 8 && !c.contains(" ") && mayuscula && numero) {
			System.out.println("\nLa contraseña es segura");
		}
	}

	// fin del programa
	public static void finPrograma() {
		System.out.println("\nFin del programa");
		entrada.close();
	}

}// fin class
