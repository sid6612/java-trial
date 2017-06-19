import java.io.*;
import java.util.Scanner;
import java.util.*;

public class TicTacToe
{
	static String[] ticTacToeBoard = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
	
	public static void printBoard()
	{
		System.out.print("\n");
		System.out.print("     A       B      C   ");
		System.out.print("\n");
		System.out.print("1    " + ticTacToeBoard[0] + "   |   " + ticTacToeBoard[1] + "   |  " + ticTacToeBoard[2] + "   ");
		System.out.print("\n");
		System.out.print("    ------------------  ");
		System.out.print("\n");
		System.out.print("2    " + ticTacToeBoard[3] + "   |   " + ticTacToeBoard[4] + "   |  " + ticTacToeBoard[5] + "   ");
		System.out.print("\n");
		System.out.print("    ------------------  ");
		System.out.print("\n");
		System.out.print("3    " + ticTacToeBoard[6] + "   |   " + ticTacToeBoard[7] + "   |  " + ticTacToeBoard[8] + "   ");
		System.out.print("\n");
	}

	public static Boolean isPositionValid(int position)
	{
		if(ticTacToeBoard.equals(" "))
		{
			System.out.print("value is " + ticTacToeBoard[position]);
			return true;
		}
		else
		{
			return false;
		}
		
	}

	// returns 0 - 8 for valid inputs.
	// returns -1 for invalid input.
	private static int convertInputToIndex(String input)
	{
		if (input.equals("A1"))
		{
			return 0;
		}
		else if (input.equals("B1"))
		{
			return 1;
		}
		else if (input.equals("C1"))
		{
			return 2;
		}
		else if (input.equals("A2"))
		{
			return 3;
		}
		else if (input.equals("B2"))
		{
			return 4;
		}
		else if (input.equals("C2"))
		{
			return 5;
		}
		else if (input.equals("A3"))
		{
			return 6;
		}
		else if (input.equals("B3"))
		{
			return 7;
		}
		else if (input.equals("C3"))
		{
			return 8;
		}
		else
		{
			return -1;
		}
	}

	// Player 1 wins: return 1
	// Player 2 wins: return 2
	// Nobody wins  : return 0
	public static int winningPlayerStatus()
	{
		// {"X", " ", " ", "X", " ", " ", "X", " ", " "};

		if (ticTacToeBoard[0].equals(ticTacToeBoard[3]) && ticTacToeBoard[0].equals(ticTacToeBoard[6]) && ticTacToeBoard[0].equals(" ") == false)
		{
			if (ticTacToeBoard[0].equals("X")) 
			{
				return 1;
			}
			else if (ticTacToeBoard[0].equals("O"))
			{
				return 2;
			}
		}
		else if (ticTacToeBoard[1].equals(ticTacToeBoard[4]) && ticTacToeBoard[1].equals(ticTacToeBoard[7]) && ticTacToeBoard[1].equals(" ") == false)
		{
			if (ticTacToeBoard[1].equals("X")) 
			{
				return 1;
			}
			else if (ticTacToeBoard[1].equals("O"))
			{
				return 2;
			}
		}
		else if (ticTacToeBoard[2].equals(ticTacToeBoard[5]) && ticTacToeBoard[2].equals(ticTacToeBoard[8]) && ticTacToeBoard[2].equals(" ") == false)
		{
			if (ticTacToeBoard[2].equals("X"))
			{
				return 1;
			}
			else if (ticTacToeBoard[2].equals("O"))
			{
				return 2;
			}
		}
		else if (ticTacToeBoard[0].equals(ticTacToeBoard[1]) && ticTacToeBoard[0].equals(ticTacToeBoard[2]) && ticTacToeBoard[0].equals(" ") == false)
		{
			if (ticTacToeBoard[0].equals("X"))
			{
				return 1;
			}
			else if (ticTacToeBoard[0].equals("O"))
			{
				return 2;
			}
		}
		else if (ticTacToeBoard[3].equals(ticTacToeBoard[4]) && ticTacToeBoard[3].equals(ticTacToeBoard[5]) && ticTacToeBoard[3].equals(" ") == false)
		{
			if (ticTacToeBoard[3].equals("X"))
			{
				return 1;
			}
			else if (ticTacToeBoard[3].equals("O"))
			{
				return 2;
			}
		}
		else if (ticTacToeBoard[6].equals(ticTacToeBoard[7]) && ticTacToeBoard[6].equals(ticTacToeBoard[8]) && ticTacToeBoard[6].equals(" ") == false)
		{
			if (ticTacToeBoard[6].equals("X"))
			{
				return 1;
			}
			else if (ticTacToeBoard[6].equals("O"))
			{
				return 2;
			}
		}
		else if (ticTacToeBoard[0].equals(ticTacToeBoard[4]) && ticTacToeBoard[0].equals(ticTacToeBoard[8]) && ticTacToeBoard[0].equals(" ") == false)
		{
			if (ticTacToeBoard[0].equals("X"))
			{
				return 1;
			}
			else if (ticTacToeBoard[0].equals("O"))
			{
				return 2;
			}
		}
		else if (ticTacToeBoard[2].equals(ticTacToeBoard[4]) && ticTacToeBoard[2].equals(ticTacToeBoard[6]) && ticTacToeBoard[2].equals(" ") == false)
		{
			if (ticTacToeBoard[2].equals("X"))
			{
				return 1;
			}
			else if (ticTacToeBoard[2].equals("O"))
			{
				return 2;
			}
		}
		return 0;		
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
		System.out.print( playerOne + " will play with 'X' & " + playerTwo + " will play with 'O'.");

		while(true)  
		{
			// Print initial board.
			printBoard();

			// Player 1: Please enter a position
			System.out.print("Player 1: Please enter a position - ");
			// A1
			// Store input in a string.
			String player1Input = sc.nextLine().trim();

			int inputIndex = convertInputToIndex(player1Input);

			if (ticTacToeBoard[inputIndex].equals(" "))
			{
				ticTacToeBoard[inputIndex] = "X";
			} 
			else
			{
				System.out.print("Position is not valid");
				continue;
			}

			// Player 1's turn is over.
			int player1WinningStatus = winningPlayerStatus();
			if(player1WinningStatus == 1) 
			{
				System.out.print( playerOne + " wins");
				break;
			}

			printBoard();

			while(true)
			{
				// Player 2: Please enter a position
				System.out.print("\n");
				System.out.print("Player 2: Please enter a position - ");
				// C1
				// Store input in a string.
				String player2Input = sc.nextLine().trim();

				int inputIndex2 = convertInputToIndex(player2Input);

				if (ticTacToeBoard[inputIndex2].equals(" "))
				{
					ticTacToeBoard[inputIndex2] = "O";

					printBoard();
					break;
				}
				else
				{
					System.out.print("Position is not valid");
				}
			}

			// Player 2's turn is over.
			int player2WinningStatus = winningPlayerStatus();
			if(player2WinningStatus == 2) 
			{
				System.out.print( playerTwo + " wins");
				break;
			}

		}
	/*	while(true)
		{
			System.out.println("\n");
			System.out.print("Play again (Y/N) : ");
		}*/
	}
}