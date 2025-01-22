package boletin7;

import java.util.TreeSet;
import java.util.Scanner;

public class Ejercicio6 {
	static Scanner zapato = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo la coleccion que va a guardar los nombres por orden alfabetico
		TreeSet<String> nombres = new TreeSet<String>();

		// Creo la variable que va a almacenar los nombres dados por el usuario
		String nombre;

		// Le pido al usuario que introduzca nombres
		System.out.println("Introduzca nombres");
		nombre = zapato.nextLine();

		// El bucle se va a repetir hasta que se introduzca la palabra fin
		while (!nombre.equals("fin")) {

			// Se añade el nombre a la lista
			nombres.add(nombre);

			// Le pido al usuario que introduzca nombres
			System.out.println("Introduzca nombres");
			nombre = zapato.nextLine();

		}

		// Saco los nombres por pantalla
		for (String palabra : nombres) {
			System.out.print(palabra + " ");
		}
	}

}
