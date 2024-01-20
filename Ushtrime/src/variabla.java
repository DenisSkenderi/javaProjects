import java.util.Scanner;
public class variabla {

	public static void main(String[] args) {
		Scanner write = new Scanner(System.in);
//		System.out.println("Sheno usernaim");
//		int n1 = write.nextInt();
//		System.out.println("Sheno passwordi");
//		int n2 = write.nextInt();
//		
//		if(n1 == 123 && n2 == 1001) {
//			System.out.println("miresevini " + n1);
//		}else {
//			System.out.println("keni gabuar");
//		}
//		System.out.println("Sheno usernaim");
//		String user = write.nextLine();
//		System.out.println("Sheno passwordi");
//		String pass = write.nextLine();
//		
//		if(user.equals("jack") && pass.equals("jack")) {
//			System.out.println("Miresevini " + user);
//		}else {
//			System.out.println("Keni gabuar ne login form");
//		}
//		int i,z;
//		for(i=1;i<=10;i++) {
//			for(z=1;z<=10;z++) {
//				System.out.println(i + " x " + z +" = " + (i*z));
//			}
//			System.out.println(" ");
//		}
//		
//		double x,y;
//		System.out.println("Sheno numrin e pare:");
//		x = write.nextDouble();
//		System.out.println("Sheno operatorin:");
//		char operatori = write.next().charAt(0);
//		System.out.println("Sheno numrin e dyte");
//		y = write.nextDouble();
//		System.out.println(" ");
//		switch(operatori) {
//		case '+':
//			x = x+y;
//			System.out.println("Rezultati: " + x);
//			break;
//		case '-':
//			x = x-y;
//			System.out.println("Rezultati:" + x);
//			break;
//		case '*':
//			x = x*y;
//			System.out.println("Rezultati: " + x);
//			break;
//		case '/':
//			x = x/y;
//			System.out.println("Rezultati: " +x);
//			break;
//		case '^':
//			x = Math.sqrt(x);
//			System.out.println("");
//			y = Math.sqrt(y);
//			System.out.println("Rezultati: " +x);
//			break;
//			default:
//				System.out.println("operatori nuk ekziston");
//				break;
//		}
//		int z = -30;
//		int x=10;
//		int y = 5;
//		System.out.println("Numri Negativ Ndryshon ne Numer pozitiv " + Math.abs(z));
//		System.out.println("Rrenja Katrore " + Math.sqrt(y));
//		System.out.println("Numri Minimal " + Math.min(z,x));
//		System.out.println("Numri Maksimal " + Math.max(z,x));
//		System.out.println("Numri Random " + Math.random()*10);
//		for(int i = 1;i<=3;i++) {
//			System.out.println("Numri: " + i);
//		}
//		for(int x = 1;x<=3;x++) {
//			if(x == 2) {
//				break;
//			}
//			System.out.println("Numri "+x);
//		}
//		System.out.println("\n");
//		int x;
//		for(x=10; x>=1;x--) {
//			System.out.println(x);
//		}
//		for(int x = 0;x<=3;x++) {
//			if(x == 1) {
//				continue;
//			}else if(x == 3) {
//				break;
//			}
//			System.out.println("Numri "+x);
//		}
		//°F = (°C × 9/5) + 32
		
		double f,c;
		System.out.println("Sheno celciusin: ");
		c = write.nextInt();
		System.out.println("");
		System.out.println(f=(c*(9.0/5.0)+32));
	}

}
