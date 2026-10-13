package A092TarjetaMonedero;

import java.util.Scanner;

public class ClaseMain {

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		final double TOPE_TARJETA = 60.0; //constante

		//variables
		int opcionUsuario;
		double importeOperacion;

		//crear la cuenta
		System.out.println("Introduce DNI:");
		String dniTitular = entrada.nextLine();

		System.out.println("Introduce Nombre:");
		String nombreTitular = entrada.nextLine();

		Cuenta cuentaUsuario = new Cuenta(dniTitular,nombreTitular);

		System.out.println("\nCuenta creada correctamente.");

		//menú de opciones

		do{

			Cuenta.mostrarCabecera();

			System.out.println("\nIntroduzca opci�n:");
			opcionUsuario = entrada.nextInt();

			switch(opcionUsuario){

			case 1:
				System.out.println("Introduzca importe:");
				importeOperacion = entrada.nextDouble();

				String resultadoSacar = cuentaUsuario.sacarDinero(importeOperacion,TOPE_TARJETA);

				if(resultadoSacar.equals(Cuenta.MENSAJE4)) {
					System.out.println(Color.azul + resultadoSacar + Color.blanco);
				}

				else {
					System.out.println(Color.rojo + resultadoSacar + Color.blanco);
				}
				break;


			case 2:
				System.out.println("Introduzca importe:");
				importeOperacion = entrada.nextDouble();

				String resultadoIngresar = cuentaUsuario.ingresarDinero(importeOperacion);

				if(resultadoIngresar.equals(Cuenta.MENSAJE5)) { 
					System.out.println(Color.azul + resultadoIngresar + Color.blanco);
				}

				else {
					System.out.println(Color.rojo + resultadoIngresar + Color.blanco);
				}
				break;


			case 3:
				cuentaUsuario.consultarSaldo();
				break;

			case 0:
				System.out.println(Color.azul + "\n¡HASTA PRONTO " 
						+ cuentaUsuario.getNombreTitular().toUpperCase() + "!" + Color.blanco);

				entrada.close();
				break;

			}//switch

		}while(opcionUsuario != 0);
	}//main
}//class