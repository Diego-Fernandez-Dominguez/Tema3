package boletin8;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> series = new LinkedHashMap<String, Integer>();

		series.put("Daredevil", 8);
		series.put("Breaking bad", 9);
		series.put("Juego de tronos", 3);
		series.put("Crepusculo la serie", -2);
		series.put("Serie", 90);

		Scanner sc = new Scanner(System.in);

		String nombre;
		int valoracion;

		// Creo la variable que va a guardar la eleccion del usuario
		int eleccion = 1;

		// Mientras la eleccion sea distinta a 0 se va a repetir el bucle
		while (eleccion != 5) {

			// Saco el menu por pantalla
			System.out.println("\nEliga una opcion: ");
			System.out.println("\n1. Agregar serie ");
			System.out.println("2. Buscar serie ");
			System.out.println("3. Eliminar serie ");
			System.out.println("4. Mostrar series ");
			System.out.println("5. Salir");

			// El usuario lo introduce
			eleccion = sc.nextInt();
			sc.nextLine();

			switch (eleccion) {

			case 1 -> {

				System.out.println("Digame el nombre a añadir");
				nombre = sc.nextLine();

				System.out.println("Digame su valoracion");
				valoracion = sc.nextInt();

				series.put(nombre, valoracion);

			}

			case 2 -> {

				System.out.println("Dime la serie a buscar");
				nombre = sc.nextLine();

				if (series.containsKey(nombre)) {
					System.out.println("La nota de " + nombre + " es: " + series.get(nombre));
				} else {
					System.out.println(nombre + " no esta en el sistema");
				}

			}

			case 3 -> {

				System.out.println("Dime la serie a buscar");
				nombre = sc.nextLine();

				if (series.containsKey(nombre)) {
					series.remove(nombre);
				} else {
					System.out.println("La serie no esta en la base de datos");
				}

			}

			case 4 -> {

				System.out.println(series);

			}

			case 5 -> {

				System.out.println("Adioh");

			}
			}

		}

		sc.close();

	}

}
