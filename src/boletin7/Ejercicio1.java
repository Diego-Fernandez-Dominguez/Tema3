package boletin7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	static Scanner andreh = new Scanner(System.in);

	public static void main(String[] args) {

		int num;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		System.out.println("Dime un numero");
		num = andreh.nextInt();

		while (num >= 0) {

			numeros.add(num);

			System.out.println("Dime un numero");
			num = andreh.nextInt();

		}

		if (numeros.isEmpty()) {
			System.out.println("La lista esta vacia");
		} else {

			for (int i = 0; i < numeros.size(); i++) {

				if (numeros.get(i) % 2 == 0) {

					System.out.print(numeros.get(i));
					;

				}

			}

		}
		
		andreh.close();

	}

}
