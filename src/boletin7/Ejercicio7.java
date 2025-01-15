package boletin7;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//
		TreeMap<String, String> diccionario = new TreeMap<String, String>();

		int eleccion = 3;

		String clave;

		String traduccion;

		while (eleccion != 0) {

			System.out.println("Eliga una opcion: ");
			System.out.println("\n1. Inserta palabra ");
			System.out.println("2. Busca palabra ");
			System.out.println("0. Salir");

			eleccion = sc.nextInt();

			sc.nextLine();

			switch (eleccion) {

			case 1 -> {
				System.out.println("Ponga la palabra en español");
				clave = sc.nextLine();

				System.out.println("Ponga la traduccion");
				traduccion = sc.nextLine();

				diccionario.put(clave, traduccion);

			}

			case 2 -> {
				System.out.println("Ponga la palabra en español (clave)");
				clave = sc.nextLine();

				System.out.println("Traduccion: " + diccionario.get(clave));

			}

			case 0 -> {
				System.out.println("Adioh");
			}

			}
		}

	}
}
