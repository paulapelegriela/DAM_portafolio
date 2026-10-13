package palabraStatic;

public class ClaseMain {

	public static void main(String[] args) {
		// Crear coches
		
		Coche coche1=new Coche("XYZ123", "Tiaf", 30000, "Azul");
		Coche coche2=new Coche("XYZ234", "Dorf", 40000, "Rojo");
		Coche coche3=new Coche("XYZ345", "Geupot", 60000, "Azul");
		Coche coche4=new Coche("XYZ456", "Tiaf", 20000, "Verde");
		
		//Mostrar coches
		System.out.println("\nCoches");
		System.out.println("------");
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(coche3);
		System.out.println(coche4);
		
		//Primer descuento
		//Con el static, no hace falta cambiar objeto por objeto.
		Coche.setDcto(10);
		/*
		coche1.setDcto(10);
		coche2.setDcto(10);
		coche3.setDcto(10);
		coche4.setDcto(10);
		*/
		
		//Aplicar primer descuento
		System.out.println("\nPrecio 1er descuento (10%)");
		System.out.println("--------------------------\n");
		coche1.mostrarPrecio(coche1);
		coche2.mostrarPrecio(coche2);
		coche3.mostrarPrecio(coche3);
		coche4.mostrarPrecio(coche4);
		
		
		//Segundo descuento
		Coche.setDcto(20);
		/*
		coche1.setDcto(20);
		coche2.setDcto(20);
		coche3.setDcto(20);
		coche4.setDcto(20);
		*/
		//Aplicar segundo descuento
		System.out.println("\nPrecio 2ndo descuento (20%)");
		System.out.println("---------------------------\n");
		coche1.mostrarPrecio(coche1);
		coche2.mostrarPrecio(coche2);
		coche3.mostrarPrecio(coche3);
		coche4.mostrarPrecio(coche4);
		
	}

}
