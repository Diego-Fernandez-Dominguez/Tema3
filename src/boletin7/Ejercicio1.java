package boletin7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	static Scanner andreh = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo la variable que va a guardar un numero
		int num;

		// Creo la lista que va a guardar los numeros dados por el usuario
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Le pido al usuario que introduzca el numero
		System.out.println("Dime un numero");
		num = andreh.nextInt();

		// Mientras que el numero sea mayor o igual a 0 se repetira el siguiente bucle
		while (num >= 0) {

			// Añado el numero a la lista
			numeros.add(num);

			// Le pido al usuario que introduzca el numero
			System.out.println("Dime un numero");
			num = andreh.nextInt();

		}

		// Compruebo si la lista esta vacia
		if (numeros.isEmpty()) {
			System.out.println("La lista esta vacia");
		} else {

			// Imprimo por pantalla los numeros pares
			for (int i = 0; i < numeros.size(); i++) {

				if (numeros.get(i) % 2 == 0) {

					System.out.print(numeros.get(i));
					;

				}

			}

		}

		// Cierro el escaner
		andreh.close();

	}

}
