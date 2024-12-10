package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Creo la tabla que va a guardar los caracteres acertados
		char[] acertados;

		// Creo la variable que va a guardar la contraseña
		String contra;

		// Creo la variable que va a guardar el intento de acierto
		String acierto;

		// Le pido al usuario que introduzca la contraseña
		System.out.println("Introduzca la contraseña");
		contra = sc.nextLine();

		// Le pongo la longitud a la tabla
		acertados = new char[contra.length()];

		// Lleno la tabla de asteriscos
		Arrays.fill(acertados, '*');

		// Le pido al usuario que intente acertar la contraseña
		System.out.println("Intente acertar la contraseña");
		acierto = sc.nextLine();

		while (!contra.equals(acierto)) {

			// Compruebo si ha acertado algun caracter, si es asi que la ponga en la tabla
			// en su posicion correspondiente
			for (int i = 0; i < contra.length(); i++) {
				if (contra.charAt(i) == acierto.charAt(i)) {
					acertados[i] = contra.charAt(i);
				}
			}

			// Saco por pantalla la tabla de acertados
			System.out.println(Arrays.toString(acertados));

			// Le pido al usuario que intente acertar la contraseña
			System.out.println("Intente acertar la contraseña");
			acierto = sc.nextLine();
		}

		// El jugador ha ganado
		System.out.println("Contraseña acertada");

		// Cierro el escaner
		sc.close();

	}

}
