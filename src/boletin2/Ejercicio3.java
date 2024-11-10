package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Creo las tabla que se va a rellenar con los valores aleatorios
		int tabla[] = new int[30];

		// Creo el randomizador
		Random rand = new Random();

		// Relleno la tabla con numeros aleatorios
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rand.nextInt(1, 10);
		}

		// Ordeno la tabla con el metodo sort
		Arrays.sort(tabla);

		// Saco la tabla por pantalla
		System.out.println(Arrays.toString(tabla));

	}

}
