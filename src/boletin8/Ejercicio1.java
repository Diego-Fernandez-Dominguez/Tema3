package boletin8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio1 {

	static final int TAMANYO = 10;

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numerines = new ArrayList<Integer>();

		int cont = 0;

		Random rand = new Random();

		while (cont <= TAMANYO) {
			numeros.add(rand.nextInt(0, 11));
			cont++;
		}

		numerines.addAll(numeros);

		Collections.shuffle(numerines);

		System.out.println("Lista original");
		for (int num : numeros) {
			System.out.print(num + " ");
		}

		System.out.println("\n\nLista desordenada");
		for (int num : numerines) {
			System.out.print(num + " ");
		}

	}

}
