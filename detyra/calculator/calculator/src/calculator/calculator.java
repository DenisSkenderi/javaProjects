package calculator;
import java.util.Scanner;
import java.math.*;
public class calculator {

	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
		char operator;
		double x,y,z;
		System.out.println("Shenoni operatorin");
		operator = cal.next().charAt(0);
		System.out.println("Sheno numrin e pare: ");
		x = cal.nextDouble();
		System.out.println("Sheno numrin e dyte: ");
		y = cal.nextDouble();

		switch(operator){
		case '+':
			z = x + y;
			System.out.println(x + " + " + y + " = " + z);
			break;
		case '-':
			z = x - y;
			System.out.println(x + " - " + y + " = " + z);
			break;
		case '*':
			z = x * y;
			System.out.println(x + " * " + y + " = " + z);
			break;
		case '/':
			z = x / y;
			System.out.println(x + " / " + y + " = " + z);
			break;
			default:
				System.out.println("Operatoru nuk ekziston");
				break;
		}
	}

}