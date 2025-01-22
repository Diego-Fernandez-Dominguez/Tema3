package boletin7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {

	static Random randomToGuapo = new Random();

	public static void main(String[] args) {

		// Creo la lista que va a guardar los numeros
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Se añaden numeros aleatorios a la lista
		for (int i = 0; i < 31; i++) {

			numeros.add(randomToGuapo.nextInt(1, 11));

		}

		// Ordeno la lista
		Collections.sort(numeros);

		// Saco la lista por pantalla con un for-each
		for (int num : numeros) {
			System.out.print(num + " ");
		}

	}

}
