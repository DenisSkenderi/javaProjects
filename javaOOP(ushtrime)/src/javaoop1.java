
public class javaoop1 {
//	int x = 20;
//	int y = 5;
//	
//	String emri = "Denis";
//	String mbiemri = "Skenderi";
//	int mosha = 28;
//	public void vargu() {
//		System.out.println("The opportunity of defeating the enemy is provided by the enemy himselfe -Sun Tzu");
//	}
//	public void speed(int maxSpeed) {
//		System.out.println("Max speed is: " + maxSpeed);
//	}
//	int x;
//	public javaoop1(int y) {
//		x = 20;
//		x=y;
//	}
	int vitiProdhimit;
	String emriProdhimit;
	public javaoop1(int viti,String emri) {
		vitiProdhimit = viti;
		emriProdhimit = emri;
	}
	public static void main(String[] args) { //https://www.w3schools.com/java/java_constructors.asp vazhdimi detyres
		javaoop1 prodhimi = new javaoop1(1969,"Mustang");
		System.out.println(prodhimi.vitiProdhimit + " " + prodhimi.emriProdhimit);
//		javaoop1 obj = new javaoop1(10);
//		System.out.println(obj.x);
//		obj.vargu();
//		obj.speed(20);
//		System.out.println(obj.x);
//		System.out.println(obj.y + obj.x);
//		obj.x = 50;
//		System.out.println(obj.x);
//		
//		System.out.println("Emri: " + obj.emri + '\n' +"Mbiemri: " + obj.mbiemri + '\n' + "Mosha: " + obj.mosha);

	}

}
