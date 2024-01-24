//class Animal{
//	public void animalSound() {
//		System.out.println("The animal makes a sound");
//	}
//}
//
//class Pig extends Animal{
//	public void animalSound() {
//		System.out.println("Pig makes this sound: wee wee");
//	}
//}
//
//class Dog extends Animal{
//	public void animalSound() {
//		System.out.println("Dog makes this sound: woof woof");
//	}
//}


abstract class Animal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzz");
	}
}

class Dog extends Animal{
	public void animalSound() {
		System.out.println("The dog says: woof woof");
	}
}
class Vehicle{
	protected String brand = "Ford";
	public void honk() {
		System.out.println("Beep! Beep");
	}
}

class outterClass{
	int x = 10;
	class innerClass{
		int y = 200;
	}
}

class TickTackToe extends Vehicle{
	private String modelName = "Mustand";
	public static void main(String[] args) {
//		Animal myAnimal = new Animal();
//		Pig myPig = new Pig(); 
//		Dog myDog = new Dog();
//		
//		myAnimal.animalSound();
//		myPig.animalSound();
//		myDog.animalSound();
		
		TickTackToe obj = new TickTackToe();
		obj.honk();
		System.out.println(obj.brand + " " + obj.modelName);
		
		outterClass obj1 = new outterClass();
		outterClass.innerClass obj2 = obj1.new innerClass();
		System.out.println(obj2.y * obj1.x);
		
		Dog myDog = new Dog();
		myDog.animalSound();
		myDog.sleep();
	}
}


