package boletin6;

import java.util.Random;
import java.util.Scanner;

public class Examen2223 {

	static String palabras[] = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

	static final int NUM_INTENTOS = 7;

	static String palabraSecreta;

	static String palabraPista = "";

	static String noAcertadas = " ";

	static Scanner sc = new Scanner(System.in);

	static Random rand = new Random();

	public static void main(String[] args) {

		int opcion;
		String palabra;
		char letra;

		generaPalabra();

		while (!palabraSecreta.equals(palabraPista) && noAcertadas.length() < NUM_INTENTOS + 1) {
			pintaPista();

			opcion = menu();

			if (opcion == 1) {

				System.out.println("Has elegido la letra");
				letra = sc.next().toLowerCase().charAt(0);
				compruebaLetra(letra);

			} else {

				System.out.println("Has elegido la palabra");
				palabra = sc.next().toLowerCase();
				compruebaPalabra(palabra);

			}

			System.out.println("FALLADAS: " + noAcertadas);

		}

		if (palabraSecreta.equals(palabraPista)) {
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
		} else {

			System.out.println("GAME OVER");
		}

		sc.close();

	}

	//
	static void generaPalabra() {

		palabraSecreta = palabras[rand.nextInt(0, palabras.length)];

		for (int i = 0; i < palabraSecreta.length(); i++) {
			palabraPista += "" + "_";
		}

	}

	//
	static int menu() {

		int opcion;

		System.out.println(
				"\nSeleccione una de las siguientes opciones:" + "\n1. Introducir letra." + "\n2. Introducir palabra.");

		opcion = sc.nextInt();

		return opcion;

	}

	//
	static void compruebaLetra(char letra) {

		String palabraPistaTemp = palabraPista;
		boolean acertado = false;
		boolean repetido = false;
		int cont = 0;

		if (noAcertadas.length() != 1) {
			while (!repetido && cont < noAcertadas.length()) {
				if (letra == noAcertadas.charAt(cont)) {
					repetido = true;
				}
				cont++;
			}
		}

		if (!repetido) {
			for (int i = 0; i < palabraSecreta.length(); i++) {

				if (letra == palabraSecreta.charAt(i)) {
					palabraPista = palabraPistaTemp.substring(0, i) + letra + palabraPistaTemp.substring(i + 1);
					palabraPistaTemp = palabraPista;
					acertado = true;
				}

			}

			if (!acertado) {
				noAcertadas += letra;
			}
		} else {
			System.out.println("Has repetido letra, vuelva a introducir una");
		}

	}

	//
	static void compruebaPalabra(String palabra) {

		if (palabra.equals(palabraSecreta)) {
			palabraPista = palabraSecreta;
		}

	}

	//
	static void pintaPista() {

		System.out.println(palabraPista);

	}

}
