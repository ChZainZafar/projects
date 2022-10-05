import java.util.*;

public class Tictac {

	static char[][] board = new char[3][3];
	static boolean isWin = false;
	static boolean isUser1Turn = true;
	static Scanner sc = new Scanner(System.in);

	static final char holder = '_';

	static void setBoard() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				board[row][col] = holder;
			}
		}
	}

	static void printBoard() {
		System.out.println("   0 1 2");
		for (int row = 0; row < 3; row++) {
			System.out.print(row + " ");
			for (int col = 0; col < 3; col++) {
				System.out.print(" " + board[row][col]);
			}
			System.out.println();
		}
	}

	static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	static int takeInputInt() {
		int input = sc.nextInt();
		return input;
	}

	public static void main(String[] args) {

		int noOfTurns = 0;
		clearScreen();
		setBoard();
		do {

			clearScreen();
			System.out.println("noOFTurns: " + noOfTurns);
			printBoard();
			if (isUser1Turn) {
				int row, col;
				do {
					System.out.println("Enter user 1: row = ");
					row = takeInputInt();
					System.out.println("Enter user 1: col = ");
					col = takeInputInt();
				} while (board[row][col] != holder);
				board[row][col] = 'X';
				isUser1Turn = false;
			} else {
				int row, col;
				do {
					System.out.println("Enter user 2: row = ");
					row = takeInputInt();
					System.out.println("Enter user 2: col = ");
					col = takeInputInt();
				} while (board[row][col] != holder);
				board[row][col] = 'O';
				isUser1Turn = true;
			}
			noOfTurns++;
			if (noOfTurns == 9) {
				System.out.println("Draw");
				break;

			}
			if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'
					|| board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'
					|| board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'
					|| board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'
					|| board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'
					|| board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'
					|| board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'
					|| board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
				System.out.println("User 2 wins!!!!");
				break;
			} else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'
					|| board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'
					|| board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X'
					|| board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'
					|| board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'
					|| board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'
					|| board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'
					|| board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
				System.out.println("User 1 wins!!!!");
				break;
			}

		} while (!isWin || noOfTurns != 9);
	}
}