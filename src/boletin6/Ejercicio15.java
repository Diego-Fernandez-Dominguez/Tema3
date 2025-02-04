package boletin6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {

		// Variable que va a guardar la frase dada por el usuario
		String frase;

		// Array que va a guardar la frase desordenada
		char fraseDesor[];

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

		// Compruebo si la frase esta vacia, si es asi le salta un mensaje al usuario de
		// que la frase no puede estar vacia
		if (frase.isEmpty()) {
			System.out.println("La frase no puede estar vacia");
		} else {

			// Llamo a la funcion que desordena la frase
			desordenarFrase(fraseDesor);

		}

		do {

			// Saco la frase desordenada por pantalla
			System.out.println("\n" + String.valueOf(fraseDesor));

			// Le pido la frase al jugador 2
			System.out.println("Digame la frase ordenada");
			intento = noesnavidad.nextLine();

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
