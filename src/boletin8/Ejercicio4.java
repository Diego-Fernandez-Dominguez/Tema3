package boletin8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedList<String> nombres = new LinkedList<String>();

		nombres.add("Mario");
		nombres.add("Luis");
		nombres.add("Adrian");
		nombres.add("Daniela");
		nombres.add("Sara");
		nombres.add("Jose Manuel");

		String nombre;

		// Creo la variable que va a guardar la eleccion del usuario
		int eleccion = 1;

		// Mientras la eleccion sea distinta a 0 se va a repetir el bucle
		while (eleccion != 5) {

			// Saco el menu por pantalla
			System.out.println("Eliga una opcion: ");
			System.out.println("\n1. Agregar serie ");
			System.out.println("2. Buscar serie ");
			System.out.println("3. Eliminar serie ");
			System.out.println("4. Salir");

			// El usuario lo introduce
			eleccion = sc.nextInt();
			sc.nextLine();

			switch (eleccion) {

			case 1 -> {

				System.out.println("Digame el nombre a añadir");
				nombre = sc.nextLine();
				nombres.add(nombre);

			}

			case 2 -> {

				System.out.println("Digame el nombre a borrar");
				nombre = sc.nextLine();
				nombres.remove(nombre);

			}

			case 3 -> {

				Collections.sort(nombres);
				System.out.println(nombres);

			}

			case 4 -> {

				System.out.println("Digame el nombre");
				nombre = sc.nextLine();

				if (nombres.contains(nombre)) {

					System.out.println("Si esta en la lista");
				} else {

					System.out.println("No esta en la lista");
				}

			}

			case 5 -> {

				System.out.println("Adioh");

			}

			default -> {
				System.out.println("Opcion incorrecta");
			}

			}

		}

		sc.close();

	}
}
