package boletin7;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo un mapa que va a guardar palabras en español y su traduccion al ingles
		TreeMap<String, String> diccionario = new TreeMap<String, String>();

		// Creo la variable que va a guardar la eleccion del usuario
		int eleccion = 3;

		// Creo la variable que va a guardar la palabra en españo
		String clave;

		// Creo la variable que va a guardar la traduccion de la palabra
		String traduccion;

		// Mientras que la eleccion sea distinta a 0 se va a repetir este bucle
		while (eleccion != 0) {

			// Saco el menu por pantalla
			System.out.println("Eliga una opcion: ");
			System.out.println("\n1. Inserta palabra ");
			System.out.println("2. Busca palabra ");
			System.out.println("0. Salir");

			// El usuario introduce su eleccion
			eleccion = sc.nextInt();
			sc.nextLine();

			// Dependiendo de la eleccion, se hara una accion distinta
			switch (eleccion) {

			// Añado la palabra en español y su traduccion
			case 1 -> {
				System.out.println("Ponga la palabra en español");
				clave = sc.nextLine();

				System.out.println("Ponga la traduccion");
				traduccion = sc.nextLine();

				diccionario.put(clave, traduccion);

			}

			// Buscamos la traduccion en ingles a traves de la palabra en español
			case 2 -> {
				System.out.println("Ponga la palabra en español (clave)");
				clave = sc.nextLine();

				if (diccionario.get(clave) == null) {
					System.out.println("Palabra no encontrada");
				} else {

					System.out.println("Traduccion: " + diccionario.get(clave));
				}

			}

			// El programa se acabo
			case 0 -> {
				System.out.println("Adioh");
			}

			}
		}

	}
}
