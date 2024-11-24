package boletin5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	// Creo el escaner
	static Scanner sc = new Scanner(System.in);

	// Creo el randomizador
	static Random rand = new Random();

	public static void main(String[] args) {

		// Creo la tabla que va a ser desordenada
		int t[];

		// Creo la variable que va a guardar el tamanyo de la tabla unidimensional
		int tamanyo;

		// LLamo a la funcion que pide los datos
		tamanyo = pedirDatos("tamanyo de la tabla");

		// Le pongo el tamanyo a la tabla
		t = new int[tamanyo];

		// Llamo a la funcion pedirTabla para llenar la tabla con los valores que me
		// dice el usuario
		t = pedirTabla(t);

		// Saco la tabla dada por el usuario
		System.out.println("Tabla original: ");
		System.out.println(Arrays.toString(t));

		// Desordeno la tabla unidimensionals
		t = desordenarTablaUnidimensional(t);

		System.out.println();

		// Saco la tabla desordenada
		System.out.println("Tabla desordenada: ");
		System.out.println(Arrays.toString(t));

		// Cierro el escaner
		sc.close();

	}

	//

	static int[] desordenarTablaUnidimensional(int[] t) {

		// Creo la variable que va a guardar el numero a cambiar de posicion
		int num;

		// Creo la variable que va a guardar la posicion del numero que se va a cambiar
		int posicion;

		for (int i = 0; i < t.length; i++) {

			// Guardo el numero de la posicion actual en la variable num
			num = t[i];

			// Saco la posicion del numero a cambiar con el random
			posicion = rand.nextInt(0, t.length);

			// Intercambio posiciones
			t[i] = t[posicion];
			t[posicion] = num;

		}

		// Devuelvo la tabla
		return t;

	}

	//

	static int[] pedirTabla(int[] t) {

		System.out.println();

		// Pido al usuario que llene la tabla con numeros dados por el
		for (int i = 0; i < t.length; i++) {
			System.out.println("Dime el numero de la posicion: " + i);
			t[i] = sc.nextInt();
		}

		System.out.println();

		// Lleno la tabla vacia
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
