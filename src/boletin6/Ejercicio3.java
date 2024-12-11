package boletin6;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Creo la variable que va a guardar la frase
		String frase;

		// Creo la variable que va a guardar cuantos espacios tiene la frase
		int numEspacios;

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame la frase");
		frase = sc.nextLine();

		// Llamo a la funcion para averiguar cuantos espacios tiene la frase
		numEspacios = comprobarEspacios(frase);

		// Saco el resultado por pantalla
		System.out.println("La frase tiene " + numEspacios + " espacio/s");

		// Cierro el escaner
		sc.close();

	}

	static int comprobarEspacios(String frase) {

		// Creo la variable que va a guardar cuantos espacios tiene la frase
		int cont = 0;

		for (int i = 0; i < frase.length(); i++) {

			// Compruebo si el caracter actual es igual a un espacio, si es asi le sumo 1 al
			// contador
			if (frase.charAt(i) == ' ') {
				cont++;
			}

		}

		// Devuelvo el contador
		return cont;

	}

}
