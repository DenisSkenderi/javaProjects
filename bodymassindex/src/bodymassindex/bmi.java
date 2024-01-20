package bodymassindex;
import java.util.*;
public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sheno peshen: ");
		double pesha = sc.nextDouble();
		System.out.println(" ");
		System.out.print("Sheno gjatesin ne meter: ");
		double gjatesia = sc.nextDouble();
		System.out.println(" ");
		double bmi = pesha/(gjatesia*gjatesia);
		System.out.println("BMI/Body Mass index eshte: " + bmi);
//		
//		if(bmi >= 30 || bmi >= 25) {
//			System.out.println("Mbi peshe " + bmi);
//		}else if(bmi <= 25 || bmi >= 18.5) {
//			System.out.println("Normale " + bmi);
//		}else {
//			System.out.println("Nen Pesh" + bmi);
//		}
//		
//		System.out.print("Sheno celciusin:");
//		double celcius = sc.nextDouble();
//		System.out.println(" ");
//		double fahrenheit = (celcius*9/5)+32;
//		System.out.println("Fahrenheight eshte: " + fahrenheit);
//		System.out.println(" ");
//		System.out.print("Sheno fahrenheit: ");
//		
//		float fahrenheiti = sc.nextFloat();
//		System.out.println(" ");
//		float celciusi = (fahrenheiti-32)*5/9;
//		System.out.print("Celciusi eshte: " + celciusi);
		
		System.out.print("Muaji i lindjes me numer: ");
		int muaji = sc.nextInt();
		switch(muaji) {
		case 1:
			System.out.println("Janar");
			break;
		case 2:
			System.out.println("Shkurt");
			break;
		case 3:
			System.out.println("Mars");
			break;
		case 4:
			System.out.println("Prill");
			break;
		case 5:
			System.out.println("Maj");
			break;
		case 6:
			System.out.println("Qershor");
			break;
		case 7:
			System.out.println("Korik");
			break;
		case 8:
			System.out.println("Ngjusgt");
			break;
		case 9:
			System.out.println("Shtator");
			break;
		case 10:
			System.out.println("Tetor");
			break;
		case 11:
			System.out.println("Nentor");
			break;
		case 12:
			System.out.println("Dhjetor");
			break;
			default:
				System.out.println("muaji i lindjes nuk ekziston");
			
		}
		int x = 10;
		double y =(double) x;
		x = (int) 10.5;
		System.out.println(x);
	}

}
