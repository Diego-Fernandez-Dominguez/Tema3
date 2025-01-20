package aceptaelreto;

import java.util.Scanner;

public class Esgritura {

	static Scanner sc = new Scanner(System.in);

	static String frase;

	public static void main(String[] args) {

		boolean esGrito;

		System.out.println("Dime frase");
		frase = sc.nextLine().toLowerCase();

		esGrito = esgrito();

		if (esGrito) {
			System.out.println("Te me relajas tontit@");
		} else {
			System.out.println("Asi me gusta, tranquilit@");
		}

		sc.close();

	}

	static boolean esgrito() {

		int contExc = 0;

		int contLet = 0;

		boolean esGrito = false;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == '!') {
				contExc++;
			} else if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
				contLet++;
			}

		}

		if (contExc > contLet) {
			esGrito = true;
		}
		return esGrito;

	}

}
