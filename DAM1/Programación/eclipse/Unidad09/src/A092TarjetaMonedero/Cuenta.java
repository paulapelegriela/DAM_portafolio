package A092TarjetaMonedero;

public class Cuenta {

    //atributos

    private String dniTitular;
    private String nombreTitular;
    private double saldoCuenta = 0;
    private double limiteTarjeta = 100;
    private double importeDispuesto = 0;

    //constantes

    public static final String MENSAJE1 = "Importe incorrecto.";
    public static final String MENSAJE2 = "No dispone de saldo suficiente.";
    public static final String MENSAJE3 = "El importe supera el límite disponible.";
    public static final String MENSAJE4 = "Operación, sacar dinero, realizada con éxito.";
    public static final String MENSAJE5 = "Operación, ingresar dinero, realizada con éxito.";

    //constructor

    public Cuenta(String dniTitular,String nombreTitular){
        this.dniTitular = dniTitular;
        this.nombreTitular = nombreTitular;
    }

    //interfaz del menú

    public static void mostrarCabecera(){
        System.out.println("\n***  Cajero Java Bank  ***");
        System.out.println("desarrollado por Paula P.\n");
        System.out.println("        Opciones:");
        System.out.println("        ---------");
        System.out.println("        0 - Salir");
        System.out.println("        1 - Sacar dinero");
        System.out.println("        2 - Ingresar dinero");
        System.out.println("        3 - Consultar saldo");
    }

    //métodos

    public String sacarDinero(double importe,double topeTarjeta){
        if (importe <= 0) {
        	return MENSAJE1;
        }
        else if(saldoCuenta < importe) {
        	return MENSAJE2;
        }
        else if((importeDispuesto + importe) > limiteTarjeta || importe > topeTarjeta) {
        	return MENSAJE3;
        }
        else{ 
        	saldoCuenta -= importe; importeDispuesto += importe; return MENSAJE4; 
        	}
    }

    public String ingresarDinero(double importe){
        if(importe <= 0) return MENSAJE1;
        else{ saldoCuenta += importe; return MENSAJE5; }
    }

    public void consultarSaldo(){

        System.out.println(Color.rojo + "-----------------------");
        System.out.println("|   Cuenta Corriente  |");
        System.out.println("-----------------------");
        System.out.println("Nombre: " + nombreTitular);
        System.out.println("DNI: " + dniTitular);
        System.out.println("Saldo: " + String.format("%.2f", saldoCuenta).replace(".", ","));
        System.out.println("-----------------------" + Color.blanco);

        System.out.println(Color.azul + "| Tarjeta monedero    |");
        System.out.println("-----------------------");
        System.out.println("Límite: " + String.format("%.2f", limiteTarjeta).replace(".", ","));
        System.out.println("Dispuesto: " + String.format("%.2f", importeDispuesto).replace(".", ","));
        System.out.println("-----------------------" + Color.blanco);
    }

    public String getNombreTitular(){ return nombreTitular; }
}//class