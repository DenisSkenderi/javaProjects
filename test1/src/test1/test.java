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
	           System.out.println(circle + "\n" + perimeter);
	       }else if(choose == 2) {
	    	   System.out.println("Give rectangle width");
	            double width = scan.nextDouble();
	            System.out.println("Give rectangle height");
	            double height = scan.nextDouble();
	            double rectangle = width * height;
	            double perimeter = (width + height) * 2;
	            System.out.println(rectangle + "\n" + perimeter);
	       }else if(choose == 3) {
	    	   System.out.println("Give triangle height");
	           double triangleHeight = scan.nextDouble();
	           System.out.println("Give triangle base");
	           double base = scan.nextDouble();
	           double hypotenuse = Math.sqrt(base * base + triangleHeight * triangleHeight);
	           double area = 0.5 * base * triangleHeight;
	           double perimeter = base + triangleHeight + hypotenuse;
	           System.out.println(hypotenuse + "\n" + perimeter);
	       }else {
	    	   System.out.println("Invalid number");
	       }
	       /*6*/
	       double price = 10.0;
	       double additional = 0.005;
	       double tone = 4.0;
	       System.out.println("Enter water used in liters: ");
	       double water = scan.nextDouble();
	       if(water > tone) {
	    	   double liter = water - tone;
	    	   double cost = liter * additional;
	    	   price += cost;
	       }
	        System.out.println(price + '$');
	        /*3*/
	        String text = "Ab3bd";
	        System.out.println(text);
	        int length = text.length();
	        int num[][] = new int[length][length];
	        for (int i = 1; i <= length; i++) {
	            for (int j = 0; j < length - i + 1; j++) {
	                int k = j + i - 1;
	                if (i == 1) {
	                    num[j][k] = 0;
	                } else if (text.charAt(j) == text.charAt(k)) {
	                    num[j][k] = num[j + 1][k - 1];
	                } else {
	                    num[j][k] = 1 + Math.min(num[j][k - 1], num[j + 1][k]);
	                }
	            }
	        }
	        System.out.println(num[0][length - 1]);
	        /*1*/
	        String student[] = {"Ardit", "Arber", "Arlind"};
	        int grades[][] = {{80,63},{90,75},{80,90}};
	        int maxGrade = 0;
	        String studentOfGrade = "";
	        for(int i = 0; i < grades.length; i++) {
	        	for(int j = 0; j < grades[i].length;j++) {
	        		studentOfGrade = student[i];
	        		maxGrade = grades[i][j];	        	
	        	}
	        }
	        System.out.println(studentOfGrade + " " + maxGrade);
	}
}
