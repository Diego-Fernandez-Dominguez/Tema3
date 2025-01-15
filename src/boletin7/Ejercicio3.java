package boletin7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {

	static Random randomToGuapo = new Random();

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
			

		for (int i = 0; i < 31; i++) {

			numeros.add(randomToGuapo.nextInt(1, 11));

		}
		
		Collections.sort(numeros);

		for (int num : numeros) {
			System.out.print(num + " ");
		}

	}

}
