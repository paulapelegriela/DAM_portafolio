package pookemon;

import interfaces.IAgua;

public class Squirtle extends Pookemon implements IAgua{

	//Constructor con los atributos comunes de la clase Pookemon
	public Squirtle(int numPokedex, String nombre, double altura, double peso, String categoria, String tipo, String habilidad) {
		super(numPokedex, nombre, altura, peso, categoria, tipo, habilidad);
	}

	//Métodos abstractos comunes
	@Override
	public void atacarPlacaje() {
		System.out.println("¡¡¡ Soy Squirtle y este es mi ataque PLACAJE !!!");
	}
	@Override
	public void atacarAraniazo() {
		System.out.println("¡¡¡ Soy Squirtle y este es mi ataque ARAÑAZO !!!");
	}
	@Override
	public void atacarMordisco() {
		System.out.println("¡¡¡ Soy Squirtle y este es mi ataque MORDISCO !!!");
	}

	//Métodos abstractos personales
	@Override
	public void atacarHidrobomba() {
		System.out.println("¡¡¡ Soy Squirtle y este es mi ataque HIDROBOMBA !!!");
	}
	@Override
	public void atacarBurbuja() {
		System.out.println("¡¡¡ Soy Squirtle y este es mi ataque BURBUJA !!!");
	}
	@Override
	public void atacarPistolaAgua() {
		System.out.println("¡¡¡ Soy Squirtle y este es mi ataque PISTOLA AGUA !!!");
	}
}
