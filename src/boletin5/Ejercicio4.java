package boletin5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	// Creo el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		char tablero[][] = null;

		int posFila;

		int posColumna;

		char pieza;

		System.out.println("Digame la pieza: ");
		pieza = sc.next().toUpperCase().charAt(0);

		posFila = pedirDatos("la fila en la que esta la figura");

		posColumna = pedirDatos("la columna en la que esta la figura");

		switch (pieza) {
		case 'T' -> {
			tablero = torre(posFila, posColumna, pieza);
		}
		case 'A' -> {
			tablero = alfil(posFila, posColumna, pieza);
		}
		case 'D' -> {
			tablero = dama(posFila, posColumna, pieza);
		}
		case 'C' -> {
			tablero = caballo(posFila, posColumna, pieza);
		}
		default -> {
			System.out.println("Pieza no valida");
		}
		}

		for (int i = 0; i < tablero.length; i++) {
			System.out.println();
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
		}

	}

	//

	static char[][] torre(int posFila, int posColumna, char pieza) {

		char tablero[][] = new char[8][8];

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				tablero[i][j] = '-';

			}
		}

		tablero[posFila][posColumna] = 'T';

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				if (tablero[i][j] == 'T') {

				} else {

					if (j == posColumna) {
						if (tablero[i][j] != 'T') {
							tablero[i][j] = 'X';
						}
					} else if (i == posFila) {
						tablero[i][j] = 'X';
					}
				}

			}
		}

		return tablero;

	}

	//

	static char[][] alfil(int posFila, int posColumna, char pieza) {

		char tablero[][] = new char[8][8];

		int cont = 0;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				tablero[i][j] = '-';

			}
		}

		tablero[posFila][posColumna] = 'A';

		for (int i = posFila; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				if (i == posFila) {
					if (tablero[i][j] == 'A') {

					}

				} else {

					if (j == posColumna - cont || j == posColumna + cont) {
						tablero[i][j] = 'X';
					}

				}
			}

			cont++;

		}

		cont = 0;

		for (int i = posFila - 1; i >= 0; i--) {
			cont++;
			for (int j = 0; j < tablero[i].length; j++) {

				if (j == posColumna - cont) {
					tablero[i][j] = 'X';
				} else if (j == posColumna + cont) {
					tablero[i][j] = 'X';
				}

			}
		}

		return tablero;

	}

	//

	static char[][] dama(int posFila, int posColumna, char pieza) {

		char tablero[][] = new char[8][8];

		int cont = 0;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				tablero[i][j] = '-';

			}
		}

		tablero[posFila][posColumna] = 'D';

		for (int i = posFila; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				if (i == posFila) {
					if (tablero[i][j] != 'D') {
						tablero[i][j] = 'X';
					}

				} else {

					if (j == posColumna - cont || j == posColumna + cont) {
						tablero[i][j] = 'X';
					}

					if (j == posColumna) {
						tablero[i][j] = 'X';
					}
				}

			}

			cont++;

		}

		cont = 0;

		for (int i = posFila - 1; i >= 0; i--) {
			cont++;
			for (int j = 0; j < tablero[i].length; j++) {

				if (j == posColumna - cont || j == posColumna + cont) {
					tablero[i][j] = 'X';
				}

				if (j == posColumna) {
					tablero[i][j] = 'X';
				}

			}
		}

		return tablero;

	}

	//

	static char[][] caballo(int posFila, int posColumna, char pieza) {

		char tablero[][] = new char[8][8];

		int cont = 0;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				tablero[i][j] = '-';

			}
		}

		tablero[posFila][posColumna] = 'C';

		for (int i = posFila - 2; i < posFila + 2; i++) {
			cont++;
			for (int j = posColumna - 2; j < posColumna + 2; j++) {

				if (tablero[i][j] == 'C') {

				} else {

					if (j == posColumna - cont || j == posColumna + cont) {
						tablero[i][j] = 'X';
					}

				}
			}

		}

		return tablero;

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
