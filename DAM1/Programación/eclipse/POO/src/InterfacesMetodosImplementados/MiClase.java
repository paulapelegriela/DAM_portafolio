package InterfacesMetodosImplementados;

public class MiClase implements IInterface2 {

	@Override
	public void saludar() {
		System.out.println("\nHOLA, soy un método SIN IMPLEMENTAR (abstracto) de IInterface1.");
		System.out.println("\tHe sido implementado en MiClase.");
	}
	
	@Override
	public void despedir() {
		System.out.println("\nADIÓS, soy un método SIN IMPLEMENTAR (abstracto) de IInterface2.");
		System.out.println("\tHe sido implementado en MiClase.");
	}
}
