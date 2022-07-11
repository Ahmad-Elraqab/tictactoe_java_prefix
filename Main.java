import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GFG game = new GFG();

        game.board = new String[9];
        game.turn = game.player1.getName();
        String winner = null;

        for (int a = 0; a < 9; a++) {
            game.board[a] = String.valueOf(a + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        game.printBoard();

        System.out.println(
                game.turn + " will play first. Enter a slot number to place " + game.turn + " in:");

        while (winner == null) {
            int numInput;

            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input; re-enter slot number:");
                continue;
            }

            if (game.board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                game.board[numInput - 1] = game.turn.equals(game.player1.getName()) ? "X" : "O";

                if (game.turn.equals(game.player1.getName())) {
                    game.turn = game.player2.getName();
                } else {
                    game.turn = game.player1.getName();
                }

                game.printBoard();
                winner = game.checkWinner();
            } else {
                System.out.println(
                        "Slot already taken; re-enter slot number:");
            }
        }

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        }

        else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }
    }
}