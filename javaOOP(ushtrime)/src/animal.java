
public class animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends animal{
	public void animalSound() {
		System.out.println("The pig makes: wee wee");
	}
}

class Dog extends animal{
	public void animalSound() {
		System.out.println("The dog makes: woof woof");
	}
}

class Main{
	public static void main(String[] args) {
		animal obj = new animal();
		animal mydog = new animal();
		animal mypig = new animal();
		
		obj.animalSound();
		mydog.animalSound();
		mypig.animalSound();
	}
}