package boletin4parte2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Creo el array bidimensional de 6 filas y 10 columnas
		int t[][] = new int[6][10];

		// Llamo a la funcion llenarAleatorios para llenar la tabla de numeros
		// aleatorios
		llenarAleatorios(t);

		// Llamo a la funcion maximoMinimo para descubrir el minimo y el maximo
		int valores[] = maximoMinimo(t);

		// Saco la tabla por pantalla
		System.out.println(Arrays.toString(valores));

	}

	static int[][] llenarAleatorios(int[][] t) {

		// Creo el randomizador
		Random rand = new Random();

		// Lleno la tabla de numeros aleatorios
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = rand.nextInt(0, 1001);
			}
		}

		// Devuelvo la tabla
		return t;

	}

	static int[] maximoMinimo(int[][] t) {

		// Creo la tabla que va a guardar el maximo y el minimo
		int t2[] = new int[2];

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				// Si "i" y "j" son 0, significa que es el primer numero y es el maximo y el
				// minimo a la vez
				if (i == 0 && j == 0) {
					t2[0] = t[i][j];
					t2[1] = t[i][j];
				}

				// Compruebo cual es el maximo y cual es el minimo
				if (t[i][j] < t2[0]) {
					t2[0] = t[i][j];
				} else if (t[i][j] > t2[1]) {
					t2[1] = t[i][j];
				}

			}
		}

		// Devuelvo la tabla con el maximo y el minimo
		return t2;

	}

}
