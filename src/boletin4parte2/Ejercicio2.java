package boletin4parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo la tabla
		int t[][];

		// Creo la tabla donde se va a guardar la tabla 1 cambiada
		int[][] tCambia;

		// Creo la variable que va a guardar el numero de filas de la tabla
		int filas;

		// Creo la variable que va a guardar el numero de columnas de la tabla
		int columnas;

		// Llamo a la funcion pedirDatos para pedir los datos
		filas = pedirDatos("numero de filas");

		// LLamo a la funcion que pide los datos
		columnas = pedirDatos("numero de columnas");

		// Llamo a la funcion llenarAleatorios para llenar la tabla de numeros
		// aleatorios
		t = llenarTabla(filas, columnas);

		// Llamo a la funcion que cambia la tabla de disposicion
		tCambia = cambiarDisposicion(t);

		// Saco la tabla original por pantalla
		System.out.println("Tabla principal: ");
		for (int i = 0; i < t.length; i++) {
			System.out.println(Arrays.toString(t[i]));
		}

		// Linea en blanco
		System.out.println();
		
		// Saco la tabla por pantalla
		System.out.println("Tabla cambiada: ");
		for (int i = 0; i < tCambia.length; i++) {
			System.out.println(Arrays.toString(tCambia[i]));
		}

		// Cierro el escaner
		sc.close();

	}

	static int[][] cambiarDisposicion(int[][] t) {

		// Creo la tabla con su longitud
		int t2[][] = new int[t.length][t[1].length];

		// Guardo el numero que esta en la posicion i j de la tabla 1 a la posicion j i
		// de la tabla 2
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				t2[j][i] = t[i][j];

			}
		}

		return t2;

	}

	static int[][] llenarTabla(int filas, int columnas) {

		// Creo la tabla a llenar
		int t[][] = new int[filas][columnas];

		// Creo un contador
		int cont = 1;

		// Lleno la tabla con numeros en incremento
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				t[i][j] = cont;
				cont++;

			}
		}

		return t;

	}

//Creo esta funcion para pedir al usuario los datos y comprobar que estan bien
	static int pedirDatos(String datos) {

		// Creo la variable que va a guardar si ha dado un error o no
		boolean error = true;

		// Creo la variable que va a guardar el numero dado por el usuario
		int num = 0;

		do {
			try {
				System.out.println("Digame el " + datos);
				num = sc.nextInt();
				assert num > 0 : "El numero debe mayor que 0";
				error = false;
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.err.println("El numero debe ser un entero");
				sc.nextLine();
				error = true;

			} finally {
				sc.nextLine();
			}

		} while (error);

		// Devuelvo el numero
		return num;

	}

}