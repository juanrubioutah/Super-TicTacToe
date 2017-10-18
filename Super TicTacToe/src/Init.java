import java.util.Scanner;

public class Init {
	public static boolean playingAlone;
	public static boolean playerOneTurn = true;
	
	public static void main(String args[]) {
		Board board1 = new Board();
		Board board2 = new Board();
		Board board3 = new Board();
		Board board4 = new Board();
		Board board5 = new Board();
		Board board6 = new Board();
		Board board7 = new Board();
		Board board8 = new Board();
		Board board9 = new Board();
		printBoard(board1, board2, board3, board4, board5, board6, board7, board8, board9);
		System.out.println("Welcome to SUPER TicTacToe!");
		System.out.println("Are you playing alone? Yes/No");
		Scanner playerReader = new Scanner(System.in);
		String singlePlayer = playerReader.next();
		if(singlePlayer.equalsIgnoreCase("yes")) {
			playingAlone = true;
			PlayerManager playerManager = new PlayerManager(playingAlone);
			//TODO: AI
		}
		else if(singlePlayer.equalsIgnoreCase("no")) {
			playingAlone = false;
			int sentToBoard = 0; //number 1 to 9 indicating the board of the next play. Also uses 0 when any board can be played
			PlayerManager playerManager = new PlayerManager(playingAlone);
			do {
				if(playerOneTurn==true) {
					sentToBoard = playerManager.play(playerOneTurn, sentToBoard);
					playerOneTurn = false;
					continue;
				}
				else if(playerOneTurn==false) {
					sentToBoard = playerManager.play(playerOneTurn, sentToBoard);
					playerOneTurn = true;
					continue;
				}
			}while(true);
		}
		else{
			System.out.println("I don't understand "+singlePlayer+". Trying again.");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			main(args);
		}
	}
	public static void printBoard(Board board1, Board board2, Board board3, Board board4, Board board5, Board board6, Board board7, Board board8, Board board9) {
		System.out.println(board1.get(1)+" "+board1.get(2)+" "+board1.get(3)+" | "+board2.get(1)+" "+board2.get(2)+" "+board2.get(3)+" | "+board3.get(1)+" "+board3.get(2)+" "+board3.get(3));
		System.out.println(board1.get(4)+" "+board1.get(5)+" "+board1.get(6)+" | "+board2.get(4)+" "+board2.get(5)+" "+board2.get(6)+" | "+board3.get(4)+" "+board3.get(5)+" "+board3.get(6));
		System.out.println(board1.get(7)+" "+board1.get(8)+" "+board1.get(9)+" | "+board2.get(7)+" "+board2.get(8)+" "+board2.get(9)+" | "+board3.get(7)+" "+board3.get(8)+" "+board3.get(9));
		System.out.println("---------------------");
		System.out.println(board4.get(1)+" "+board4.get(2)+" "+board4.get(3)+" | "+board5.get(1)+" "+board5.get(2)+" "+board5.get(3)+" | "+board6.get(1)+" "+board6.get(2)+" "+board6.get(3));
		System.out.println(board4.get(4)+" "+board4.get(5)+" "+board4.get(6)+" | "+board5.get(4)+" "+board5.get(5)+" "+board5.get(6)+" | "+board6.get(4)+" "+board6.get(5)+" "+board6.get(6));
		System.out.println(board4.get(7)+" "+board4.get(8)+" "+board4.get(9)+" | "+board5.get(7)+" "+board5.get(8)+" "+board5.get(9)+" | "+board6.get(7)+" "+board6.get(8)+" "+board6.get(9));
		System.out.println("---------------------");
		System.out.println(board7.get(1)+" "+board7.get(2)+" "+board7.get(3)+" | "+board8.get(1)+" "+board8.get(2)+" "+board8.get(3)+" | "+board9.get(1)+" "+board9.get(2)+" "+board9.get(3));
		System.out.println(board7.get(4)+" "+board7.get(5)+" "+board7.get(6)+" | "+board8.get(4)+" "+board8.get(5)+" "+board8.get(6)+" | "+board9.get(4)+" "+board9.get(5)+" "+board9.get(6));
		System.out.println(board7.get(7)+" "+board7.get(8)+" "+board7.get(9)+" | "+board8.get(7)+" "+board8.get(8)+" "+board8.get(9)+" | "+board9.get(7)+" "+board9.get(8)+" "+board9.get(9));
	}
}
