import java.util.*;
public class randomNumGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("You have 3 lives; Guess the random number from 1-10");
		int num = (int) (11*Math.random());
		int t = 3;
		int i,guess;
		for(i = 0; i < t; i++) {
			System.out.println("Guess the numer: ");
			guess = input.nextInt();
			if(guess == num) {
				System.out.println("Congratulations! You guessed the number");
				break;
			}else if(num > guess && i != t - 1) {
				System.out.println("The numeber is greater than " + guess);
			}else if(num < guess && i != t - 1) {
				System.out.println("The number is less than " + guess);
			}
		}
		if(i == t) {
			System.out.println("You have tried all your lives" + '\n' + "The number was: " + num);
		}
	}
}
