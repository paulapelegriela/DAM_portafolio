package InterfacesMetodosImplementados;

public interface IInterface1 {

	/**
	 * MÉTODOS IMPLEMENTADOS
	 */
	
	/*
	 * Métodos ESTÁTICOS
	 * No se puede sobreescribir
	 * Se llaman a través del nombre de la interface
	 * Se declaran con "static"
	 */
	
	public static void metodoEstatico() {
		System.out.println("\nSoy un método ESTÁTICO de IInterface1.");
	}
	
	/*
	 * Méetodos POR DEFECTO
	 * Tienen implementación
	 * Pueden ser sobrescritos
	 * Se declaran con "default"
	 */
	
	public default void metodoPorDefecto() {
		System.out.println("\nSoy un método POR DEFECTO de IInterface1.");
		metodoPrivado();
	}
	
	/*
	 * Méetodos PRIVADOS
	 * Son llamados desde otros métodos de la interface
	 * No se pueden llamar desde fuera de la interface
	 * Se declaran con "private"
	 */
	
	private void metodoPrivado() {
		System.out.println("\tSoy un método PRIVADO de IInterface1.");
		System.out.println("\tHe sido llamado desde un método por defecto");
	}
	
	//Método SIN IMPLEMENTAR (abstractos)
	public abstract void saludar();
	
}
