import java.util.Scanner;
public class banking {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to our banking system");
		System.out.println("1. Check Account");
		System.out.println("2. Saving Account");
		System.out.println("3. Loan Account");
		
		System.out.println("Select upper options");
		int select = in.nextInt();
		int number = 500000;
		if(select == 1) {
			System.out.println("Welcome to your Account");
			System.out.println("Your balance is: " + number + '$');
			System.out.println("Thank you for banking with us");
		}else if(select == 2) {
			System.out.println("Welcome to your Savings Account");
			System.out.println("Your savings are: " + 30000 + '$');
			System.out.println("Thank you for banking with us");
		}else if(select == 3) {
			System.out.println("Welcome to your Loan Account");
			System.out.println("Your savings are: " + 00 + '$');
			System.out.println("Thank you for banking with us");
		}else {
			System.out.println("Input is invalid!");
		}
	}

}
