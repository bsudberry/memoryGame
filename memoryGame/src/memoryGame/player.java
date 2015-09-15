package memoryGame;

import java.util.Scanner;

public class player
	{
		static Scanner userInput = new Scanner(System.in);
		static int colChoice1;
		static int rowChoice1;
		static int colChoice2;
		static int rowChoice2;
		public static void main(String[] args)
		{
			makeMove();
			checkForMatch();
		}


		static void makeMove()
			{
				System.out.println("Please enter a cordinate to reveal a word. Ex. A1 or C4");
				rowChoice1 = userInput.nextInt();
				rowChoice1 = Integer.parseInt(.substring(1)) -1;
				colChoice1 = userInput.nextInt();	
				colChoice1 = Integer.parseInt(.substring(1)) -1;
				
			}
		private static void checkForMatch()
			{
				if(board.board[rowChoice1][colChoice1].equals(board.board[rowChoice2][colChoice2]))
					{
						
						
					}
				
			}
	}

