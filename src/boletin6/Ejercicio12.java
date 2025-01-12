package boletin6;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int posPal = 0;
		int max = 0;

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame una frase");
		frase = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			//
			if (frase.charAt(i) != ' ') {
				cont++;
			} else {
				cont = 0;
			}

			// Compruebo si el contador es mayor que el maximo, si es asi igualo el contador
			// al maximo y le doy valo a la posicion de la palabra
			if (cont > max) {
				max = cont;
				posPal = i - (cont - 1);
			}

		}

		// Saco la frase por pantalla
		System.out.println("Numero de letras: " + max + "\nPalabra: " + frase.substring(posPal, posPal + max));

		// Cierro el escaner
		sc.close();

	}

}
