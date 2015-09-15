package memoryGame;

public class gameRunner
	{

		public static void main(String[] args) throws InterruptedException
			{
				introduction.askNameToPlay();
				player.makeMove();
				board.displayBlankBoard();
				Thread.sleep(4000);
				board.fillBoard();

			}

	}
