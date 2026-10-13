package cuaderno;

import java.util.Scanner;
import java.util.Random;

public class A061ManejoDeArrays {

	//Variable global
	
	static int [] tabla;
	static int l_inferior;
	static int l_superior;
	static Scanner entrada = new Scanner(System.in);
	static Random aleatorio = new Random();
	//inicio main 
	
	public static void main(String[] args) {
		
		inicioPrograma();
		declararConstruirTabla();
		capturarIntervalos();
		aleatoriosPares();
		ordenAscendente();
		aleatoriosImpares();
		ordenDescendente();
		
		finPrograma();

	}//fin main
		
		
		//MÓDULOS

		//inicio del programa
	
		public static void inicioPrograma() {
			System.out.println("\n INICIO del Programa: Manejo de Arrays");
			System.out.println("\t desarrollado por PPE");
		}
		
		public static void declararConstruirTabla() {
		    int num_elementos;

		    do {
		        System.out.print("\nIntroduce número de elementos (>0): ");
		        num_elementos = entrada.nextInt();

		        if (num_elementos <= 0) {
		            System.out.println("ERROR: el número debe ser mayor que 0.");
		        }

		    } while (num_elementos <= 0);

		    tabla = new int[num_elementos];
		}
			
		
		public static void capturarIntervalos() {

		    System.out.print("\nDesde: ");
		    l_inferior = entrada.nextInt();

		    do {
		        System.out.print("Hasta: ");
		        l_superior = entrada.nextInt();

		        if (l_superior <= l_inferior) {
		            System.out.println("ERROR: el límite superior debe ser mayor que el inferior.");
		        }

		    } while (l_superior <= l_inferior);

		    System.out.println();
		}
		
		public static void aleatoriosPares() {

		    System.out.println("Tabla con " + tabla.length + 
		                       " aleatorios PARES entre " + l_inferior + " y " + l_superior + ":");

		    // Rellenar la tabla con pares usando 'Math.random'
		    
		    for (int i = 0; i < tabla.length; i++) {

		        int num;
		        do {
		            num = l_inferior + (int)(Math.random() * (l_superior - l_inferior + 1));
		        } while (num % 2 != 0);  // repite el bucle hasta que el numero sea par

		        tabla[i] = num;
		    }

		    // Mostrar con for-each
		    
		    for (int valor : tabla) {
		        System.out.print("[" + valor + "] ");
		    }
		    System.out.println();

		    // Mostrar en orden inverso
		    
		    System.out.println("En orden inverso:");
		    for (int i = tabla.length - 1; i >= 0; i--) {
		        System.out.print("[" + tabla[i] + "] ");
		    }
		    System.out.println("\n");
		}
		
		public static void ordenAscendente() {

		    // Ordenar con burbuja ascendente
			
		    for (int i = 0; i < tabla.length - 1; i++) {
		        for (int j = 0; j < tabla.length - 1 - i; j++) {
		            if (tabla[j] > tabla[j + 1]) {
		                int aux = tabla[j];
		                tabla[j] = tabla[j + 1];
		                tabla[j + 1] = aux;
		            }
		        }
		    }

		    // Mostrar con for-each
		    
		    System.out.println("En orden ASC:");
		    for (int valor : tabla) {
		        System.out.print("[" + valor + "] ");
		    }
		    System.out.println();

		    // Mostrar menor 
		    
		    System.out.println("\nEl número menor es: " + tabla[0]);

		    // Mostrar mayor
		    
		    System.out.println("El número mayor es: " + tabla[tabla.length - 1]);

		    System.out.println();
		}

		public static void aleatoriosImpares() {

		    System.out.println("Tabla con " + tabla.length +
		                       " aleatorios IMPARES entre " + l_inferior + " y " + l_superior + ":");

		    // Rellenar la tabla con impares usando 'Random'
		    
		    for (int i = 0; i < tabla.length; i++) {

		        int num;
		        do {
		            num = l_inferior + aleatorio.nextInt(l_superior - l_inferior + 1);
		        } while (num % 2 == 0);   // repetir el bucle hasta que sea impar

		        tabla[i] = num;
		    }

		    // Mostrarlo con un for normal
		    
		    for (int i = 0; i < tabla.length; i++) {
		        System.out.print("[" + tabla[i] + "] ");
		    }
		    System.out.println();

		    // Mostrarlo en orden inverso
		    
		    System.out.println("En orden inverso:");
		    for (int i = tabla.length - 1; i >= 0; i--) {
		        System.out.print("[" + tabla[i] + "] ");
		    }
		    System.out.println("\n");
		}
		
		public static void ordenDescendente() {

		    // Ordenarlo con burbuja descendente
		    for (int i = 0; i < tabla.length - 1; i++) {
		        for (int j = 0; j < tabla.length - 1 - i; j++) {
		            if (tabla[j] < tabla[j + 1]) {   // gira el orden (al reves)
		                int aux = tabla[j];
		                tabla[j] = tabla[j + 1];
		                tabla[j + 1] = aux;
		            }
		        }
		    }

		    // Mostrar con for normal
		    
		    System.out.println("En orden DESC:");
		    for (int i = 0; i < tabla.length; i++) {
		        System.out.print("[" + tabla[i] + "] ");
		    }
		    System.out.println();

		    // Mostrar menor
		    
		    System.out.println("\nEl número menor es: " + tabla[tabla.length - 1]);

		    // Mostrar mayor 
		    
		    System.out.println("El número mayor es: " + tabla[0]);
		}
		
		// fin del programa
		
		public static void finPrograma() {
			System.out.println("\n FIN del Programa");
			entrada.close();
		}

}//fin class