package bidimensionalgames;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		char board[][];

		boolean winner = false;

		int size;

		size = askData("tell me the size of the board");

		board = new char[size][size];

		fillBoard(board);

		do {

			if (!winner) {
				playGame(board, 'X');

				winner = checkWinner(board, 'X');
			}

			if (!winner) {
				playGame(board, 'O');

				winner = checkWinner(board, 'O');
			}

		} while (!winner);

		printBoard(board);

		sc.close();

	}

	//

	static char[][] playGame(char[][] board, char player) {

		int column;

		int cont;

		boolean out;

		boolean occupied;

		do {

			cont = 0;
			occupied = false;
			out = true;

			System.out.println("\n" + player + " turn");
			printBoard(board);

			System.out.println("\n\nWhat Column");
			column = sc.nextInt();

			do {

				if (board[cont][column] == '-') {
					cont++;
				} else {
					occupied = true;
					cont--;
				}

				if (cont == -1) {
					System.out.println("\n - Say another column -");
				} else {
					out = false;
				}

			} while (!occupied && cont != board.length);

		} while (out);

		if (cont == board.length)
			cont--;

		board[cont][column] = player;

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

		for (int i = 0; i < board.length; i++) {
			if (i == 0) {
				System.out.print("   " + i + " ");
			} else {
				System.out.print(i + " ");
			}
		}
		for (int i = 0; i < board.length; i++) {
			System.out.println();
			System.out.print(i + "  ");

			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}

		}

	}

	//

	static boolean checkWinner(char[][] board, char player) {

		boolean winner = false;

		if (!winner) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length - 3; j++) {

					// Row
					if (board[i][j] == player && board[i][j + 1] == player && board[i][j + 2] == player
							&& board[i][j + 3] == player) {
						winner = true;
						break;
					}
				}
			}
		}

		if (!winner) {
			for (int i = 0; i < board.length - 3; i++) {
				for (int j = 0; j < board[i].length; j++) {

					if (board[i][j] == player && board[i + 1][j] == player && board[i + 2][j] == player
							&& board[i + 3][j] == player) {
						winner = true;
						break;
					}
				}
			}
		}

		if (!winner) {
			for (int i = 0; i < board.length - 3; i++) {
				for (int j = 0; j < board[i].length - 3; j++) {

					// Right - Left Up - Down
					if (board[i][j] == player && board[i + 1][j + 1] == player && board[i + 2][j + 2] == player
							&& board[i + 3][j + 3] == player) {
						winner = true;
						break;
					}
				}
			}
		}

		if (!winner) {
			for (int i = 0; i < board.length - 3; i++) {
				for (int j = 0; j < board[i].length - 3; j++) {

					// Right - Left Down - Up
					if (board[i][j] == player && board[i - 1][j + 1] == player && board[i - 2][j + 2] == player
							&& board[i - 3][j - 3] == player) {
						winner = true;
						break;
					}
				}
			}
		}

		if (winner)
			System.out.println("\nThe winner is the player: " + player);

		return winner;

	}
}