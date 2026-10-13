package ejercicios;

import java.util.Scanner;

public class Ejercicios {
	//Variable global
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("\n INICIO del Programa: Ejercicios U2");
		System.out.println("\n\t desarrollado por PPE");
		
		/*EJERCICIO 1:
		 * Escribe un programa que pida un número decimal y lo muestre redondeando 
		 * al número entero más próximo sin utilizar la clase Math. 
		 
		
		//Capturar dato pantalla
		System.out.println("\n Introduce un número decimal: ");
		double numero = entrada.nextDouble();
		//Operación
		int redondeo = (int)(0.5 + numero);
		//Mostrar resultado
		System.out.println(" Redondeo: " + redondeo);
		*/
		
		
		
		/*EJERCICIO 2: 
		 * Escribe un progama que sume, reste, multiplique y divida dos números 
		 * reales introducidos por teclado.
		 
		
		double num1, num2;
		System.out.println("\n Introduce un primer número: ");
		num1= entrada.nextDouble();
		System.out.println("\n Introduce un segundo número: ");
		num2= entrada.nextDouble();
		System.out.println("\tSuma: " + (num1 + num2));
		System.out.println("\tResta: " + (num1 - num2));
		System.out.println("\tMultiplicación: " + (num1 * num2));
		System.out.println("\tDivisión: " + (num1 / num2));
		*/
		
		
		
		/*EJERCICIO 3:
		 * Escribe un programa que calcule la longitud y el área de una circunferencia.
		 
		double radio;
		final double PI = 3.141592;
		System.out.println("¿Cúal es el radio de la circunferencia? ");
		radio = entrada.nextDouble();
		System.out.println("Longitud de la circunferencia: " + (2 * PI * radio));
		System.out.println("Área de la circunferencia: " + (PI * radio*radio));
		*/
		
		
		
		/*EJERCICIO 4:
		 * Escribe un programa que calcule el salario bruto semanal de un empleado en 
		 * base a las horas trabajadas/dia y su tarifa/hora.
		 
		
		double tarifaH;
		int horas, diasSemana;
		System.out.println("¿Cuantas horas al dia? ");
		horas=entrada.nextInt();
		System.out.println("¿Cual es tu tarifa por hora? ");
		tarifaH=entrada.nextDouble();
		System.out.println("¿Cuantos dias a la semana trabajas? ");
		diasSemana=entrada.nextInt();
		System.out.println("salario bruto: " + (horas * tarifaH * diasSemana) + " euros");
		*/
		
		
		
		/*EJERCICIO 5:
		 * Realiza un conversor de Kilobytes a Bytes.
		 * Realiza un conversor de Bytes a Kilobytes. (1KB --> 1024 B)
		 
		
		final int BYTES = 1024;
		System.out.println("\n Número a introducir: ");
		double numero = entrada.nextDouble();
		System.out.println("De kilobytes a bytes: " + (numero * BYTES) + " bytes");
		System.out.println("De bytes a kilobytes: " + (numero / BYTES) + " kilobytes");
		*/
		
		
		/* EJERCICIO 6:
		 * Escribe un programa que pida un número entero al usuario y, como resultado, nos indique
		 * si es par o inpar.
		
		
		System.out.println("\n Número a introducir: ");
		int numero = entrada.nextInt();
		String resultado= numero % 2 == 0?" es par.":" es impar";
		System.out.println("El número "+numero+resultado);
		*/
		
		
		/*EJERCICIO 7:
		 * Escribe un programa que pida un número entero, positivo o negativo, y muestre su valor 
		 * absoluto sin utilizar la clase Math.
		 
		
		System.out.println("\n Introduce un número entero: ");
		int numero = entrada.nextInt();
		int valorAbs= numero < 0? -1 * numero:numero;
		System.out.println("Su valor absoluto es: "+valorAbs);
		*/
		
		
		/*EJERCICIO 8:
		 * Escribe un programa que calcule la nota media redondeada de tres notas (numeros reales)
		 * introducidas por pantalla, sin utilizar la clase Math.
		 
		
		double media, nota1, nota2, nota3;
		System.out.println("Primera nota: ");
		nota1=entrada.nextDouble();
		System.out.println("Segunda nota: ");
		nota2=entrada.nextDouble();
		System.out.println("Tercera nota: ");
		nota3=entrada.nextDouble();
		media= (nota1+nota2+nota3)/3;
		int redondeoM = (int)(0.5 + media);
		System.out.println("La media redondeada de las notas es: " + redondeoM);
		*/
		
		
		/*EJERCICIO 9:
		 *Escribe un programa que pida dos números enteros e indique si el primero es mayor, menor
		 *o igual que el segundo.
		 
		
		int num1, num2;
		System.out.println("Primer número: ");
		num1=entrada.nextInt();
		System.out.println("Segundo número: ");
		num2=entrada.nextInt();
		System.out.println(
				(num1>num2)?"el primer número es mayor":
				(num1<num2)? "El primero número es menor":
				"el primer número es igual que el segundo");
		*/
		
		
		/*EJERCICIO 10:
		 *  Escribe un programa que pida un entero y muestre el carácter que le pertenece según la 
		 *  tabla ASCII, por ejemplo, si introducimos un "97" mostrará una "a".
		 
		System.out.println("Introduce un número entero: ");
		int numero=entrada.nextInt();
		System.out.println("ASCII: " + ((char)numero));
		*/
		
	
		//FIN
		entrada.close();
		System.out.println("\n FIN del Programa");
	
	}

}
