package pookemon;

import interfaces.IPlanta;

public class Bulbasaur extends Pookemon implements IPlanta{

	//Constructor con los atributos comunes de la clase Pookemon
	public Bulbasaur(int numPokedex, String nombre, double altura, double peso, String categoria, String tipo, String habilidad) {
		super(numPokedex, nombre, altura, peso, categoria, tipo, habilidad);
	}

	//Métodos abstractos comunes
	@Override
	public void atacarPlacaje() {
		System.out.println("¡¡¡ Soy Bulbasaur y este es mi ataque PLACAJE !!!");
	}
	@Override
	public void atacarAraniazo() {
		System.out.println("¡¡¡ Soy Bulbasaur y este es mi ataque ARAÑAZO !!!");
	}
	@Override
	public void atacarMordisco() {
		System.out.println("¡¡¡ Soy Bulbasaur y este es mi ataque MORDISCO !!!");
	}


	//Métodos abstractos personales
	@Override
	public void atacarDrenaje() {
		System.out.println("¡¡¡ Soy Bulbasaur y este es mi ataque DRENAJE !!!");
	}

	@Override
	public void atacarParalizar() {
		System.out.println("¡¡¡ Soy Bulbasaur y este es mi ataque PARALIZAR !!!");
	}
}//class
