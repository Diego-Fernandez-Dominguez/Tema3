package boletin8;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		LinkedHashMap<String, LinkedHashSet<String>> tareas = new LinkedHashMap<String, LinkedHashSet<String>>();
		LinkedHashSet<String> lista = new LinkedHashSet<String>();

		String tarea;

		Scanner sc = new Scanner(System.in);

		String categoria;

		// Creo la variable que va a guardar la eleccion del usuario
		int eleccion = 1;

		// Mientras la eleccion sea distinta a 0 se va a repetir el bucle
		while (eleccion != 6) {

			// Saco el menu por pantalla
			System.out.println("\nEliga una opcion: ");
			System.out.println("\n1. Añadir categoria ");
			System.out.println("2. Añadir tarea a una categoria");
			System.out.println("3. Mostrar todas las tareas de una categoria ");
			System.out.println("4. Eliminar tarea de una categoria ");
			System.out.println("5. Eliminar una categoria");
			System.out.println("6. Salir");

			// El usuario lo introduce
			eleccion = sc.nextInt();
			sc.nextLine();

			switch (eleccion) {

			case 1 -> {

				System.out.println("Dime la categoria");
				categoria = sc.nextLine();

				tareas.put(categoria, new LinkedHashSet<>());

			}

			case 2 -> {

				System.out.println("Digame la categoria");
				categoria = sc.nextLine();

				System.out.println("Digame la tarea");
				tarea = sc.nextLine();

				lista = tareas.get(categoria);

				lista.add(tarea);

				tareas.replace(categoria, lista);

			}

			case 3 -> {

				System.out.println("Digame la categoria");
				categoria = sc.nextLine();

				System.out.println(tareas.get(categoria));

			}

			case 4 -> {

				System.out.println("Digame la categoria");
				categoria = sc.nextLine();

				System.out.println("Digame la tarea");
				tarea = sc.nextLine();

				tareas.get(categoria);

			}

			case 5 -> {

				System.out.println("Digame una categoria");
				categoria = sc.nextLine();

				tareas.remove(categoria);

			}

			case 6 -> {

				System.out.println("Adioh");

			}

			}

		}

		sc.close();
	}

}
