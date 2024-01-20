import java.util.Scanner;
public class mesimet {

	public static void main(String[] args) {
		// no1: Variablat ne Java-
		int x;
		double y;
		float z;
		String a;
		char b;
		boolean c;
		long d;
		short e;
		x = 10; // integer apo shkurtese int eshte variabel e cila ruan vleren e numrit 
		y = 1.0; // double eshte variabel e cila ruan numra decimal
		z = 1.34f; // float eshte variabel e cila ruan numra decimal por duhet te perfundon me shkronjen f
		a = "Texti"; // String eshte nje variabel ne te cilen mund te shenojm tekst
		b = 'A'; // char eshte nje variabel e cila ruan nje shkronje
		c = true; // boolean eshte nje variabel e cila kalxon nese nje vlere eshte e vertet apo jo dhe mund te perdorim 0 apo 1
		d = 200050005000550000L; // long ruan numra me shume se int por duhet te perfundohet me L
		e = 25; // short ruan numra me te vogel se int apo long 
		Scanner ushtrime = new Scanner (System.in);
		System.out.println("Sheno moshen: ");
		int mosha;
		mosha = ushtrime.nextInt();
		System.out.println("Mosha juaj eshte: " + mosha);
		
		System.out.println("Pershendetje! Un quhem Euxelo. Si quheni ju ");
		String emri;
		emri = ushtrime.nextLine();
		System.out.println("Pershendetje " + emri);
		System.out.println("Un i jam 18 vjec. Sa vjec je ti ");
		int vjec;
		vjec = ushtrime.nextInt();
		System.out.println("Diten e mire. Me vjen mire qe u njoftuam ");
		String edhemua;
		edhemua = ushtrime.nextLine();
		System.out.println(edhemua);
	}

}
