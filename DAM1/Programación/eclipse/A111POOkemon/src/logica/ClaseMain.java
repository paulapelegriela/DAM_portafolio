package logica;

import java.text.DecimalFormat;
import java.util.Arrays;

import interfaces.IAgua;
import interfaces.IElectrico;
import interfaces.IFuego;
import interfaces.IPlanta;
import pookemon.Bulbasaur;
import pookemon.Charmander;
import pookemon.Pikachu;
import pookemon.Pookemon;
import pookemon.Squirtle;

public class ClaseMain {

	static DecimalFormat dec = new DecimalFormat("000");
	public static void main(String[] args) {

		inicioPrograma();

		//crear un array vacío para guardar los pokemons
		Pookemon pokemons[] = new Pookemon[0];

		//crear los objetos de cada pokemon
		Bulbasaur bulbasaur = new Bulbasaur(1, "Bulbasaur", 0.7, 6.9, "Semilla", "Planta", "Espesura");
		Squirtle squirtle = new Squirtle(7, "Squirtle", 0.5, 9.0, "Tortuguita", "Agua", "Torrente");
		Charmander charmander = new Charmander(4, "Charmander", 0.6, 8.5, "Lagartija", "Fuego", "Mar Llamas");
		Pikachu pikachu = new Pikachu(25, "Pikachu", 0.4, 6.0,"Ratón", "Eléctrico", "Electricidad estática");

		//añadir Bulbasaur al array
		pokemons = Arrays.copyOf(pokemons, pokemons.length + 1);
		pokemons[pokemons.length - 1] = bulbasaur;

		//añadir Squirtle al array
		pokemons = Arrays.copyOf(pokemons, pokemons.length + 1);
		pokemons[pokemons.length - 1] = squirtle;

		//añadir Charmander al array
		pokemons = Arrays.copyOf(pokemons, pokemons.length + 1);
		pokemons[pokemons.length - 1] = charmander;

		//añadir Pikachu al array
		pokemons = Arrays.copyOf(pokemons, pokemons.length + 1);
		pokemons[pokemons.length - 1] = pikachu;

		//recorrer el array
		for (Pookemon pokemon : pokemons) {

			System.out.println();

			//usar instanceof para ver de que instancia hablamos
			
			//bulbasaur
			if (pokemon instanceof Bulbasaur) {

				System.out.println(Color.verde + "[" + pokemon.nombre + "]");
				System.out.println("* Num. Pokedex: " + dec.format(pokemon.numPokedex));
				System.out.println("* Categoria: " + pokemon.categoria);
				System.out.println("* Tipo: " + pokemon.tipo);
				System.out.println("* Habilidad: " + pokemon.habilidad);
				System.out.println("* Peso: " + pokemon.peso + "kg");
				System.out.println("* Altura: " + pokemon.altura + "m\n");

				pokemon.atacarPlacaje();
				pokemon.atacarAraniazo();
				pokemon.atacarMordisco();

				//hacemos casting para poder usar sus ataques especiales
				IPlanta planta = (IPlanta) pokemon;

				planta.atacarDrenaje();
				planta.atacarParalizar();
			}

			//squirtle
			else if (pokemon instanceof Squirtle) {

				System.out.println(Color.azul + "[" + pokemon.nombre + "]");
				System.out.println("* Num. Pokedex: " + dec.format(pokemon.numPokedex));
				System.out.println("* Categoria: " + pokemon.categoria);
				System.out.println("* Tipo: " + pokemon.tipo);
				System.out.println("* Habilidad: " + pokemon.habilidad);
				System.out.println("* Peso: " + pokemon.peso + "kg");
				System.out.println("* Altura: " + pokemon.altura + "m\n");

				pokemon.atacarPlacaje();
				pokemon.atacarAraniazo();
				pokemon.atacarMordisco();
				
				//hacemos casting para poder usar sus ataques especiales
				IAgua agua = (IAgua) pokemon;

				agua.atacarHidrobomba();
				agua.atacarBurbuja();
				agua.atacarPistolaAgua();
			}

			//charmander
			else if (pokemon instanceof Charmander) {

				System.out.println(Color.rojo + "[" + pokemon.nombre + "]");
				System.out.println("* Num. Pokedex: " + dec.format(pokemon.numPokedex));
				System.out.println("* Categoria: " + pokemon.categoria);
				System.out.println("* Tipo: " + pokemon.tipo);
				System.out.println("* Habilidad: " + pokemon.habilidad);
				System.out.println("* Peso: " + pokemon.peso + "kg");
				System.out.println("* Altura: " + pokemon.altura + "m\n");

				pokemon.atacarPlacaje();
				pokemon.atacarAraniazo();
				pokemon.atacarMordisco();

				//hacemos casting para poder usar sus ataques especiales
				IFuego fuego = (IFuego) pokemon;

				fuego.atacarPunioFuego();
				fuego.atacarLanzallamas();
				fuego.atacarAscuas();
			}

			//pikachu
			else if (pokemon instanceof Pikachu) {

				System.out.println(Color.morado + "[" + pokemon.nombre + "]");
				System.out.println("* Num. Pokedex: " + dec.format(pokemon.numPokedex));
				System.out.println("* Categoria: " + pokemon.categoria);
				System.out.println("* Tipo: " + pokemon.tipo);
				System.out.println("* Habilidad: " + pokemon.habilidad);
				System.out.println("* Peso: " + pokemon.peso + "kg");
				System.out.println("* Altura: " + pokemon.altura + "m\n");

				pokemon.atacarPlacaje();
				pokemon.atacarAraniazo();
				pokemon.atacarMordisco();

				//hacemos casting para poder usar sus ataques especiales
				IElectrico electrico = (IElectrico) pokemon;

				electrico.atacarImpactrueno();
				electrico.atacarPunioTrueno();
			}
		}

		finPrograma();
	}//main

	public static void inicioPrograma() {
		System.out.println(Color.blanco + "Inicio del Programa POOKEMON");
		System.out.println(Color.blanco + "		desarrollado por PPE");
	}

	public static void finPrograma() {
		System.out.println(Color.blanco + "\nFin del Programa");
	}
}