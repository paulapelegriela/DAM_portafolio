import java.util.Scanner;

public class ThrowNewException {
	
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String edadString;
		int edadInt;
		String mensaje = "";
			
		
		try {
			do {
				try {
			System.out.println("Introduce tu edad: ");
			edadString = entrada.next();
			edadInt = Integer.parseInt(edadString);
			}
			catch (NumberFormatException e) {
				System.err.println("Entrada no válida!!");
			}
			}while (edadInt <= 0);
			
			if (edadInt < 18) {
				mensaje = "\nLo sentimos, no puede entrar. "
						+ "\nHa de ser mayor de edad ";
			throw new Exception (mensaje);				
			}
			System.out.println("\nBienvenid@ a la fiesta!!");
		} 
			catch(Exception e) {
			System.err.println(e.getMessage() + "\nLe esperamos dentro de " + (18 - edadInt) + ((18 - edadInt) < ? " años";
		}
		finally {
			entrada.close();
	}
 
}
