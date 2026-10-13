
public class MiClaseGenerica <T> {

	//Atributo
	private T operando1, operando2;

	//Constructores
	public MiClaseGenerica() {
		super();
	}

	public MiClaseGenerica(T operando1, T operando2) {
		super();
		this.operando1 = operando1;
		this.operando2 = operando2;
	}

	//Getters y setters
	public T getOperando1() {
		return operando1;
	}
	public void setOperando1(T operando1) {
		this.operando1 = operando1;
	}

	public T getOperando2() {
		return operando2;
	}
	public void setOperando2(T operando2) {
		this.operando2 = operando2;
	}
	
	//Mostrar tipo de dato del operando1
	public String mostrarInformacion() {
		return (operando1.getClass().getSimpleName());
	}
	
	
}
