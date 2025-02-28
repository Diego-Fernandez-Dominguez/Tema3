package boletin5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	// Creo el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo la tabla
		int t[][];

		// Creo la variable que va a guardar si la tabla es encontrado
		boolean encontrado;

		// Creo la variable que va a guardar el numero de filas de la tabla
		int filas;

		// Creo la variable que va a guardar el numero de columnas de la tabla
		int columnas;

		// Creo la variable que va a guardar el numero que el usuario quiere encontrar
		int valor;

		// Creo la variable que va a guardar el mensaje del resultado
		String mensaje;

		// Llamo a la funcion pedirDatos para pedir los datos
		filas = pedirDatos("numero de filas");

		// LLamo a la funcion que pide los datos
		columnas = pedirDatos("numero de columnas");

		// LLamo a la funcion que pide los datos
		valor = pedirDatos("valor que busca");

		// Le pongo el tamanyo a la tabla
		t = new int[filas][columnas];

		// Llamo a la funcion pedirTabla para llenar la tabla con los valores que me
		// dice el usuario
		t = pedirTabla(t);

		encontrado = seEncuentra(t, valor);

		// Guardo en la variable mensaje si el valor esta en la tabla
		mensaje = (encontrado) ? "El valor SI esta en la tabla" : "El valor NO esta en la tabla";

		// Saco el mensaje por pantalla
		System.out.println(mensaje);

		// Cierro el escaner
		sc.close();

	}

	static boolean seEncuentra(int[][] t, int valor) {

		boolean encontrado = false;

		// Creo la variable que va a guardar el contador de j
		int contI = 0;

		// Creo la variable que va a guardar el contador de j
		int contJ = 0;

		do {

			do {

				// Compruebo si t[i][j] es igual al valor dado, significa que ya lo ha
				// encontrado con lo que la variable encontrado se pone en true y se termina el
				// bucle
				if (t[contI][contJ] == valor) {
					encontrado = true;
					contJ = t[contI].length;
				} else {
					contJ++;
				}

			} while (contJ < t[contI].length);

			// Pongo el contador de j a 0
			contJ = 0;

			// Le sumo 1 al contador de i
			contI++;

		} while (!encontrado && contI < t.length);

		return encontrado;

	}

	static int[][] pedirTabla(int[][] t) {

		System.out.println();

		// Pido al usuario que llene la tabla con numeros dados por el
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.println("Dime el numero de la posicion: \nfila: " + i + ", columna: " + j);
				t[i][j] = sc.nextInt();
			}
		}

		System.out.println();

		// Lleno la tabla vacia
		return t;
	}

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
