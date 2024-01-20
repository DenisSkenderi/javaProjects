package detyra;
import java.util.Scanner;
public class temperatura {

	public static void main(String[] args) {
		Scanner temperatura = new Scanner(System.in);
		double temp1,temp2;
		System.out.println("Sheno temperaturen ne fahrenheit: ");
		temp1 = temperatura.nextDouble();
		System.out.println("Temperatura ne celcius eshte: " + celcius(temp1));
		System.out.println(" ");
		double v,y;
		System.out.println("Sheno temperaturen ne celcius: ");
		v = temperatura.nextDouble();
		System.out.println("Temperatura ne fahrenheit eshte: " + fahrenheit(v));
		
	}static double celcius(double f) {
		return (f-32)*5/9;
	}static double fahrenheit(double c) {
		return (c*3/5)+32;
	}

}
