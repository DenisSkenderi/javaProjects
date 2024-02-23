package test1;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		   /*2*/
		   System.out.println("Choose a geometrical shape");
	       System.out.println("1: Circle\n2: Rectangle\n3: Isosceles Triangle");
	       Scanner scan = new Scanner(System.in);
	       int choose = scan.nextInt();
	       if(choose == 1) {
	    	   System.out.println("Give circle radius");
	    	   double radius = scan.nextDouble();
	           double circle = 3.14159 * radius * radius;
	           double perimeter = 2* 3.14159 * radius;
	           System.out.println(circle + "\n" + perimeter + '\n');
	       }else if(choose == 2) {
	    	   System.out.println("Give rectangle width");
	            double width = scan.nextDouble();
	            System.out.println("Give rectangle height");
	            double height = scan.nextDouble();
	            double rectangle = width * height;
	            double perimeter = (width + height) * 2;
	            System.out.println(rectangle + "\n" + perimeter + '\n');
	       }else if(choose == 3) {
	    	   System.out.println("Give triangle height");
	           double triangleHeight = scan.nextDouble();
	           System.out.println("Give triangle base");
	           double base = scan.nextDouble();
	           double hypotenuse = Math.sqrt(base * base + triangleHeight * triangleHeight);
	           double area = 0.5 * base * triangleHeight;
	           double perimeter = base + triangleHeight + hypotenuse;
	           System.out.println(hypotenuse + "\n" + perimeter + '\n');
	       }else {
	    	   System.out.println("Invalid number" + '\n');
	       }
	       /*6*/
	       System.out.println("Input amout of water used");
	       int liters = scan.nextInt();
	       double amount = (double) liters;
	       System.out.println("Amount due from the user, " + amount);
	       if(liters <= 4000) {
	    	   System.out.println(10.00);
	    	   System.out.println();
	       }else {
	    	   int extraLiters = liters - 4000;
	    	   double price = extraLiters * 0.005;
	    	   double totalPrice = 10.00 + price;
	    	   double total = Math.round(totalPrice * 100.0)/100.0;
	    	   System.out.println(total);
	    	   System.out.println();
	       }
	       /*3*/
	       System.out.println("Enter text");
	       String text = scan.next();
	       System.out.println(text);
	       int length = text.length();
	       int num[][] = new int[length][length];
	       for (int i = 1; i <= length; i++) {
	           for (int j = 0; j < length - i + 1; j++) {
	               int k = j + i - 1;
	               if (i == 1) {
	                   num[j][k] = 0;
	               }else if (text.charAt(j) == text.charAt(k)) {
	                   num[j][k] = num[j + 1][k - 1];
	               } else {
	                   num[j][k] = 1 + Math.min(num[j][k - 1], num[j + 1][k]);
	               }
	           }
	        }
	        System.out.println(num[0][length - 1]);
	        System.out.println();
	        /*1*/
	        System.out.print("Enter the number of students: ");
	        int numStudents = scan.nextInt();
	        scan.nextLine();
	        String[] students = new String[numStudents];
	        int[][] grades = new int[numStudents][2];
	        for (int i = 0; i < numStudents; i++) {
	            System.out.print("Enter student name " + (i + 1) + ": ");
	            students[i] = scan.nextLine();
	            System.out.print("Enter first grade for " + students[i] + ": ");
	            grades[i][0] = scan.nextInt();
	            System.out.print("Enter second grade for " + students[i] + ": ");
	            grades[i][1] = scan.nextInt();
	            scan.nextLine();
	        }
	        int maxGrade = 0;
	        String studentOfGrade = "";
	        for (int i = 0; i < numStudents; i++) {
	            for (int j = 0; j < 2; j++) {
	                if (grades[i][j] > maxGrade) {
	                    maxGrade = grades[i][j];
	                    studentOfGrade = students[i];
	                }
	            }
	        }
	       System.out.println(studentOfGrade + " " + maxGrade);
	}
}
