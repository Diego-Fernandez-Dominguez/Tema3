package boletin7;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//
		HashMap<String, String> acceso = new HashMap<String, String>();

		int eleccion = 3;

		int intentos = 0;

		boolean acertado = false;

		String usuario;

		String contrasenya;

		while (eleccion != 0) {

			System.out.println("Eliga una opcion: ");
			System.out.println("\n1. Registro ");
			System.out.println("2. Login ");
			System.out.println("0. Salir");

			eleccion = sc.nextInt();

			sc.nextLine();

			switch (eleccion) {

			case 1 -> {
				System.out.println("Registro");
				System.out.println("Ponga el usuario a crear");
				usuario = sc.nextLine();

				System.out.println("Ponga la contraseña");
				contrasenya = sc.nextLine();

				acceso.put(usuario, contrasenya);

			}

			case 2 -> {

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

				if (intentos == 3) {
					System.out.println("Lo siento, no tiene acceso al área restringida");
				} else {
					System.out.println("Ha accedido al área restringida");
				}
			}

			case 0 -> {
				System.out.println("Adioh");
			}

			}

		}
		
		sc.close();

	}
}
