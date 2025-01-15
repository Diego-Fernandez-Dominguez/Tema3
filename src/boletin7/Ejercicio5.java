package boletin7;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {

	static Scanner ponlo = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedHashSet<String> nombres = new LinkedHashSet<String>();

		String nombre;

		System.out.println("Introduzca nombres");
		nombre = ponlo.nextLine();

		while (!nombre.equals("fin")) {

			nombres.add(nombre);

			System.out.println("Introduzca nombres");
			nombre = ponlo.nextLine();

		}

		for (String palabra : nombres) {
			System.out.print(palabra + " ");
		}
	}

}
