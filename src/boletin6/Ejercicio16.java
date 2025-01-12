package boletin6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {

		// Variable que va a guardar la frase dada por el usuario
		String frase;

		// Array que va a guardar la frase desordenada
		char fraseDesor[];

		// Array que va a guardar las posicion de los caracteres que se han acertado
		String fraseAcierto[];

		// Creo la variable que va a guardar el intento del jugador 2
		String intento = "";

		// Creo el escaner
		Scanner noesnavidad = new Scanner(System.in);

		// El usuario introduce la frase
		System.out.println("Digame la frase");
		frase = noesnavidad.nextLine();

		// Convierto la frase dada por el usuario en un array, para que sea mas facil
		// desordenarla
		fraseDesor = frase.toCharArray();

		fraseAcierto = new String[frase.length()];

		// Compruebo si la frase esta vacia, si es asi le salta un mensaje al usuario de
		// que la frase no puede estar vacia
		if (frase.isEmpty()) {
			System.out.println("La frase no puede estar vacia");
		} else {

			// Llamo a la funcion que desordena la frase
			desordenarFrase(fraseDesor);

		}

		Arrays.fill(fraseAcierto, "");

		do {

			// Saco la frase desordenada por pantalla
			System.out.println("\n" + String.valueOf(fraseDesor));

			// Le pido la frase al jugador 2
			System.out.println("Digame la frase ordenada");
			intento = noesnavidad.nextLine();

			// Si no ha acertado la frase comprobara las posiciones de la frase dada por el
			// jugador y la frase ordenada, si algun caracter esta en la misma posicion la
			// guardara en el array fraseAciertos
			if (!frase.equals(intento)) {

				try {

					for (int i = 0; i < intento.length(); i++) {
						if (frase.charAt(i) == intento.charAt(i)) {
							fraseAcierto[i] = String.valueOf(frase.charAt(i));
						}
					}

					// Pongo este catch para que no se cierre el programa si el acierto es de mayor
					// tamanyo que la frase original
				} catch (StringIndexOutOfBoundsException e) {
				}

				System.out.println(Arrays.toString(fraseAcierto));

			}

		} while (!frase.equals(intento));

		// El jugador ha ganado, yupiiiiiiiii
		System.out.println("\nHas acertado, felicidades");

		// Cierro el escaner
		noesnavidad.close();

	}

	static void desordenarFrase(char fraseDesor[]) {

		// Variable que va a guardar la posicion del caracter que se va a
		// intercambiar
		int num;

		// Variables que van a guardar las lestras que se van a intercambiar
		char letra;
		char letra2;

		// Creo el randomizador
		Random tristeza = new Random();

		for (int i = 0; i < fraseDesor.length; i++) {

			// Saco las dos posiciones aleatorias
			num = tristeza.nextInt(0, fraseDesor.length);

			// Si las dos posiciones son iguales, que vuelva a generar una hasta que sean
			// distintas
			while (num == i) {
				num = tristeza.nextInt(0, fraseDesor.length);
			}

			// Saco las letras de las posiciones
			letra = fraseDesor[i];
			letra2 = fraseDesor[num];

			// Desordeno las frases
			fraseDesor[i] = letra2;
			fraseDesor[num] = letra;

		}

	}

}
