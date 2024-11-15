package boletin3;

import java.util.Arrays;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Creo la tabla de 10*10
		int tabla[][] = new int[10][10];

		// Relleno las tablas con las tablas de multiplicar, pasando por las filas y por
		// las columnas
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				tabla[fila][columna] = (fila + 1) * (columna + 1);
			}
		}

		// Saco la tabla de multiplicar por pantalla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Tabla del " + (i+1) + ": " + Arrays.toString(tabla[i]));
		}

	}

}
