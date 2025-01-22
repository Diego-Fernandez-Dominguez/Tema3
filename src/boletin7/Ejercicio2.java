package boletin7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio2 {

	static Random sipi = new Random();

	public static void main(String[] args) {

		// Creo la lista que va a guardar los numeros generados aleatoriamente
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Creo la variable que va a guardar el tamaño de la lista
		int tamanyo;

		// Creo la variable que va a guardar la suma de los numero
		int suma = 0;

		// Genero el tamanyo
		tamanyo = sipi.nextInt(5, 11);

		// El usuario añade los numeros y se suman
		for (int i = 0; i < tamanyo; i++) {

			numeros.add(sipi.nextInt(0, 101));
			suma += numeros.get(i);

		}

		// Saco la suma y la media de los numeros
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + suma / tamanyo);

		// Saco el maximo y el minimo de la coleccion
		System.out.println("Maximo : " + Collections.max(numeros));
		System.out.println("Minimo : " + Collections.min(numeros));

	}

}
