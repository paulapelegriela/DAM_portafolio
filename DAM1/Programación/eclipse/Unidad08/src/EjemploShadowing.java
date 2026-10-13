
public class EjemploShadowing {
	
	private int base= 10; //Variable de instancia
	
	public void metodoEjemplo() {
		
		int base = 20; //Variable local que hace shadowing a la variable de instancia
		
		System.out.println("Valor de base dentro del método: " + base);
		System.out.println("Valor de base fuera del método: " + this.base);
		
	}//fin metodoEjemplo
	
	public static void main(String[] args) {
		
		EjemploShadowing ejemplo = new EjemploShadowing();
		ejemplo.metodoEjemplo();

	}//main

}//class
