package boletin7;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

	static Random sipi = new Random();

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		int tamanyo;

		int suma = 0;
		int maximo = 0;
		int minimo = 0;

		tamanyo = sipi.nextInt(5, 11);

		for (int i = 0; i < tamanyo; i++) {

			numeros.add(sipi.nextInt(0, 101));

		}

		for (int i = 0; i < tamanyo; i++) {

			if (i == 0) {
				maximo = numeros.get(i);
				minimo = numeros.get(i);
			}

			if (numeros.get(i) > maximo) {
				maximo = numeros.get(i);
			}

			if (numeros.get(i) < minimo) {
				minimo = numeros.get(i);
			}

			suma += numeros.get(i);

		}

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + suma/tamanyo);
		System.out.println("Maximo: " + maximo);
		System.out.println("Minimo: " + minimo);

	}

}
