package ejerciciosNavidad;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A071CajaRegistradora {

	//Variables globales
	static Scanner entrada = new Scanner(System.in);
	static DecimalFormat dec = new DecimalFormat("#0.00");
	public static void main(String[] args) {
		
		inicioPrograma();
		
		char continuar;

		do {
			double importe = leerMontoI(Color.blanco + "Importe: \n");

			double pagado = leerMontoP(Color.blanco + "Pagado: \n");
			
			mostrarResultado(importe, pagado);

			System.out.print(Color.blanco + "\nContinuar (s/n):\n");
			continuar = entrada.next().charAt(0);

		} while (continuar == 's');
		
		finPrograma();
		
	} //fin del main
	
	//MÓDULOS

	//inicio del programa

	public static void inicioPrograma() {
		System.out.println( "\n INICIO del Programa: caja registradora");
		System.out.println("\t desarrollado por PPE");
	}
	
	//Exception try-catch para que sea un numero
	private static double leerMontoI(String importe) {
		String cantidad = "";
		double monto = 0;
		
		do {
			try {
				System.out.println(importe);
				//Hasta encontrar un espacio en blanco
				cantidad = entrada.next();
				//Convertir string a double
				monto = Double.parseDouble(cantidad);
			}
			
			catch (Exception e) {
				System.err.println(Color.rojo + "\t\t Entrada incorrecta.");
			}
		}while (monto <= 0);
		
		return monto;
	}
	
	private static double leerMontoP(String pagado) {
		String cantidad = "";
		double monto = 0;
		
		do {
			try {
				System.out.println(pagado);
				//Hasta encontrar un espacio en blanco
				cantidad = entrada.next();
				//Convertir string a double
				monto = Double.parseDouble(cantidad);
			}
			
			catch (Exception e) {
				System.err.println(Color.rojo + "\t\t Entrada incorrecta.");
			}
		}while (monto <= 0);
		
		return monto;
	}
	
	
	// Muestra el resultado segun el pago realizado
	public static void mostrarResultado(double importe, double pagado) {

		if (pagado > importe) {
			final double cambio = pagado - importe;
			System.out.printf( Color.azul + " => CAMBIO: \n" + dec.format(cambio));

			desglosarCambio(cambio);
			
		} else if (pagado < importe) {
			double falta = importe - pagado;
			System.out.printf( Color.rojo + " => FALTAN: \n" +  dec.format(falta));

		} else {
			System.out.println(Color.verde + " => EXACTO");
		}
		
	}
	
	public static void desglosarCambio(double cambio) {
		
		  double resto = cambio;
		  int billete100, billete50, billete20, billete10, billete5, moneda2;
		 
		  billete100 = (int)(resto/100);
		  resto = resto % 100;

		  billete50 = (int)(resto/50);
		  resto = resto % 50;
		  
		  billete20 = (int)(resto/20);
		  resto = resto % 20;
		  
		  billete10 = (int)(resto/10); 
		  resto = resto % 10;
		  
		  billete5 = (int)(resto/5);
		  resto = resto % 5;
		  
		  moneda2 = (int)(resto/2);
		  
		  //Calderilla
		  resto = resto % 2;
		  
		  if (billete100 > 0) System.out.println(Color.verde + "Billetes 100: " + billete100);
		  if (billete50 > 0) System.out.println(Color.amarillo + "Billetes 50: " + billete50);
		  if (billete20 > 0) System.out.println(Color.azul + "Billetes 20: " + billete20);
		  if (billete10 > 0) System.out.println(Color.rojo + "Billetes 10: " + billete10);
		  if (billete5 > 0) System.out.println(Color.celeste + "Billetes 5: " + billete5);
		  if (moneda2 > 0) System.out.println(Color.blanco + "Monedas 2: " + moneda2);
		  if (resto > 0) System.out.println(Color.rojo + "Calderilla: " + dec.format(resto));
		    
		}
	
	// fin del programa
	
	public static void finPrograma() {
		System.out.println("\n FIN del Programa");
		entrada.close();
	}
	
}//class