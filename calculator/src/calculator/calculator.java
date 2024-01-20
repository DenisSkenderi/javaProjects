package calculator;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sheno numrin e pare: ");
		int num1 = input.nextInt();
		System.out.println("Sheno operatorin ( + , - , * , / ): ");
		char operatori = input.next().charAt(0);
		System.out.println("Sheno numrin e dyte: ");
		int num2 = input.nextInt();
		System.out.println("Barazimi eshte: ");
		switch(operatori) {
		case '+':	
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			default:
				System.out.println("peratori nuk ekziston");
				break;
		}
	}
}
