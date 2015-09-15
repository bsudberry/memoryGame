package memoryGame;

import java.util.ArrayList;
import java.util.Collections;

public class board
	{
		public static String [][] board=new String [4][4];
		public static String [][] hiddenBoard=new String [4][4];
		static ArrayList <String> animals = new ArrayList <String>();

		public static void main(String[] args)
			{
				displayBlankBoard();
				fillBoard();
			}
		static void displayBlankBoard()
			{
				board[0][0]="X ";
				board[0][1]="X ";
				board[0][2]="X ";
				board[0][3]="X ";
				board[1][0]="X ";
				board[1][1]="X ";
				board[1][2]="X ";
				board[1][3]="X ";
				board[2][0]="X ";
				board[2][1]="X ";
				board[2][2]="X ";
				board[2][3]="x ";
				board[3][0]="X ";
				board[3][1]="X ";
				board[3][2]="X ";
				board[3][3]="X ";
				
				
				System.out.println("    1    2    3    4  ");
				System.out.println(" ----------------------");
				System.out.println("A | " + board[0][0] + " | "  + board[0][1] + " | " + board[0][2] + " | " + board[0][3] +  " | ");
				System.out.println(" ----------------------");
				System.out.println("B | " + board[1][0] + " | "  + board[1][1] + " | " + board[1][2] + " | " + board[1][3] +  " | " ); 	
				System.out.println(" ----------------------");
				System.out.println("C | " + board[2][0] + " | "  + board[2][1] + " | " + board[2][2] + " | " + board[2][3] +  " | ");
				System.out.println(" ----------------------");
				System.out.println("D | " + board[3][0] + " | "  + board[3][1] + " | " + board[3][2] + " | " + board[3][3] +  " | " );
				System.out.println(" ----------------------");
				System.out.println("");
				
			}
		static void fillBoard()
			{
				int counter = 0;
				animals.add("Dogs");
				animals.add("Cats");
				animals.add("Crab");
				animals.add("Fish");
				animals.add("Wasp");
				animals.add("Goat");
				animals.add("Lion");
				animals.add("Toad");
				animals.add("Dogs");
				animals.add("Cats");
				animals.add("Crab");
				animals.add("Fish");
				animals.add("Wasp");
				animals.add("Goat");
				animals.add("Lion");
				animals.add("Toad");	
				Collections.shuffle(animals);
				for(int row=0; row<4; row++)
					{
						for(int col=0; col<4; col++)
							{
							hiddenBoard[row][col]= animals.get(counter++);
							}
					}	
			}
		
	}
