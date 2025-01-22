package boletin7;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {

	static Scanner ponlo = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo la coleccion que va a guardar los nombres por orden de llegada
		LinkedHashSet<String> nombres = new LinkedHashSet<String>();

		// Creo la variable que va a almacenar los nombres dados por el usuario
		String nombre;

		// Le pido al usuario que introduzca nombres
		System.out.println("Introduzca nombres");
		nombre = ponlo.nextLine();

		// El bucle se va a repetir hasta que se introduzca la palabra fin
		while (!nombre.equals("fin")) {

			// Se añade el nombre a la lista
			nombres.add(nombre);

			// Le pido al usuario que introduzca nombres
			System.out.println("Introduzca nombres");
			nombre = ponlo.nextLine();

		}

		// Saco los nombres por pantalla
		for (String palabra : nombres) {
			System.out.print(palabra + " ");
		}
	}

}
