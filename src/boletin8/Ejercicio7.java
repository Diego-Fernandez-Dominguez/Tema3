package boletin8;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		LinkedHashMap<Integer, LinkedHashSet<String>> longitudes = new LinkedHashMap<Integer, LinkedHashSet<String>>();

		LinkedHashSet<String> palabras = new LinkedHashSet<String>();

		Scanner sc = new Scanner(System.in);

		String palabra = "";

		int longitud;

		do {

			System.out.println("Introduzca palabras (no introduzca nada para acabar)");
			palabra = sc.nextLine().toLowerCase();

			longitud = palabra.length();

			if (!longitudes.containsKey(longitud)) {

				longitudes.put(longitud, new LinkedHashSet<>());
				
				palabras.add(palabra);

				longitudes.replace(longitud, palabras);

			} else {

				palabras = longitudes.get(longitud);

				palabras.add(palabra);

				longitudes.replace(longitud, palabras);

			}

		} while (palabra != "");

		sc.close();
		
	}

}
