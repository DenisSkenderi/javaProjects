import java.util.Scanner;
public class javaoop2 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaoop2 obj = new javaoop2();
		obj.name = "John";
		System.out.println(obj.name);
		obj.age = 19;
		System.out.println(obj.age);
		System.out.println("Hello my name is: " + obj.name + ". I am: " + obj.age + " years old");
		
		obj.setName("Johny");
		System.out.println(obj.getName());
		obj.setAge(26);
		System.out.println(obj.getAge());
		System.out.println("Hello my name's " + obj.getName() + ". I am " + obj.getAge() + " years old");
		
		Scanner name = new Scanner(System.in);
		System.out.println("Enter Name:");
		String username = name.nextLine();
		System.out.println("Hello: " + username);
		System.out.println("Enter your age:");
		int age = name.nextInt();
		System.out.println("Your age is: " + age);
	}

}
