
public class ticktack {

	public static void main(String[] args) {
		int board = 9;
		ticktack obj = new ticktack();
		obj.boardMap(board);
	}
	public void boardMap(String board[]) {
		System.out.println("|"+"---"+ "|" + "---" + "|"+ "---" +"|");
		System.out.println("|"+ board[0] + "|" + board[1] + "|" + board[2] + "|");
		System.out.println("|"+"-----------"+"|");
		System.out.println("|"+ board[3] + "|" + board[4] + "|" + board[5] + "|");
		System.out.println("|"+"-----------"+"|");
		System.out.println("|"+ board[5] + "|" + board[7] + "|" + board[8] + "|");
		System.out.println("|"+"---"+ "|" + "---" + "|"+ "---" +"|");
	}
}
