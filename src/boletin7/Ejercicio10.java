package boletin7;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ejercicio10 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//
		LinkedHashMap<String, Integer> productos = new LinkedHashMap<String, Integer>();

		int eleccion = 1;

		String producto = "";

		int existencias = 0;

		while (eleccion != 0) {

			System.out.println("Eliga una opcion: ");
			System.out.println("\n1. Alta de producto ");
			System.out.println("2. Baja de producto ");
			System.out.println("3. Listar existencias ");
			System.out.println("0. Salir");

			eleccion = sc.nextInt();
			sc.nextLine();

			switch (eleccion) {

			case 1 -> {

				System.out.println("Digame el nombre del producto");
				producto = sc.nextLine();

				System.out.println("Digame las existencias");
				existencias = sc.nextInt();

				productos.put(producto, existencias);

			}
			case 2 -> {

				System.out.println("Digame el nombre del producto");
				producto = sc.nextLine();

				productos.remove(producto);

			}
			case 3 -> {

				System.out.println("Digame el nombre del producto");
				producto = sc.nextLine();

				System.out.println(productos.get(producto));

			}
			case 0 -> {
				System.out.println("Adioh");
			}

			}
		}

	}

}
