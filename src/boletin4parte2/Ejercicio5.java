package boletin4parte2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	// Creo el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo la tabla
		int t[][];

		// Creo la tabla que va a guardar la tabla principal girada
		int tGirada[][];

		// Creo la variable que va a guardar el numero de filas y columnas de la tabla
		int filasColum;

		// Llamo a la funcion pedirDatos para pedir los datos
		filasColum = pedirDatos("numero de filas");

		// Llamo a la funcion para girar la tabla
		t = llenarTabla(filasColum);

		// Llamo a la funcio que va a giara la tabla 90º
		tGirada = gira90(t);

		// Saco la tabla original por pantalla
		System.out.println("Tabla principal: ");
		for (int i = 0; i < t.length; i++) {
			System.out.println(Arrays.toString(t[i]));
		}

		// Linea en blanco
		System.out.println();

		// Saco la tabla girada por pantalla
		System.out.println("Tabla girada 90º: ");
		for (int i = 0; i < tGirada.length; i++) {
			System.out.println(Arrays.toString(tGirada[i]));
		}

	}

	//

	static int[][] gira90(int tablaInicio[][]) {

		// Creo la tabla que va a ser girada
		int tGirada[][] = new int[tablaInicio.length][tablaInicio[0].length];

		// Creo el contador que va a actuar como i en el segundo for
		int cont = 0;

		// Empezando desde la ultima fila de la tabla dada por el usuario, restandole 1
		// a i, coloco la fila en la columna de la tabla girada
		for (int i = tablaInicio.length - 1; i >= 0; i--) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
				tGirada[j][cont] = tablaInicio[i][j];
			}

			// Le sumo 1 al contador
			cont++;
		}

		// Devuelvo la tabla girada 90º
		return tGirada;

	}

	//

	// Lleno la tabla
	static int[][] llenarTabla(int filasColum) {

		// Creo la tabla a llenar
		int t[][] = new int[filasColum][filasColum];

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

	//

	// Creo esta funcion para pedir al usuario los datos y comprobar que estan bien
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
