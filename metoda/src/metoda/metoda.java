package metoda;

public class metoda {
	public static void main(String[] args) {
//		metodaVoid();
//		emri("Denis");
//		emriMosha("Denis",18);
//		mosha(15);
//		mosha(18);
//		int alabamaBaraz = alabama(120, 500);
//		System.out.println(alabamaBaraz);
//		plusMethoodDouble(10.6,60.6);
//		System.out.println(plusMethoodDouble(10.6,60.6));
//	}
//	// metoda void nuk e ka vleren return dhe ne kete metod na lejohet te perdorim vetem System.out.println();
//	public static void metodaVoid() {
//		System.out.print("Pershendetje! \n");
//	}
//	//metodes void ja kemi dhene nje String variable te cilen e kemi shfaqur ne metoden emri dhe ja kemi dhene vleren ne metoden main
//	public static void emri(String name) {
//		System.out.println("Emri i perdoruesit eshte: " + name);
//	}
//	//metodes void ja kemi dhene nje variabel sring dhe int te cilen do ta therasim ne public static void main()
//	public static void emriMosha(String emri,int mosha) {
//		System.out.println("Emri: " + emri + "\n" +"Mosha: " + mosha);
//	}
//	public static void mosha(int mosha) {
//		if(mosha < 18) {
//			System.out.println("Nuk keni te drejt te votoni");
//		}else {
//			System.out.println("Keni te drejt te votoni");
//		}
//		System.out.println("Mosha juaj eshte " + mosha);
//	}
//	public static int alabama(int x,int y) {
//		return x + y;
//	}
//  static double plusMethoodDouble(double x,double y) {
//	  return x+y;
//  }
		
		int result = sum(1);
		System.out.print(result + "\n");
		{
			int rest = 10;
			int result1 = 10;
			int z = rest + result1;
			System.out.println(rest + " + " + result1 + " = " + z);
		}
	}
	
	
	public static int sum(int k) {
		if(k > 0) {
			return k + sum(k - 1);
		}else {
			return 0;
		}
	}
}
