package bidimensionalgames;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		char board[][] = new char[3][3];

		boolean winner = false;

		fillBoard(board);

		do {

			if(!winner){
			playGame(board, 'X');
			
			checkWinner(board, 'X');
			}
			
			if(!winner) {
			playGame(board, 'O');
			
			checkWinner(board, 'O');
			}
			
		} while (!winner);

		printBoard(board);

		sc.close();

	}

	//

	static char[][] playGame(char[][] board, char player) {

		int row;

		int column;

		System.out.println("\n" + player + " turn");
		printBoard(board);

		System.out.println("\n\nWhat Row");
		row = sc.nextInt();

		System.out.println("What Column");
		column = sc.nextInt();

		board[row][column] = player;

		return board;

	}

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

		for (int i = 0; i < board.length; i++) {
			System.out.println();
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
		}

	}

	static boolean checkWinner(char[][] board, char player) {
		
		boolean winner=false;	
		
		for(int i=0;i < board.length;i++) {
			for(int j=0;j < board[i].length;j++) {
		if(board[i][j]==player && board[i][j]==player && board[i][j]==player) {
			winner=true;
		}
		}
	}
		
		return winner;
		
	}
}
