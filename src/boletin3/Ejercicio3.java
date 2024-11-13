package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Creo la tabla que va a ser utilizada para el ejercicio
		int tabla[][];

		// Creo las variables que vana guardar los datos dados por el usuario
		int filas;
		int columnas;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario el numero de fila
		System.out.println("Dime el numero de filas: ");
		filas = sc.nextInt();

		// Le pido al usuario el numero de columnas
		System.out.println("Dime el numero de columnas: ");
		columnas = sc.nextInt();

		// Le doy el tamaño a la tabla
		tabla = new int[filas][columnas];

		//
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = 10 * i + j;
			}
		}

		// Saco la tabla por pantalla
		System.out.println(Arrays.deepToString(tabla));

		// Cierro el escaner
		sc.close();

	}

}
