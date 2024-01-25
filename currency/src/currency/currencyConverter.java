package currency;
import java.util.Scanner;
public class currencyConverter {
	public static void dollar(double awt) {
		System.out.println("1 Dollar =" + 0.92 + " Euro");
		System.out.println();
		System.out.println(awt + " Dollar = " + (awt*0.92) + " Euro");
		System.out.println();
		System.out.println("1 Dollar =" + 3.75 + " Saudi Riyal");
		System.out.println();
		System.out.println(awt + "Dollar = " + (awt*3.75) + " Saudi Riyal");
	}
	public static void euro(double awt) {
		System.out.println("1 Euro = " + 1.09 + " Dollar");
		System.out.println();
		System.out.println(awt + " Euro = " + (awt*1.09) + " Dollar");
		System.out.println();
		System.out.println("1 Euro =" + 4.08 + " Saudi Riyal");
		System.out.println();
		System.out.println(awt + " Euro = " + (awt*4.08) + " Saudi Riyal");
	}
	public static void saudiriyal(double awt) {
		System.out.println("1 Saudi Riyal = " + 0.27 + " Dollar");
		System.out.println();
		System.out.println(awt + " Saudi Riyal = " + (awt*0.27) + " Dollar");
		System.out.println();
		System.out.println("1 Saudi Riyal = " + 0.24 + " Euro");
		System.out.println();
		System.out.println(awt + " Saudi Riyal = " + (awt*0.24) + " Euro");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Chose currency to convert");
		System.out.println("1 Dollar" + '\n' + "2 Euro " + '\n' + "3 Saudi Riyal");
		int currency = scan.nextInt();
		System.out.println("Enter amount you want to convert");
		double amount = scan.nextDouble();
		switch(currency) {
		case 1:
			dollar(amount);
			break;
		case 2:
			euro(amount);
			break;
		case 3: 
			saudiriyal(amount);
			default:
				System.out.println("Invalid Choice");
				break;
		}
	}

}
