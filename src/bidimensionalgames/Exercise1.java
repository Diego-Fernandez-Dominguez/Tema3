package bidimensionalgames;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		char board[][] = new char[3][3];

		boolean winner = false;

		int cont;

		cont = 0;

		fillBoard(board);

		do {

			if (!winner) {
				playGame(board, 'X');

				winner = checkWinner(board, 'X');
			}

			if (!winner) {
				cont++;
			}

			System.out.println(cont);

			if (!winner && cont != 9) {
				playGame(board, 'O');

				winner = checkWinner(board, 'O');
			}

			if (!winner && cont != 9) {
				cont++;
			}

		} while (!winner && cont != 9);

		printBoard(board);

		if (cont == 9) {
			System.out.println("\nDRAW!");
		}

		sc.close();

	}

	//

	static char[][] playGame(char[][] board, char player) {

		int row = 0;

		int column = 0;

		boolean occupied = true;

		System.out.println("\n" + player + " turn");
		printBoard(board);

		do {

			System.out.println("\n\nWhat Row");
			row = sc.nextInt();

			System.out.println("What Column");
			column = sc.nextInt();

			if (board[row][column] != '-') {
				System.out.println("Thats position is occupied, put it in another one");
				System.out.println();
				printBoard(board);

			} else {
				occupied = false;
			}

		} while (occupied);

		board[row][column] = player;

		return board;

	}

	//

	static int askData(String data) {

		// Creo la variable que va a guardar si ha dado un error o no
		boolean error = true;

		// Creo la variable que va a guardar el numero dado por el usuario
		int num = 0;

		do {
			try {
				System.out.println("Tell me " + data);
				num = sc.nextInt();
				assert num > 0 : "The number must be above 0";
				error = false;
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.err.println("The number must be an int");
				sc.nextLine();
				error = true;

			} finally {
				sc.nextLine();
			}

		} while (error);

		// Devuelvo el numero
		return num;

	}

	//

	static void fillBoard(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '-';
			}
		}

	}

	//

	static void printBoard(char[][] board) {

		System.out.println();
		System.out.println("   0 1 2");
		for (int i = 0; i < board.length; i++) {
			System.out.println();
			System.out.print(i + "  ");

			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}

		}

	}

	//

	static boolean checkWinner(char[][] board, char player) {

		boolean winner = false;

		// Row
		if (!winner) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
					winner = true;
					i = board.length;
				}
			}
		}

		// Column
		if (!winner) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
					winner = true;
					j = board[0].length;
				}
			}
		}

		// Left - Right
		if (!winner) {
			if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
				winner = true;
			}
		}

		// Right - Left
		if (!winner) {
			if (board[2][0] == player && board[1][1] == player && board[0][2] == player) {
				winner = true;
			}
		}

		if (winner)
			System.out.println("\nThe winner is the player: " + player);

		return winner;

	}
}
