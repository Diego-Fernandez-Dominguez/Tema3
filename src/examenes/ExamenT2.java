package examenes;

import java.util.Random;
import java.util.Scanner;

public class ExamenT2 {

	static Scanner sc = new Scanner(System.in);

	static Random rand = new Random();

	public static void main(String[] args) {

		double puntosJ1 = 0;
		double puntosJ2 = 0;

		double num1;
		double num2;

		int carta;

		char eleccion;

		String palo;

		String figura;

		for (int i = 1; i <= 2; i++) {

			if (i == 2) {
				puntosJ1 = puntosJ2;
			}

			puntosJ2 = 0;

			System.out.println("\nJugador " + i + ", desea pedir una carta");
			eleccion = sc.nextLine().toUpperCase().charAt(0);

			while (eleccion == 'S') {

				carta = rand.nextInt(0, 11);

				palo = switch (rand.nextInt(1, 4)) {

				case 1 -> {

					yield "oros";

				}
				case 2 -> {
					yield "copas";

				}
				case 3 -> {
					yield "espadas";

				}

				default -> {
					yield "bastos";
				}
				};

				num1 = rand.nextInt(1, 11);

				if (num1 > 7) {

					num1 = 0.5;

					figura = switch (rand.nextInt(1, 4)) {

					case 1 -> {

						yield "sota";

					}
					case 2 -> {
						yield "caballo";

					}
					case 3 -> {
						yield "rey";

					}

					case 4 -> {
						yield "bastos";

					}

					default -> {
						yield "imposible";
					}
					};

					System.out.println("Tu carta es: " + figura + " de " + palo);

				} else {

					System.out.println("Tu carta es: " + num1 + " de " + palo);

				}

				puntosJ2 = num1 + puntosJ2;

				System.out.println("Tienes " + puntosJ2 + " puntos");

				if (puntosJ2 > 7.5) {

					System.out.println("Te has pasado maquina");
					eleccion = 'N';

				} else {

					System.out.println("\nJugador " + i + ", desea pedir una carta");
					eleccion = sc.nextLine().toUpperCase().charAt(0);

				}

			}

		}

		System.out.println("\nEl JUGADOR 1 tiene " + puntosJ1 + " y el jugador 2 tiene " + puntosJ2 + " puntos");

		if (puntosJ1 <= 7.5 && puntosJ1 > puntosJ2) {
			System.out.println("Ha ganado jugador 1");

		} else if (puntosJ1 <= 7.5 && puntosJ2 > 7.5) {
			System.out.println("Ha ganado jugador 1");

		} else if (puntosJ2 <= 7.5 && puntosJ2 > puntosJ1) {
			System.out.println("Ha ganado jugador 2");

		} else if (puntosJ2 <= 7.5 && puntosJ1 > 7.5) {
			System.out.println("Ha ganado jugador 2");

		} else if (puntosJ1 == 0 && puntosJ2 == 0 || puntosJ1 > 7.5 && puntosJ2 == 0 || puntosJ2 > 7.5 && puntosJ1 == 0
				|| puntosJ1 > 7.5 && puntosJ2 > 7.5) {
			System.out.println("Empate");
		}

	}
}
