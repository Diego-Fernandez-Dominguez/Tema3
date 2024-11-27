package boletin5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	// Creo el escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo el tablero
		char tablero[][] = new char[8][8];

		// Creo la variable que va a guardar la fila de la pieza
		int posFila;

		// Creo la variable que va a guardar la columna de la pieza
		int posColumna;

		// Creo la variable que va a guardar el tipo de pieza
		char pieza;

		// Pido la pieza
		System.out.println("Digame la pieza: ");
		pieza = sc.next().toUpperCase().charAt(0);

		// Pido la fila
		posFila = pedirDatos("la fila en la que esta la figura");

		// Pido la columna
		posColumna = pedirDatos("la columna en la que esta la figura");

		// Dependiendo de la pieza que haya elegido, va a irse a una funcion
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

		// Saco la tabla por pantalla
		sacarTabla(tablero);

		// Cierro el escaner
		sc.close();

	}

	//

	static char[][] torre(int posFila, int posColumna, char pieza) {

		// Creo el tablero
		char tablero[][] = new char[8][8];

		// Relleno la tabla de guiones
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-';
			}
		}

		// Pongo a la torre en su posicion
		tablero[posFila][posColumna] = 'T';

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				// Si J esta en la misma columna que la torre y no en la posicion de la T, pone
				// una X
				if (j == posColumna) {
					if (tablero[i][j] != 'T') {
						tablero[i][j] = 'X';
					}

					// Si I esta en la misma fila que la torre, pone una X
				} else if (i == posFila) {
					tablero[i][j] = 'X';
				}

			}
		}

		// Devuelvo el tablero
		return tablero;

	}

	//

	static char[][] alfil(int posFila, int posColumna, char pieza) {

		// Creo el tablero
		char tablero[][] = new char[8][8];

		// Creo el contador
		int cont = 0;

		// Relleno la tabla de guiones
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-';
			}
		}

		// Pongo al alfil en su posicion
		tablero[posFila][posColumna] = 'A';

		// Este for sirve para llenar la parte inferior de la pieza
		for (int i = posFila; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				// Si la i es diferente a la posicion de la figura, no hace nada.
				if (i != posFila) {

					// Si se cumplen estas condiciones significa que es un sitio por donde la pieza
					// se puede mover, con lo que la marco con una X
					if (j == posColumna - cont || j == posColumna + cont) {
						tablero[i][j] = 'X';
					}

				}
			}

			// Le sumo 1 al contador
			cont++;

		}

		// Pongo el contador a 1
		cont = 1;

		// Este for sirve para llenar la parte superior de la pieza
		for (int i = posFila - 1; i >= 0; i--) {
			for (int j = 0; j < tablero[i].length; j++) {

				// Si se cumple una de estas condiciones significa que es un sitio por donde la
				// pieza se puede mover, con lo que la marco con una X
				if (j == posColumna - cont || j == posColumna + cont) {
					tablero[i][j] = 'X';
				}

			}

			// Le sumo 1 al contador
			cont++;

		}

		// Devuelvo el tablero
		return tablero;

	}

	//

	static char[][] dama(int posFila, int posColumna, char pieza) {

		// Creo el tablero
		char tablero[][] = new char[8][8];

		// Creo el contador
		int cont = 0;

		// Relleno la tabla de guiones
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-';
			}
		}

		// Pongo a la dama en su posicion
		tablero[posFila][posColumna] = 'D';

		// Este for llena la parte inferior del tablero
		for (int i = posFila; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				// Si i es igual a la posicion de la fila, hay dos posibilidades
				if (i == posFila) {

					// Si es diferente a ´D´ pone una ´X´
					if (tablero[i][j] != 'D') {
						tablero[i][j] = 'X';
					}

				} else {

					// Si se cumple una de estas dos condiciones se pone una ´X´
					if (j == posColumna - cont || j == posColumna + cont) {
						tablero[i][j] = 'X';
					}

					// Y si se cumle esta condicion se pone una ´X´
					if (j == posColumna) {
						tablero[i][j] = 'X';
					}
				}

			}

			// Le sumo 1 al contador
			cont++;

		}

		// Pongo el contador a 0
		cont = 0;

		// Este for llena la parte superior del tablero
		for (int i = posFila - 1; i >= 0; i--) {

			// Le sumo 1 al contador
			cont++;

			for (int j = 0; j < tablero[i].length; j++) {

				// Si se cumple una de estas dos condiciones se pone una ´X´
				if (j == posColumna - cont || j == posColumna + cont) {
					tablero[i][j] = 'X';
				}

				// Y si se cumle esta condicion se pone una ´X´
				if (j == posColumna) {
					tablero[i][j] = 'X';
				}

			}
		}

		// Devuelvo el tablero
		return tablero;

	}

	//

	static char[][] caballo(int posFila, int posColumna, char pieza) {

		// Creo el tablero
		char tablero[][] = new char[8][8];

		// Creo el contador inicializado a 1
		int cont = 1;

		// Relleo el tablero de guiones
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '-';
			}
		}

		// Pongo al caballo en su posicion
		tablero[posFila][posColumna] = 'C';

		// Este for rellena la parte superior de la pieza
		for (int i = 0; i < posFila; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				// Si se cumple una de estas dos condiciones significa que el caballo se puede
				// mover ahi, con lo que coloco una ´X´
				if (i == posFila - 2 && j == posColumna - 1 || i == posFila - 2 && j == posColumna + 1) {
					tablero[i][j] = 'X';

					// O se puede cumplir una de estas dos, lo cual significa lo mismo
				} else if (i == posFila - 1 && j == posColumna - 2 || i == posFila - 1 && j == posColumna + 2) {
					tablero[i][j] = 'X';
				}

			}

			// Si i es igual a la posicion de la fila -2 le sumo 1 al contador
			if (i <= posFila - 2) {
				cont++;
			}

		}

		// Vuelvo a poner el contador a 1
		cont = 1;

		// Este for rellena la parte de la pieza
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {

				// Si se cumple una de estas dos condiciones significa que el caballo se puede
				// mover ahi, con lo que coloco una ´X´
				if (i == posFila + 1 && j == posColumna + 2 || i == posFila + 1 && j == posColumna - 2) {
					tablero[i][j] = 'X';

					// O se puede cumplir una de estas dos, lo cual significa lo mismo
				} else if (i == posFila + 2 && j == posColumna + 1 || i == posFila + 2 && j == posColumna - 1) {
					tablero[i][j] = 'X';
				}

			}

			// Si i es igual a la posicion de la fila +2 le sumo 1 al contador
			if (i <= posFila + 2) {
				cont--;
			}
		}

		// Devuelvo el tablero
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

	static void sacarTabla(char[][] tablero) {

		// Saco la tabla por pantalla
		for (int i = 0; i < tablero.length; i++) {
			System.out.println();
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
		}

	}
}