package boletin6;

import java.util.Random;
import java.util.Scanner;

public class Examen2223 {

	static String palabras[] = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

	static final int NUM_INTENTOS = 7;

	static String palabraSecreta;

	static String palabraPista = "";

	static String noAcertadas;

	static Scanner sc = new Scanner(System.in);

	static Random rand = new Random();

	public static void main(String[] args) {

		int opcion;
		String palabra;
		char letra;

		generaPalabra();

		pintaPista();

		opcion = menu();

		if (opcion == 1) {

			System.out.println("Has elegido la letra");
			letra = sc.next().charAt(0);
			compruebaLetra(letra);

		} else {

			System.out.println("Has elegido la palabra");
			palabra = sc.next();
			compruebaPalabra(palabra);

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

	}

	//
	static void compruebaPalabra(String palabra) {
		
		if(palabra.equals(palabraSecreta)) {
			palabraPista=palabraSecreta;
		}

	}

	//
	static void pintaPista() {

		System.out.println(palabraPista);

	}

}
