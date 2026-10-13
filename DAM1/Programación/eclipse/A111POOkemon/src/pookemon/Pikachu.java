package pookemon;

import interfaces.IElectrico;

public class Pikachu extends Pookemon implements IElectrico{

	//Constructor con los atributos comunes de la clase Pookemon
	public Pikachu(int numPokedex, String nombre, double altura, double peso, String categoria, String tipo, String habilidad) {
		super(numPokedex, nombre, altura, peso, categoria, tipo, habilidad);
	}

	//Métodos abstractos comunes
	@Override
	public void atacarPlacaje() {
		System.out.println("¡¡¡ Soy Pikachu y este es mi ataque PLACAJE !!!");
	}
	@Override
	public void atacarAraniazo() {
		System.out.println("¡¡¡ Soy Pikachu y este es mi ataque ARAÑAZO !!!");
	}
	@Override
	public void atacarMordisco() {
		System.out.println("¡¡¡ Soy Pikachu y este es mi ataque MORDISCO !!!");
	}

	//Métodos abstractos personales
	@Override
	public void atacarImpactrueno() {
		System.out.println("¡¡¡ Soy Pikachu y este es mi ataque IMPACTRUENO !!!");
	}
	@Override
	public void atacarPunioTrueno() {
		System.out.println("¡¡¡ Soy Pikachu y este es mi ataque PUÑOTRUENO !!!");
	}
}
