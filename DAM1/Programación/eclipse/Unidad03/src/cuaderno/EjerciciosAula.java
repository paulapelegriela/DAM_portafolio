package cuaderno;

import java.util.Scanner;

public class EjerciciosAula {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("\n INICIO del Programa: Ejercicios U3");
		System.out.println("\n\t desarrollado por PPE");
		
		/*IF, ELSE --> Ejercicio1 en clase: decir si un numero es un byte 
		 * (en un rango de -128, ..., 127) si no, que salga error.
		 * 
		 
		System.out.println("Introduce un numero entero");
		int numero=entrada.nextInt();
		if (numero >= -128 && numero <= 127) {
			System.out.println("El número es un byte");
		}else {
			System.err.println("Error");
		}
		*/
		
		
		/*IF, ELSE --> Ejercicio2 en clase: decir si un numero es positivo, negativo o 0
		 * 
		 
		
		System.out.println("\n Introduce un número entero: ");
		int numero = entrada.nextInt();
		if (numero > 0) {
			System.out.println("Es positivo");
			
		}else {
		if (numero < 0) {
			System.out.println("Es negativo");
		}
		else {
			System.out.println("Es cero");
		}
		}
		*/
		
		/*IF, ELSE --> Ejercicio3 en clase: comprobar si un numero es un digito, una letra mayusc
		 *  o una letra minusc.
		 
		
		System.out.println("Introduce un caracter: ");
		String cadena=entrada.nextLine();
		char caracter=cadena.charAt(0);
		int num=(int)caracter;
		if (num >= 48 && num <= 57) {
			System.out.println("Es un dígito");
		}
		if (num >= 65 && num <= 90) {
			System.out.println("Es una mayuscula, el numero ASCII: " + num);
		}
		if (num >= 97 && num <= 122) {
			System.out.println("Es una minuscula, el numero ASCII: " + num);
		}
		*/
		
		/* SWITCH--> Ejercicio4 en clase: q escriba un num entero 1-10 y de su num romano.
		 * 
		 
		
		System.out.println("Introduce un número: ");
		int num=entrada.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		case 6:
			System.out.println("VI");
			break;
		case 7:
			System.out.println("VII");
			break;
		case 8:
			System.out.println("VIII");
			break;
		case 9:
			System.out.println("IX");
			break;
		case 10:
			System.out.println("X");
			break;
			
		default:
			System.err.println("ERROR: número incorrecto");
		}
		*/
		
		/* BUCLES: WHILE --> escribir ¡Bienvenidos! en la pantalla 10 veces.
		 * 
		 
		int cont=0;
		while (cont < 10) {
			System.out.println("¡Bienvenidos!");
			cont ++;
		}
		*/
		/* (copiar del proyector) cual es el resultado final x?
		 * 
		 
		int x = 1;
		int i = 1;
		while (i <= 4) {
			x = x+ 2*i;
			i++;
		}
		System.out.println("Resultado final de x: " +x);
		*/
		
		/* Ejercicio DO-WHILE + SWITCH
		 * 
		
		int num;
		do {
			System.out.println("Introduce un número para decirte \n el dia de la semana: ");
			num=entrada.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("\tLunes");
				break;
			case 2:
				System.out.println("\tMartes");
				break;
			case 3:
				System.out.println("\tMiercoles");
				break;
			case 4:
				System.out.println("\tJueves");
				break;
			case 5:
				System.out.println("\tViernes");
				break;
			case 6:
				System.out.println("\tSabado");
				break;
			case 7:
				System.out.println("\tDomingo");
				break;
			default:
				System.err.println("ERROR: dia de la semana incorrecta");
			}
			
		}while(num>=1 && num<=7);
		
		 */
		/*El abecedario con los tres bucles: WHILE, DO-WHILE y FOR
		 * 
		 
		
		char abc;
		
		
		abc=97;
		System.out.println("\n WHILE");
		while (abc>=97 && abc<=122) {
			System.out.print(" " + abc);
			abc ++;
		}
		System.out.println();
		
		System.out.println("\n DO-WHILE");
		abc=97;
		do {
			System.out.print(" " + abc);
			abc ++;
		}while(abc>=97 && abc<=122);
		System.out.println();
			
		System.out.println("\n FOR");
		for (abc=97;abc<=122;abc++) {
			System.out.print(" " + abc);
		}
		System.out.println();
		*/
		
		
		//FIN
		entrada.close();
		System.out.println("\n FIN del Programa");
	}//main
}//class 
