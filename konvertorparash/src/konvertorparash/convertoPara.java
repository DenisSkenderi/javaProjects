package konvertorparash;
import java.util.Scanner;
public class convertoPara {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double konvertimi,pasKonvertimit,paraKonvertimit;
		System.out.println("Sheno vleren e parave ne euro (€)");
		paraKonvertimit = input.nextDouble();
		System.out.println("Sheno vleren e parave ne dollar ($)");
		pasKonvertimit = input.nextDouble();
		konvertimi = 0.77;
		konvertimi = paraKonvertimit/pasKonvertimit;
		System.out.println("Para konvertimit: " + paraKonvertimit);
		System.out.println("Pas konvertimit: " + konvertimi);
	}

}
