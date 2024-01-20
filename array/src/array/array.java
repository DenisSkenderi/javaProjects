package array;
import java.util.Scanner;
public class array {
		public static boolean AeshteNr(int[] arr, int numri) {
			for(int n : arr) {
				if(numri == n ) {
				return true;
				}
			}
			return false;
		}
	public static void main(String[] args) {
		int[] myArr= {
				1789,2035,1899,1456,2013,
				1458,2458,1254,1472,2365,
				1456,2265,1457,2456};
		System.out.println(AeshteNr(myArr,2013));
		System.out.println(AeshteNr(myArr,2015));
		Scanner input = new Scanner(System.in);
		int[] vargu = {2,14,56,15,36,56,77,18,29,49};
		System.out.println("Per vargun e dhene 2,14,56,15,36,56,77,18,29,49 indeksim e cilit nr e deshiron: ");
		int numri = input.nextInt();
		int gjatesia = vargu.length;
		int pozita = -1;
		for(int i = 0; i < gjatesia; i++) {
			if(vargu[i] == numri) {
				pozita = i+1;
			}
			if(pozita !=-1) {
				System.out.println("indexi i nr " + numri + " eshte: " + pozita);
				break;
			}else {
				System.out.println("Keni dhene numer qe nuk gjendet ne varg");
				break;
			}
		}
	}
}