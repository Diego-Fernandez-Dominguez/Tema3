package boletin4parte2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	//Creo el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//Creo la tabla
		int t[][];

		// Creo la variable que va a guardar si la matriz es magica o no
		boolean magica;
		
		// Creo la variable que va a guardar el mensaje del resultado
		String mensaje;

		// Creo la variable que va a guardar el numero de filas de la tabla
		int filas;

		// Creo la variable que va a guardar el numero de columnas de la tabla
		int columnas;

		// Llamo a la funcion pedirDatos para pedir los datos
		filas = pedirDatos("numero de filas");

		// LLamo a la funcion que pide los datos
		columnas = pedirDatos("numero de columnas");

		// Le pongo el tamanyo a la tabla
		t = new int[filas][columnas];

		// Llamo a la funcion pedirTabla para llenar la tabla con los valores que me
		// dice el usuario
		t = pedirTabla(t);

		magica = esMagica(t);

		// Guardo en la variable mensaje si la tabla es simetrica o no
		mensaje = (magica) ? "Es una matriz magica" : "No es una matriz magica";

		// Saco el mensaje por pantalla
		System.out.println(mensaje);
		
		//Cierro el escaner
		sc.close();

	}

	// Creo la funcion para comprobar si la tabla es magica
	static boolean esMagica(int tabla[][]) {

		// Creo la variable que va a guardar si la matriz es magica o no
		boolean magica = true;

		// Creo la variable que va a guardar la suma
		int suma = 0;

		// Creo la variable que va a guardar la suma que tiene que dar
		int sumaPrin = 0;

		// Creo la variable que va a guardar el contador de j
		int contI = 0;

		// Creo la variable que va a guardar el contador de j
		int contJ = 0;

		// Calculo la suma principal
		for (int j = 0; j < tabla[0].length; j++) {
			sumaPrin = tabla[0][j] + sumaPrin;
		}

		do {

			// Calculo la suma de las filas
			do {
				suma = tabla[contI][contJ] + suma;
				contJ++;

			} while (contJ < tabla[contI].length);

			// Si la suma es diferente a la suma principal, significa que no es una matriz
			// magica
			if (suma != sumaPrin) {
				magica = false;
				continue;
			}

			// Pongo la suma a 0
			suma = 0;

			// Pongo el contador de j a 0
			contJ = 0;

			// Calculo la suma de las columnas
			do {
				suma = tabla[contJ][contI] + suma;
				contJ++;

			} while (contJ < tabla.length);

			// Si la suma es diferente a la suma principal, significa que no es una matriz
			// magica
			if (suma != sumaPrin) {
				magica = false;
				continue;
			}

			// Pongo la suma a 0
			suma = 0;

			// Pongo el contador de j a 0
			contJ = 0;

			// Le sumo 1 al contador de i
			contI++;

		} while (magica && contI < tabla.length);

		// Devuelvo si la matriz es magica o no
		return magica;

	}
	
	// Creo la funcion para pedir la tabla
	static int[][] pedirTabla(int[][] t) {

		System.out.println();

		// Pido al usuario que llene la tabla con numeros dados por el
		for (int i = 0; i < t.length; i++) {
			System.out.println();
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
