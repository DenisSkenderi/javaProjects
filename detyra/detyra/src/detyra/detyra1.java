package detyra;
import java.util.*;
public class detyra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		System.out.println("Si quheni?👾 ");
		String emri = user.nextLine();
		
		System.out.println("Zgjethni dy numra ");
		int vleraNje = user.nextInt();
		int vleraDy = user.nextInt();
		
		int max = Math.max(vleraNje, vleraDy);
		int min = Math.min(vleraNje, vleraDy);
		double pow = Math.pow(vleraNje, vleraDy);
		double pow2 = Math.pow(vleraDy, vleraNje);
		double random = Math.random()* vleraNje + 1;
		System.out.println("Maksimumi i numrave: " + max);
		System.out.println("minimumi i numrave: " + min);
		System.out.println("Vlera e pare ne Fuqi: " + pow);
		System.out.println("Vlera e dyte ne Fuqi: " + pow2);
		System.out.println("Random-i numrave: " + random);
		

	}

}
