package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		int puntuaciones[] = new int[8];

		boolean error = false;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Mientras que error sea verdadero se va a repetir este bucle
		do {

			try {
				// Este for sirve para que el usuario introduzca los numeros
				for (int i = 0; i < puntuaciones.length; i++) {
					System.out.println("Digame la puntuacion del jugador " + (i + 1));
					puntuaciones[i] = sc.nextInt();

					// Si el numero no esta en el rango indicado, saltara un assertion error con el
					// texto que tiene debajo
					assert puntuaciones[i] >= 1000 && puntuaciones[i] <= 2800
							: "La puntuacion debe estar entre el rango 1000-2800";
					error = false;
				}

			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;

				// Este error salta si el numero no es un entero
			} catch (InputMismatchException e) {
				System.err.println("El numero debe ser un entero");
				sc.next();
				error = true;
			}

		} while (error);

		// Ordeno las puntuaciones de mayor a menor
		Arrays.sort(puntuaciones);

		// Saco por pantalla las puntuaciones al reves, ya que al estar de mayor a menor
		// las saco de menor mayor
		for (int i = puntuaciones.length - 1; i >= 0; i--) {

			// Si i es diferente a 0 significa que no es el ultimo numero, asi que le pone
			// una coma al final
			if (i != 0) {
				System.out.print(puntuaciones[i]);

				// Si llega aqui significa que es el ultimo numero, asi que no le pone una coma
				// al final
			} else
				System.out.print(puntuaciones[i] + ", ");
		}

		// Cierro el escaner
		sc.close();

	}

}
