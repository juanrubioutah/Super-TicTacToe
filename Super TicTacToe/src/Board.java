
public class Board {
	public boolean isComplete;
	public String[] board;
	public Board() {
		board = new String[10];
		board[0] = "!";
		for(int i = 1; i<=9; i++) {
			board[i] = "-";
		}
	}

	public String get(int position) {
		if(position==1) {
			return board[1];
		}
		if(position==2) {
			return board[2];
		}
		if(position==3) {
			return board[3];
		}
		if(position==4) {
			return board[4];
		}
		if(position==4) {
			return board[4];
		}
		if(position==5) {
			return board[5];
		}
		if(position==6) {
			return board[6];
		}
		if(position==7) {
			return board[7];
		}
		if(position==8) {
			return board[8];
		}
		if(position==9) {
			return board[9];
		}
		return "error";
	}
	public void markCompleted(boolean playerOneWin) {
		if(playerOneWin==true) {
			for(int i = 1; i<=9; i++) {
				board[i] = "X";
			}
			isComplete = true;
			return;
		}
		else if(playerOneWin==false) {
			for(int i = 1; i<=9; i++) {
				board[i] = "O";
			}
			isComplete = true;
			return;
		}
	}
}
