package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo la tabla que va guardar los numeros de la primitiva
		int primitiva[] = new int[6];

		// Creo la tabla que va guardar los resultados
		int resultados[] = new int[6];

		// Creo la variable que va a guardar el numero de aciertos
		int aciertos = 0;

		// Creo el randomizador
		Random rand = new Random();

		// Rellenos los arrays con numeros aleatorios
		for (int i = 0; i < resultados.length; i++) {
			primitiva[i] = rand.nextInt(1, 50);
			resultados[i] = rand.nextInt(1, 50);
		}

		// Ordeno los resultados
		Arrays.sort(resultados);

		// Compruebo el numero de veces que sale el numero de veces que sale el numero
		// de primitiva en los resultados
		for (int i = 0; i < primitiva.length; i++) {
			for (int j = 0; j < primitiva.length; j++) {

				if (primitiva[i] == resultados[j]) {
					aciertos++;
				}

			}
		}

		// Saco el resultado por pantalla
		System.out.println("Has acertado un total de " + aciertos + " numeros");

	}

}
