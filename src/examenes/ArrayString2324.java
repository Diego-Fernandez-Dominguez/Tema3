package examenes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayString2324 {

	static char[][] abecedario = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
			{ 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q' }, { 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' } };

	static String[] frases = {
			"las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos",
			"aprende a vivir y sabras morir bien", "cada dia sabemos mas y entendemos menos",
			"el dinero no puede comprar la vida", "la verdadera sabiduria esta en reconocer la propia ignorancia" };

	static String fraseReal;

	static String fraseCodificada = "";

	static Scanner sc = new Scanner(System.in);

	static Random rand = new Random();

	public static void main(String[] args) {

		char letra = ' ';

		String codigo = " ";

		boolean acertado;

		boolean iguales = false;

		desordenaAbecedario();

		eligeFrase();


		codificaFrase();


		while (!iguales) {
			
			System.out.println(fraseReal);

			System.out.println(fraseCodificada);

			
			System.out.println("\nDime una letra");
			letra = sc.nextLine().toLowerCase().charAt(0);

			System.out.println("Dime un codigo");
			codigo = sc.nextLine();

			acertado = compruebaCodigo(letra, codigo);

			if (acertado) {
				System.out.println("Has acertado");
				iguales = sonIguales();
			} else {
				System.out.println("Has fallado");
			}
		}

		System.out.println("Has ganado");

	}

	static void desordenaAbecedario() {

		int numFila;
		int numColumna;
		char letra1;
		char letra2;

		for (int i = 0; i < abecedario.length; i++) {
			for (int j = 0; j < abecedario.length; j++) {

				numFila = rand.nextInt(0, abecedario.length);
				numColumna = rand.nextInt(0, abecedario[i].length);

				letra1 = abecedario[i][j];
				letra2 = abecedario[numFila][numColumna];

				abecedario[i][j] = letra2;
				abecedario[numFila][numColumna] = letra1;

			}
		}

	}

	static void eligeFrase() {

		int num;

		num = rand.nextInt(0, frases.length);

		fraseReal = frases[num];

	}

	static void codificaFrase() {

		int numI = 0;
		int numJ = 0;

		char caracter;

		for (int letra = 0; letra < fraseReal.length(); letra++) {

			caracter = fraseReal.charAt(letra);

			while (numI < abecedario.length) {

				numJ = 0;

				while (numJ < abecedario[0].length) {

					if (caracter == ' ') {
						fraseCodificada = fraseCodificada + " ";

						numI = abecedario.length;
						numJ = abecedario[0].length;

					} else if (abecedario[numI][numJ] == caracter) {

						fraseCodificada = fraseCodificada + "" + numI + "" + numJ + " ";

						numI = abecedario.length;
						numJ = abecedario[0].length;

					}
					numJ++;
				}
				numI++;

			}
			numI = 0;

		}

	}

	static boolean compruebaCodigo(char letra, String codigo) {

		int codigoNum1;
		int codigoNum2;

		boolean acierto = false;

		codigoNum1 = codigo.charAt(0) - '0';
		codigoNum2 = codigo.charAt(1) - '0';

		for (int i = 0; i < fraseCodificada.length(); i++) {

			if (abecedario[codigoNum1][codigoNum2] == letra) {

				fraseCodificada = fraseCodificada.replaceAll(codigo, letra + "");

				acierto = true;

			}
		}

		return acierto;

	}

	static boolean sonIguales() {

		boolean iguales = false;
		
		String fraseTemp=fraseCodificada;
		
		fraseTemp.replace("  ", " ");

		if (fraseTemp.replace(" ", "") == fraseReal.replace(" ", "")) {

			iguales = true;

		}

		return iguales;

	}

}
