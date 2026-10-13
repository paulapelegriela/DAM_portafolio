package ejercicios;

import java.util.Scanner;

public class A042AdivinaNumero {


	/*
	Clase Math
	int aleatorio = (int)(Math.random()*(hasta-desde+1) + desde);
	--------------------------------------------------------------
	Class Random
	Random rd = new Random();
	int aleatorio = rd.nextInt(hasta-desde+1) + desde;
	 */

	public static void main(String[] args) {

		//Inicio
		System.out.print("\n INICIO del Programa: Validar Fecha");
		System.out.println("\n\t desarrollado por PPE");

		//Variables
		int desde = 1, hasta = 100, intentos = 0, miNumero;

		//Numero aleatorio

		
		int aleatorio = (int)(Math.random()*(hasta-desde+1) + desde);

		//Solicitar número
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n Introduce un número entre el "+ desde + " y el " + hasta);

		//Buscar número

		do {
			intentos ++;
			miNumero= entrada.nextInt();
			if (miNumero>aleatorio) {
				System.out.println("Mas bajo");
			}else {
				if (miNumero<aleatorio) {
					System.out.println("Mas alto");
				}
			}
		}while(miNumero!=aleatorio);

		//Prueba superada

		System.out.println("\n ¡¡¡ENHORABUENA!!!," + "\n conseguido en " + intentos + " intentos");
		//FIN
		entrada.close();
		System.out.println("\n FIN del Programa");
	}
}
