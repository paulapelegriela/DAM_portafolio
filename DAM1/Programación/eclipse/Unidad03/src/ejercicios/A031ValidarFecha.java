package ejercicios;

import java.util.Scanner;

public class A031ValidarFecha {

	/*
	 * *Solicitar fecha: dia (dd), mes (mm), año (yyyy)
	 *Validar fecha: 
			dia > 0 
			mes [1-12]
			año > 0
	 *Validar días/mes:
				28 días: febrero (02)
				30 días: abril (04), junio (06), septiembre (09), noviembre (11)
				31 días: enero (01), marzo (03), mayo (05), julio (07),
				 		 agosto (08), octubre(10), diciembre (12)

	 */ 
	public static void main(String[] args) {
		//Inicio
		System.out.print("\n INICIO del Programa: Validar Fecha");
		System.out.println("\n\t desarrollado por PPE");

		//capturar datos + variables
		int dia, mes, anio;
		boolean fechaCorrecta;
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n Día (dd): ");
		dia=entrada.nextInt();
		System.out.println("\n Mes (mm): ");
		mes=entrada.nextInt();
		System.out.println("\n Año (yyyy): ");
		anio=entrada.nextInt();

		//validar fecha
		fechaCorrecta = true;
		if ((dia<1) || ((mes<1 || mes>12)) || (anio<1) ) {
			fechaCorrecta = false;

		} else {
			switch (mes) {
			case 2:
				if (dia>28) {
					fechaCorrecta = false;
				}
				break;
			case 4,6,9,11:
				if (dia>30) {
					fechaCorrecta = false;
				}
				break;
			default: 
				if (dia>31) {
					fechaCorrecta = false;
				}
				break;
			}

		}//if

		//resultado
		if (fechaCorrecta) {
			System.out.println("\n Fecha correcta: "+ dia+"/"+mes+"/"+anio);
		} else {
			System.err.println("\n Fecha incorrecta: "+ dia+"/"+mes+"/"+anio);
		}

		//FIN
		entrada.close();
		System.out.println("\n FIN del Programa");
	} //main
} //class
