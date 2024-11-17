package boletin4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el valor a buscar
		int clave;

		// Creo la tabla
		int t[] = { 1, 2, 3, 4 };

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Le pido el valor a buscar al usuario
		System.out.println("Introduzca el valor clave");
		clave = sc.nextInt();

		// Creo la variable indiceBusqueda y le doy el valor del return de la funcion
		// buscar
		int indiceBusqueda = buscar(t, clave);

		// Saco el indice de busqueda
		System.out.println(indiceBusqueda);

		// Cierro el escaner
		sc.close();

	}

	static int buscar(int t[], int clave) {

		// Creo la variable que va a guardar la posicion en la que se encuentra el valor
		// a buscar
		int indiceBusqueda = 0;

		// Hago una busqueda secuencial para encontrar en que posicion se encuentra el
		// numero a buscar
		while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
			indiceBusqueda++;
		}

		// Si el indice es mayor o igual a la longitud de la tabla, significa que no
		// esta en la tablas
		if (indiceBusqueda >= t.length) {
			indiceBusqueda = -1;
		}

		// Devuelvo el valor del indiceBusqueda
		return indiceBusqueda;

	}

}
