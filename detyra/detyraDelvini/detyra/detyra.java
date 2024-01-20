package detyra;
import java.util.Scanner;
public class detyra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int pozitiv = 0;
        int negativ = 0;
        int zero = 0;
        int numri;
        char a;
        while(true) {
        	System.out.print("Sheno numrin e plote: \n");
        	numri = input.nextInt();
        	if(numri > pozitiv) {
        		pozitiv++;
        	}else if(numri < negativ) {
        		negativ++;
        	}else if(numri == 0){
        		zero++;
        	}
        	System.out.print("A deshironi te vazhdoni p/j \n");
        	a = input.next(".").charAt(0);
        	if(a == 'j') {
        		break;
        	}else if(a == 'p') {
        		continue;
        	}else {
        		System.out.print("Keni gabuar karakterin! \n");
        	}
        }
        System.out.println("Numra Pozitiv: " + pozitiv);
        System.out.println("Numra Negativ: " + negativ);
        System.out.println("Numra Zero: " + zero);
	}

}
