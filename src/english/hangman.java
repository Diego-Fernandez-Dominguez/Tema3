package english;

import java.util.Arrays;
import java.util.Scanner;

public class hangman {
	public static void main(String[] args) {

		String words[] = { "happiness", "java", "drugs", "javalenjavalon", "english" };
		char nope[]=new char[7];

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Creo la tabla que va a guardar los caracteres acertados
		char[] brb;

		int num;
		
		int position=0;
		
		int cont=0;

		// Creo la variable que va a guardar la contraseña
		String password = "";

		// Creo la variable que va a guardar el intento de acierto
		char guess;

		// Le pido al usuario que introduzca la contraseña
		System.out.println(Arrays.toString(words));
		num = sc.nextInt();

		password = words[num];

		// Le pongo la longitud a la tabla
		brb = new char[password.length()];

		// Lleno la tabla de asteriscos
		Arrays.fill(brb, '_');
		Arrays.fill(nope, '_');

		do {

			for(int i=0;i<brb.length;i++) {
				System.out.print(brb[i] + " ");
			}
			
			System.out.println("\n\nFails");
			for(int i=0;i<nope.length;i++) {
				System.out.print(nope[i] + " ");
			}
			

			System.out.println("\nGuess the word");
			guess = sc.next().charAt(0);

			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == guess) {
					brb[i] = password.charAt(i);
					
				}else {
					cont++;
				}
			}
			
			if(cont==password.length()) {
				nope[position++]=guess;
			}
			
			cont=0;

		} while (!password.equals(String.valueOf(brb)) || nope[6]=='_');

		if(nope[6]!='_') {
		System.out.println("Guess the password");
		}else {
			System.out.println("Yu lus manco");
		}
		sc.close();

	}

}
