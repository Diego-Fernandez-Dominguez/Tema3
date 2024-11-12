package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo la tabla que va guardar los numeros de la primitiva
		int primitiva[] = new int[6];

		// Creo la tabla que va guardar los resultados
		int resultados[] = { 5, 9, 16, 27, 32, 48 };

		// Creo la variable que va a guardar el numero de aciertos
		int aciertos = 0;

		// Creo la variable contador
		int cont = 0;

		// Creo la variable que va a guardar el numero generado de forma aleatoria
		int numAleatorio;

		// Creo la variable que va a guardar el resultado de la busqueda
		int busqueda;

		// Creo el randomizador
		Random rand = new Random();

		// Compruebo si el numero generado aleatoriamente esta repetido, si es asi
		// vuelve a generar otro
		while (cont < 6) {
			numAleatorio = rand.nextInt(1, 51);
			Arrays.sort(primitiva);
			busqueda = Arrays.binarySearch(primitiva, numAleatorio);
			if (busqueda < 0) {
				primitiva[0] = numAleatorio;
				cont++;
			}
		}

		// Compruebo el numero de veces que sale el numero de veces que sale el numero
		// de primitiva en los resultados
		for (int valor : primitiva) {
			busqueda = Arrays.binarySearch(resultados, valor);
			if (busqueda >= 0) {
				aciertos++;
			}
		}

		// Saco las tablas por pantalla
		System.out.println("Apuesta: " + Arrays.toString(primitiva));
		System.out.println("Resultado: " + Arrays.toString(resultados));

		// Saco el resultado por pantalla
		System.out.println("Has acertado un total de " + aciertos + " numeros");

	}

}
