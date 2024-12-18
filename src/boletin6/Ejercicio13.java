package boletin6;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {

		String palabra;
		String palabra2;

		boolean esAnagrama;

		Scanner sc = new Scanner(System.in);

		// Le pido la primera palabra al usuario y este la introduce
		System.out.println("Digame la palabra 1");
		palabra = sc.nextLine().replace(" ", "");

		// Le pido la segunda palabra al usuario y este la introduce
		System.out.println("Digame la palabra 2");
		palabra2 = sc.nextLine().replace(" ", "");

		esAnagrama = esAnagrama(palabra2, palabra);
		
		System.out.println(esAnagrama ? "Son anagramas" : "No son anagrama");
		
		sc.close();
	}

	static boolean esAnagrama(String palabra2, String palabra) {

		boolean esAnagrama;

		int cont = 0;
		int cont2 = 0;
		int apariciones=0;
		
		char letras[] = new char[palabra.length()];
		
		for (int i = 0; i < palabra.length(); i++) {
			letras[i] = palabra.charAt(i);
		}

		if (letras.length > palabra.length() || letras.length < palabra.length()) {

			esAnagrama = false;
			
		} else {

			while (cont < letras.length) {
				while (cont2 < letras.length) {
					
					if (letras[cont2] == palabra.charAt(cont)) {
						apariciones++;
						letras[cont2] = '-';
						cont2 = letras.length-1;
					}
					cont2++;

				}
				cont2 = 0;
				cont++;
			}

		}

		if (apariciones == letras.length) {
			esAnagrama = true;
		} else {
			esAnagrama = false;
		}
		
		return esAnagrama;

	}

}
