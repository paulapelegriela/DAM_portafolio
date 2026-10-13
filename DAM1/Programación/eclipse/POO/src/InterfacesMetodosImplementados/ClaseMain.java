package InterfacesMetodosImplementados;

public class ClaseMain {

	public static void main(String[] args) {
		
		/*
		 * Método ESTÁTICO
		 */
		
		IInterface1.metodoEstatico();
		
		/*
		 * Método POR DEFECTO
		 */

		//Creamos objeto de MiClase
		MiClase miclase = new MiClase();
		
		//Método por defecto
		miclase.metodoPorDefecto();
		
		/*
		 * Método SIN IMPLEMENTAR e implementados en MiClsse
		 */
		//Declarado en IInterface1
		miclase.saludar();
		
		//Declarado en IInterface2
		miclase.despedir();
	}

}
