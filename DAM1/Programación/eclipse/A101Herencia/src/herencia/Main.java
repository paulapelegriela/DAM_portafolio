package herencia;


public class Main {

	public static void main(String[] args) {

		inicioPrograma();
		//Crear objetos de tipo Empleado
		Empleado empleado1 = crearEmpleado();
		Empleado empleado2 = crearEmpleado();
		Empleado empleado3 = crearEmpleado();

		//Crear objetos de tipo Consultor

		Consultor consultor1 = crearConsultor();

		//Crear objetos de tipo Jefe
		Jefe jefe1 = crearJefe();


		//Actualizar datos de empleado1 (GET)
		empleado1.setIdEmpleado(1001);		//Empleado
		empleado1.dni = "12345678X";		//Persona
		empleado1.nombre = "Armando";		//Persona
		empleado1.apellido = "Gresca";		//Persona
		empleado1.setCategoria(1);			//Empleado
		empleado1.setCargo("Desarrollador");//Empleado

		//Actualizar datos de empleado2 (GET)
		empleado2.setIdEmpleado(1002);			//Empleado
		empleado2.dni = "23456789Y";			//Persona
		empleado2.nombre = "Enrique";			//Persona
		empleado2.apellido = "Andres";			//Persona
		empleado2.setCategoria(2);				//Empleado
		empleado2.setCargo("QA Manager");		//Empleado

		//Actualizar datos de empleado3 (GET)
		empleado3.setIdEmpleado(1003);			//Empleado
		empleado3.dni = "34567890Y";			//Persona
		empleado3.nombre = "Marisa";			//Persona
		empleado3.apellido = "Bado";			//Persona
		empleado3.setCategoria(1);				//Empleado
		empleado3.setCargo("Desarrollador");	//Empleado

		//Actualizar datos de consultor1 (GET)

		consultor1.setIdConsultor(2001);		//Consultor
		consultor1.dni = "87654321Y";			//Persona
		consultor1.nombre = "Roberto";			//Persona
		consultor1.apellido = "Dinamita";		//Persona
		consultor1.setTarifaHora(40);			//Consultor
		consultor1.setNombreConsultora("MEDAC");//Consultor
		
		//Actualizar datos de jefe1 (GET)

		jefe1.setIdJefe(3001);					//Jefe
		jefe1.dni = "34567890Z";				//Persona
		jefe1.nombre = "Ernesto";				//Persona
		jefe1.apellido = "Mate";				//Persona
		jefe1.apellido = "Andres";				//Persona
		jefe1.setCategoria(3);;					//Jefe
		jefe1.setCargo("JP");					//Jefe
		
		//Visualizar los empleados
		empleado1.visualizarEmpleado(empleado1);
		empleado2.visualizarEmpleado(empleado2);
		empleado3.visualizarEmpleado(empleado3);
		
		//Visualizar el consultor
		consultor1.visualizarConsultor(consultor1);
		
		//Visualizar el jefe
		jefe1.visualizarJefe(jefe1);
		
		//Visualizar equipo y roles
		crearArrayEquipo(empleado1, empleado2, empleado3, consultor1, jefe1);
		
		//fin
		finPrograma();
	}//main

	//inicio  programa

		public static void inicioPrograma() {
			System.out.println( "\n*** HERENCIA Java ***");
			System.out.println("Desarrollado por PPE\n");
		}
		
	//Crear los objetos
	private static Empleado crearEmpleado() {
		Empleado empleado = new Empleado();
		return empleado;
	}

	private static Consultor crearConsultor() {
		Consultor consultor = new Consultor();
		return consultor;

	}

	private static Jefe crearJefe() {
		Jefe jefe = new Jefe();
		return jefe;
	}
	
	//Visualizar equipo
	
	//Creamos las arrays del equipo
	
	private static void crearArrayEquipo(Empleado empleado1, Empleado empleado2, Empleado empleado3, Consultor consultor1, Jefe jefe1) {
		Persona[] persona = new Persona[5];
		persona[0] = jefe1;
		persona[1] = empleado1;
		persona[2] = empleado2;
		persona[3] = empleado3;
		persona[4] = consultor1;
		
		System.out.println("\n------------------------------");
		System.out.println("Equipo formado por " + persona.length + " personas:");
		System.out.println("------------------------------");
		
		mostrarEquipo(persona);
	}
	
	
	//mostrar el equipo con ejemplo de casting
	
	private static void mostrarEquipo(Persona[] tabla) {
		
		for (Persona per:tabla) {
			System.out.print(" "+per.nombre +" "+per.apellido );
			
			if (per instanceof Jefe)
				System.out.println(" ("+((Jefe)per).getCargo()+")");
			else {
				if (per instanceof Empleado)
					System.out.println(" ("+((Empleado)per).getCargo()+")");
				if (per instanceof Consultor)
					System.out.println(" ("+((Consultor)per).getNombreConsultora()+")");
			
			} //else
		}//for
	}//mostrarEquipo

	//fin programa
	public static void finPrograma() {
		System.out.println("\n FIN del Programa");
	}
	
}//clase

