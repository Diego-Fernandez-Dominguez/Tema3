package boletin7;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ejercicio10 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo el mapa que va a guardar los productos y sus existencias
		LinkedHashMap<String, Integer> productos = new LinkedHashMap<String, Integer>();

		// Creo la variable que va a guardar la eleccion del usuario
		int eleccion = 1;

		// Creo la variable que va a guardar el nombre del producto
		String producto = "";

		// Creo la variable que va a guardar el numero de existencias
		int existencias = 0;

		// Mientras la eleccion sea distinta a 0 se va a repetir el bucle
		while (eleccion != 0) {

			// Saco el menu por pantalla
			System.out.println("Eliga una opcion: ");
			System.out.println("\n1. Alta de producto ");
			System.out.println("2. Baja de producto ");
			System.out.println("3. Listar existencias ");
			System.out.println("0. Salir");

			// El usuario lo introduce
			eleccion = sc.nextInt();
			sc.nextLine();

			// Dependiendo de la eleccion, se hara una accion distinta
			switch (eleccion) {

			// El usuario introduce el producto y el numero de existencias
			case 1 -> {

				System.out.println("Digame el nombre del producto");
				producto = sc.nextLine();

				System.out.println("Digame las existencias");
				existencias = sc.nextInt();

				productos.put(producto, existencias);

			}

			// Pido al usuario el nombre del producto y lo borro del mapa
			case 2 -> {

				System.out.println("Digame el nombre del producto");
				producto = sc.nextLine();

				productos.remove(producto);

			}

			// Pido al usuario el nombre del producto y saco por pantalla sus existencias
			case 3 -> {

				System.out.println("Digame el nombre del producto");
				producto = sc.nextLine();

				System.out.println(productos.get(producto));

			}

			// Se acaba el programa
			case 0 -> {
				System.out.println("Adioh");
			}

			}
		}

	}

}
