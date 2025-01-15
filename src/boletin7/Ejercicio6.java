package boletin7;

import java.util.TreeSet;
import java.util.Scanner;

public class Ejercicio6 {
	static Scanner zapato = new Scanner(System.in);

	public static void main(String[] args) {

		TreeSet <String> nombres = new TreeSet <String>();

		String nombre;

		System.out.println("Introduzca nombres");
		nombre = zapato.nextLine();

		while (!nombre.equals("fin")) {

			nombres.add(nombre);

			System.out.println("Introduzca nombres");
			nombre = zapato.nextLine();

		}

		for (String palabra : nombres) {
			System.out.print(palabra + " ");
		}
	}

}
