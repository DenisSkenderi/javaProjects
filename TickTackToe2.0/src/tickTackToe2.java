import java.util.*;
public class tickTackToe2 {
	static String board[];
	static String turn;
	static String checkWinner() {
		for(int i = 0;i < 8; i++) {
			String line = null;
			switch(i) {
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
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if(line.equals("XXX")) {
				return "X";
			}else if(line.equals("OOO")) {
				return "O";
			}
		}
		for(int i = 0; i < 9; i++) {
			if(Arrays.asList(board).contains(String.valueOf(i + 1))) {
				break;
			}else if(i == 8) {
				return "Draw";
			}
		}
		System.out.println(turn + "'s turn; enter slot number:");
		return null;
	}
	static void print() {
		System.out.println("|---|---|---|");//first tabel row
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");//second tabel row 
		System.out.println("|-----------|");//Third tabel row
		System.out.println("| " + board[3] + " | "+ board[4] + " | " + board[5] + " |");//forth tabel row
		System.out.println("|-----------|");//fitht tabel row
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");//sixth tabel row
		System.out.println("|---|---|---|");//seventh tabel row
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;
		for(int i = 0; i < 9; i++) {
			board[i] = String.valueOf(i + 1);
		}
		System.out.println("-Welcome to Tick Tack Toe. ");
		print();
		System.out.println("X will play first. Enter number to place X in:");
		while(winner == null) {
			int numIn;
			try {
				numIn = input.nextInt();
				if(!(numIn > 0 && numIn <= 9)) {
					System.out.println("Invalid Number; Re-Enter slot number:");
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Invalid Number; Re-Enter slot number:");
				continue;
			}
			if(board[numIn - 1].equals(String.valueOf(numIn))) {
				board[numIn - 1] = turn;
			
			
			if(turn.equals("X")) {
				turn = "O";
			}else {
				turn = "X";
			}
			print();
			winner = checkWinner();
			}
			else {
				System.out.println("Slot already taken; Re-Enter slot");
			}	
		}
		if(winner.equalsIgnoreCase("Draw")) {
			System.out.println("It's a Draw; Thanks for playing");
		}else {
			System.out.println("Congratulations! " + winner + "'s have won; Thanks for playing");
		}
		input.close();
	}
}
