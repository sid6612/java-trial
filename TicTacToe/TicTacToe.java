import java.io.*;
import java.util.Scanner;
import java.util.*;

public class TicTacToe
{
	static String[] ticTacToeBoard = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
	
	public static void printBoard()
	{
		System.out.print("\n");
		System.out.print("     A     B     C   ");
		System.out.print("\n");
		System.out.print("1   " + ticTacToeBoard[0] + "    |  " + ticTacToeBoard[1] + "   |  " + ticTacToeBoard[2] + "    ");
		System.out.print("\n");
		System.out.print("    ---------------  ");
		System.out.print("\n");
		System.out.print("2    " + ticTacToeBoard[3] + "   |  " + ticTacToeBoard[4] + "   |    " + ticTacToeBoard[5] + "  ");
		System.out.print("\n");
		System.out.print("    ---------------  ");
		System.out.print("\n");
		System.out.print("3   " + ticTacToeBoard[6] + "   |  " + ticTacToeBoard[7] + "   |   " + ticTacToeBoard[8] + "   ");
		System.out.print("\n");
	}

	public static void main (String args[])
	{
		String playerOne, playerTwo;

		Scanner sc = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("Enter first player name: ");
		playerOne = sc.nextLine();
		System.out.print("\n");
		System.out.print("Enter secound player name: ");
		playerTwo = sc.nextLine();
		System.out.print("\n");
		System.out.print(playerOne + " will play with 'X' & " + playerTwo + " will play with 'O'.");

		ticTacToeBoard[0] = "X";
		ticTacToeBoard[1] = "X";
		ticTacToeBoard[2] = "X";
		ticTacToeBoard[3] = "X";
		ticTacToeBoard[4] = "X";
		ticTacToeBoard[5] = "O";
		ticTacToeBoard[6] = "O";
		ticTacToeBoard[7] = "O";
		ticTacToeBoard[8] = "O";

		printBoard();
	}
}