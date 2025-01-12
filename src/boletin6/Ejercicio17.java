package boletin6;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {

		// Variable que va a guardar la frase dada por el usuario
		String frase;

		// Frase ejemplo
		// frase = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";

		// Crear el escáner
		Scanner luis = new Scanner(System.in);

		// Le pido la frase al usuario y este la da
		System.out.println("Dígame la frase:");
		frase = luis.nextLine();

		// Llamo a la funcion para quitar los comentarios
		String resultado = quitarComentarios(frase);

		// Saco el resultado por pantalla
		System.out.println("Sin comentarios: " + resultado);

		// Cierro el escaner
		luis.close();

	}

	static String quitarComentarios(String frase) {

		// Creo una variable String vacia la cual va a servir para concatenar la farse
		// sin comentarios
		String resultado = "";

		// Creo la variable que va a guardar la posicion
		int pos = 0;

		// Cre la variable que va a a guardar la posicion final del comentario
		int finComentario;

		// Cre la variable que va a a guardar la posicion inicial del comentario
		int inicioComentario;

		while (pos < frase.length()) {

			// Busco la primera posicion del comentario
			inicioComentario = frase.indexOf("/*", pos);
			if (inicioComentario == -1) {

				//Concateo la frase
				resultado += frase.substring(pos);

			} else {

				// Añadir la parte antes del comentario
				resultado += frase.substring(pos, inicioComentario);

				// Busco el fin del comentario
				finComentario = frase.indexOf("*/", inicioComentario + 2);

				// Continuo despues del fin del comentario
				pos = finComentario + 2;
			}
		}

		//Devuelvo el resultado
		return resultado;
	}
}
