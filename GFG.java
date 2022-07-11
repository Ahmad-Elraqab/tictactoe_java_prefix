
// A simple program to demonstrate
// Tic-Tac-Toe Game.
import java.util.*;

public class GFG {

	public String[] board;
	public String turn;
	public Player1 player1;
	public Player2 player2;

	GFG() {
		this.player1 = new Player1();
		this.player2 = new Player2();
	}

	public String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
				case 0:
					line = board[0] + board[1] + board[2];
					break;
				case 1:
					line = board[3] + board[4] + board[5];
					break;
				case 2:
					line = board[6] + board[7] + board[8];
					break;
				case 3:
					line = board[0] + board[3] + board[6];
					break;
				case 4:
					line = board[1] + board[4] + board[7];
					break;
				case 5:
					line = board[2] + board[5] + board[8];
					break;
				case 6:
					line = board[0] + board[4] + board[8];
					break;
				case 7:
					line = board[2] + board[4] + board[6];
					break;
			}
			// For X winner
			if (line.equals("XXX")) {
				return player1.getName();
			}

			// For O winner
			else if (line.equals("OOO")) {
				return player2.getName();
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(
					String.valueOf(a + 1))) {
				break;
			} else if (a == 8) {
				return "draw";
			}
		}

		// To enter the X Or O at the exact place on board.
		System.out.println(
				turn + "'s turn; enter a slot number to place "
						+ turn + " in:");
		return null;
	}

	public void printBoard() {
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | "
				+ board[1] + " | " + board[2]
				+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | "
				+ board[4] + " | " + board[5]
				+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | "
				+ board[7] + " | " + board[8]
				+ " |");
		System.out.println("|---|---|---|");
	}

}
