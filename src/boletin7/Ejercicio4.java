package boletin7;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	static Random aleatoritos = new Random();

	public static void main(String[] args) {

		// Creo el conjunto que va a guardar los numeros
		TreeSet<Integer> numeros = new TreeSet<Integer>();

		// Añado los numeros aleatorios a la coleccion
		for (int i = 0; i < 21; i++) {

			// Los numeros aleatorios estan en el rango del 0 al 99
			numeros.add(aleatoritos.nextInt(0, 100));

		}

		// Saco los numeros con un for-each
		for (int num : numeros) {

			System.out.print(num + " ");

		}

	}

}
