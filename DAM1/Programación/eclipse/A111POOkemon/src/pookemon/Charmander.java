package pookemon;

import interfaces.IFuego;

public class Charmander extends Pookemon implements IFuego{

	//Constructor con los atributos comunes de la clase Pookemon
	public Charmander(int numPokedex, String nombre, double altura, double peso, String categoria, String tipo,String habilidad) {
		super(numPokedex, nombre, altura, peso, categoria, tipo, habilidad);
	}

	//Métodos abstractos comunes
	@Override
	public void atacarPlacaje() {
		System.out.println("¡¡¡ Soy Charmander y este es mi ataque PLACAJE !!!");
	}
	@Override
	public void atacarAraniazo() {
		System.out.println("¡¡¡ Soy Charmander y este es mi ataque ARAÑAZO !!!");
	}
	@Override
	public void atacarMordisco() {
		System.out.println("¡¡¡ Soy Charmander y este es mi ataque MORDISCO !!!");
	}

	//Métodos abstractos personales
	@Override
	public void atacarPunioFuego() {
		System.out.println("¡¡¡ Soy Charmander y este es mi ataque PUÑOFUEGO !!!");
	}
	@Override
	public void atacarLanzallamas() {
		System.out.println("¡¡¡ Soy Charmander y este es mi ataque LANZALLAMAS !!!");
	}
	@Override
	public void atacarAscuas() {
		System.out.println("¡¡¡ Soy Charmander y este es mi ataque ASCUAS !!!");
	}
}
