package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Creo la tabla que va a guardar las notas de los alumnos
		double notas[][] = new double[4][5];

		// Creo la variable que va a guardar la media del alumno
		double media = 0;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca las notas
		for (int linea = 0; linea < notas.length; linea++) {

			System.out.println("\nIntroduzca las notas del alumno " + (linea + 1));

			for (int columna = 0; columna < notas[linea].length; columna++) {

				System.out.println("Introduzca la nota " + (columna + 1) + " del alumno " + (linea + 1));
				notas[linea][columna] = sc.nextDouble();
			}
		}

		// Creo una tabulacion
		System.out.print("\t");

		// Imprimo la palabras nota 1-4
		for (int i = 1; i <= 5; i++) {
			System.out.print("\tNota " + i);

			// Imprimo las palabras Max, Min y Media
			if (i > notas.length) {
				System.out.print("\tMax ");
				System.out.print("\tMin ");
				System.out.print("\tMedia ");
			}
		}

		// Creo una linea vacia
		System.out.println();

		// Este for calcula la media y saca los resultados por pantalla
		for (int i = 0; i < notas.length; i++) {

			// Ordeno la tabla
			Arrays.sort(notas[i]);

			// Vacio la variable media para que no se sumen con las del alumno anterior
			media = 0;

			// Sumo las notas del alumno con un for-each
			for (double valor : notas[i]) {
				media = media + valor;
			}

			// Saco por pantalla al alumno y sus notas
			System.out.print("Alumno " + (i + 1) + "\t");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + "\t");

				// Si j es igual a la longitud de la tablas de notas, significa que ya ha
				// terminado de imprimir las palabras notas, y, imprime la media, la maxima y la
				// media
				if (j == notas.length) {
					System.out.print(notas[i][4] + "\t");
					System.out.print(notas[i][0] + "\t");
					System.out.print((media / 5) + "\t");

				}

			}

			// Creo una linea vacia
			System.out.println();

		}

		// Cierro el escaner
		sc.close();

	}

}