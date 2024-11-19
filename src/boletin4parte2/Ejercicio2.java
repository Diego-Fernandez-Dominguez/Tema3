package boletin4parte2;

import java.util.Arrays;

public class Ejercicio2 {
	public static void main(String[] args) {

		int t[][] = new int[4][4];

		// Llamo a la funcion llenarAleatorios para llenar la tabla de numeros
		// aleatorios
		llenarTabla(t);

		int[][] tCambia = llenarTabla(t);

		System.out.println(Arrays.deepToString(tCambia));

	}

	static int[][] cambiarDisposicion(int[][] t) {

		int t2[][] = new int[t.length][t[1].length];

		for (int fila1 = 0; fila1 < t.length; fila1++) {

			for (int columna2 = 0; columna2 < t[fila1].length; columna2++) {

				for (int columna1 = 0; columna1 < t[fila1].length; columna1++) {

					for (int fila2 = 0; fila2 < t.length; fila2++) {

						t2[fila2][columna2] = t[fila1][columna1];

					}
				}
			}
		}

		return t2;

	}
	

	static int[][] llenarTabla(int[][] t) {

		int cont = 1;

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				t[i][j] = cont;
				cont++;

			}
		}

		return t;

	}

}
