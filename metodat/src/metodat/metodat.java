package metodat;
import java.util.Scanner;
public class metodat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vlera = input.nextInt();
		Metoda obj = new Metoda();
		obj.vlera1();
	}
}
class Metoda{
	public int vlera1(int sum) {
		sum = 0;
		for(int i = 1;i<=10;i++) {
			sum +=1;
		}
		return sum;
	}
}