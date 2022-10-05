import java.util.*;

public class Intelligently {
    static char[][] board = new char[3][3];
    static boolean check = false;
    static boolean isWin = false;
    static boolean isUser1Turn = false;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

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

    static boolean checkWin() {
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'
                || board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'
                || board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'
                || board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'
                || board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'
                || board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'
                || board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'
                || board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {

            System.out.println("computer won");
            return true;
        } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'
                || board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'
                || board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X'
                || board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'
                || board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'
                || board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'
                || board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'
                || board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {

            System.out.println("User 1 wins!!!!");
            return true;
        } else {
            return false;
        }

    }

    static int getRandom(int range) {
        return rand.nextInt((range - 0) + 1) + 0;
    }

    public static void main(String[] args) {
        int noofturns = 0;
        setBoard();

        clearScreen();
        printBoard();
        do {

            int row, col;

            if (isUser1Turn) {
                do {

                    System.out.println("Enter row = ");
                    row = sc.nextInt();
                    System.out.println("Enter col = ");
                    col = sc.nextInt();

                } while (board[row][col] != holder);
                board[row][col] = 'X';
                isUser1Turn = false;
                printBoard();
            } else {
                if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == holder) {

                    board[2][0] = 'O';

                } else if (board[0][0] == holder && board[1][0] == 'O' && board[2][0] == 'O') {

                    board[0][0] = 'O';

                } else if (board[0][0] == 'O' && board[1][0] == holder && board[2][0] == 'O') {

                    board[1][0] = 'O';

                } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == holder) {

                    board[2][2] = 'O';

                } else if (board[0][0] == 'O' && board[1][1] == holder && board[2][2] == 'O') {

                    board[1][1] = 'O';

                } else if (board[0][0] == holder && board[1][1] == 'O' && board[2][2] == 'O') {

                    board[0][0] = 'O';

                } else if (board[0][0] == holder && board[0][1] == 'O' && board[0][2] == 'O') {

                    board[0][0] = 'O';

                } else if (board[0][0] == 'O' && board[0][1] == holder && board[0][2] == 'O') {

                    board[0][1] = 'O';

                } else if (board[0][2] == 'O' && board[0][1] == 'O' && board[0][2] == holder) {

                    board[0][2] = 'O';

                } else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == holder) {

                    board[2][1] = 'O';

                } else if (board[0][1] == 'O' && board[1][1] == holder && board[2][1] == 'O') {
                    board[1][1] = 'O';

                } else if (board[0][1] == holder && board[1][1] == 'O' && board[2][1] == 'O') {

                    board[1][0] = 'O';

                } else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == holder) {

                    board[2][2] = 'O';

                } else if (board[0][2] == 'O' && board[1][2] == holder && board[2][0] == 'O') {

                    board[1][2] = 'O';

                } else if (board[0][2] == holder && board[1][2] == 'O' && board[2][2] == 'O') {

                    board[0][2] = 'O';

                } else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == holder) {

                    board[1][2] = 'O';

                } else if (board[1][0] == holder && board[1][1] == 'O' && board[1][2] == 'O') {

                    board[1][0] = 'O';

                } else if (board[1][0] == 'O' && board[1][1] == holder && board[2][0] == 'O') {

                    board[2][0] = 'O';

                } else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == holder) {

                    board[2][2] = 'O';

                } else if (board[2][0] == 'O' && board[2][1] == holder && board[2][2] == 'O') {

                    board[2][1] = 'O';

                } else if (board[2][0] == holder && board[2][1] == 'O' && board[2][2] == 'O') {

                    board[2][0] = 'O';

                } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == holder) {

                    board[2][0] = 'O';

                } else if (board[0][2] == 'O' && board[1][1] == holder && board[2][0] == 'O') {

                    board[2][0] = 'O';

                } else if (board[0][2] == holder && board[1][1] == 'O' && board[2][1] == 'O') {

                    board[2][0] = 'O';

                } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == holder) {
                    board[2][0] = 'O';

                } else if (board[0][0] == holder && board[1][0] == 'X' && board[2][0] == 'X') {
                    board[0][0] = 'O';

                } else if (board[0][0] == 'X' && board[1][0] == holder && board[2][0] == 'X') {
                    board[1][0] = 'O';

                } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == holder) {
                    board[2][2] = 'O';

                } else if (board[0][0] == 'X' && board[1][1] == holder && board[2][2] == 'X') {
                    board[1][1] = 'O';

                } else if (board[0][0] == holder && board[1][1] == 'X' && board[2][2] == 'X') {
                    board[0][0] = 'O';

                } else if (board[0][0] == holder && board[0][1] == 'X' && board[0][2] == 'X') {
                    board[0][0] = 'O';

                } else if (board[0][0] == 'X' && board[0][1] == holder && board[0][2] == 'X') {
                    board[0][1] = 'O';

                } else if (board[0][2] == 'X' && board[0][1] == 'X' && board[0][2] == holder) {
                    board[0][2] = 'O';

                } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == holder) {
                    board[2][1] = 'O';

                } else if (board[0][1] == 'X' && board[1][1] == holder && board[2][1] == 'X') {
                    board[1][1] = 'O';

                } else if (board[0][1] == holder && board[1][1] == 'X' && board[2][1] == 'X') {
                    board[1][0] = 'O';

                } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == holder) {
                    board[2][2] = 'O';

                } else if (board[0][2] == 'X' && board[1][2] == holder && board[2][0] == 'X') {
                    board[1][2] = 'O';

                } else if (board[0][2] == holder && board[1][2] == 'X' && board[2][2] == 'X') {
                    board[0][2] = 'O';

                } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == holder) {
                    board[1][2] = 'O';

                } else if (board[1][0] == holder && board[1][1] == 'X' && board[1][2] == 'X') {
                    board[1][0] = 'O';

                } else if (board[1][0] == 'X' && board[1][1] == holder && board[2][0] == 'X') {
                    board[2][0] = 'O';

                } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == holder) {
                    board[2][2] = 'O';

                } else if (board[2][0] == 'X' && board[2][1] == holder && board[2][2] == 'X') {
                    board[2][1] = 'O';

                } else if (board[2][0] == holder && board[2][1] == 'X' && board[2][2] == 'X') {
                    board[2][0] = 'O';

                } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == holder) {
                    board[2][0] = 'O';

                } else if (board[0][2] == 'X' && board[1][1] == holder && board[2][0] == 'X') {
                    board[2][0] = 'O';

                } else if (board[0][2] == holder && board[1][1] == 'X' && board[2][1] == 'X') {
                    board[2][0] = 'O';

                } else {
                    do {

                        row = getRandom(2);
                        System.out.println("My row is " + row);
                        col = getRandom(2);
                        System.out.println("My coloumn is " + col);
                    } while (board[row][col] != holder);
                    board[row][col] = 'O';

                }
                isUser1Turn = true;

            }
            clearScreen();
            printBoard();
            noofturns++;
            if (noofturns == 9) {

                System.out.println("its a draw");
                break;

            }
            isWin = checkWin();
            if (isWin) {
                break;
            }

        } while (!isUser1Turn || noofturns != 9);

    }
}
