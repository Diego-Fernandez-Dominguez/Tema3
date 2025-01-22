package boletin7;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo el mapa que va a guardar el usuario y la contraseña
		HashMap<String, String> acceso = new HashMap<String, String>();

		// Creo la variable que va a guardar la eleccion del usuario
		int eleccion = 3;

		// Creo la variable que va a guardar el numero de intentos del usuario
		int intentos = 0;

		// Creo un booleano que guarda si el usuario ha acertado la contrasenya
		boolean acertado = false;

		// Creo la variable que va a guardar el usuario
		String usuario;

		// Creo la variable que va a guardar la contrasenya
		String contrasenya;

		// Mientras que la eleccion sea distinta a 0 se va a repetir este bucle
		while (eleccion != 0) {

			// Se saca el menu por pantalla
			System.out.println("Eliga una opcion: ");
			System.out.println("\n1. Registro ");
			System.out.println("2. Login ");
			System.out.println("0. Salir");

			// El usuario introduce su eleccion
			eleccion = sc.nextInt();
			sc.nextLine();

			// Dependiendo de la eleccion, se hara una accion distinta
			switch (eleccion) {

			// El usuario se registra
			case 1 -> {
				System.out.println("Registro");
				System.out.println("Ponga el usuario a crear");
				usuario = sc.nextLine();

				System.out.println("Ponga la contraseña");
				contrasenya = sc.nextLine();

				acceso.put(usuario, contrasenya);

			}

			case 2 -> {

				// El usuario tiente 3 intentos para adivinar la contraseña y el usuario
				while (intentos != 3 && !acertado) {
					System.out.println("Ponga el usuario");
					usuario = sc.nextLine();

					System.out.println("Ponga la contraseña");
					contrasenya = sc.nextLine();

					if (acceso.get(usuario).equals(contrasenya)) {
						System.out.println("Has accedido al usuario\n");
						acertado = true;
					} else {
						System.out.println("Contraseña fallida\n");
						intentos++;
					}

				}

				// Cuando supere los intentos se le pondra que no ha accedido a la pagina
				if (intentos == 3) {
					System.out.println("Lo siento, no tiene acceso al área restringida");

					// El usuario lo ha conseguido
				} else {
					System.out.println("Ha accedido al área restringida");
				}
			}

			// Cierro el programa
			case 0 -> {
				System.out.println("Adioh");
			}

			}

		}

		// Cierro el escaner
		sc.close();

	}
}
