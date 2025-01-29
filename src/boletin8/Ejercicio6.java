package boletin8;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		LinkedHashMap<String, LinkedHashSet<Integer>> telefonos = new LinkedHashMap<String, LinkedHashSet<Integer>>();
		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();

		String nombre;
		int telefono;

		Scanner sc = new Scanner(System.in);

		numeros.add(644112277);
		numeros.add(621198242);
		
		telefonos.put("Daniel", numeros);
		
		numeros.removeAll(numeros);
		
		numeros.add(681280552);
		numeros.add(655243448);
		
		telefonos.put("Eusebio", numeros);

		// Creo la variable que va a guardar la eleccion del usuario
		int eleccion = 1;

		// Mientras la eleccion sea distinta a 0 se va a repetir el bucle
		while (eleccion != 6) {

			// Saco el menu por pantalla
			System.out.println("\nEliga una opcion: ");
			System.out.println("\n1. Añadir persona ");
			System.out.println("2. Añadir telefono a una persona dada");
			System.out.println("3. Mostrar todos los telefonos de una persona ");
			System.out.println("4. Eliminar telefono de una persona ");
			System.out.println("5. Eliminar una persona");
			System.out.println("6. Salir");

			// El usuario lo introduce
			eleccion = sc.nextInt();
			sc.nextLine();

			switch (eleccion) {

			case 1 -> {

				System.out.println("Digame el nombre a añadir");
				nombre = sc.nextLine();

				telefonos.put(nombre, new LinkedHashSet<>());

			}

			case 2 -> {

				System.out.println("Digame el nombre al que se le va a añadir un telefono");
				nombre = sc.nextLine();

				System.out.println("Digame el numero de telefono");
				telefono = sc.nextInt();

				numeros = telefonos.get(nombre);
				numeros.add(telefono);

				telefonos.replace(nombre, numeros);

			}

			case 3 -> {

				System.out.println("Digame el nombre");
				nombre = sc.nextLine();

				System.out.println(telefonos.get(nombre));

			}

			case 4 -> {

				System.out.println("Digame el nombre al que se le va a eliminar un telefono");
				nombre = sc.nextLine();

				System.out.println("Digame el numero de telefono");
				telefono = sc.nextInt();

				numeros = telefonos.get(nombre);
				numeros.remove(telefono);

				telefonos.replace(nombre, numeros);

			}

			case 5 -> {

				System.out.println("Digame el nombre");
				nombre = sc.nextLine();

				telefonos.remove(nombre);

			}

			case 6 -> {

				System.out.println("Adioh");

			}

			}

		}

		sc.close();

	}

}
