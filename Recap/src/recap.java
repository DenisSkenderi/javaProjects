import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Animal{
	public void animalSound() {
		System.out.println("Animal makes a sound");
	}
}
class Sheep extends Animal{
	public void animalSound() {
		System.out.println("The sheep says: baa baa");
	}
}
class Dog extends Animal{
	public void animalSound() {
		System.out.println("The dog says: woof woof");
	}
}

class outterClass{
	int x = 10;
	class innerClass{
		int y = 20;
	}
}

abstract class Ani{
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("ZzZzZzZ...");
	}
}

class Cow extends Ani{
	public void animalSound() {
		System.out.println("Cow says: Mooo MoOo");
	}
}

interface Animall{
	public void animalSound();
	public void sleep();
}
class Horse implements Animall{
	public void animalSound() {
		System.out.println("Horse says: neigh");
	}
	public void sleep() {
		System.out.println("ZzzZzzZzzZ...");
	}
}
enum Level {
	LOW,
	MEDIUM,
	HIGH
}
public class recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal();
		Animal mySheep = new Sheep();
		Animal myDog = new Dog();
		Animal myani = new Animal();
		Cow myCow = new Cow();
		Horse myHorse = new Horse();
		myAnimal.animalSound();
		mySheep.animalSound();
		myDog.animalSound();
		outterClass out = new outterClass();
		outterClass.innerClass inner = out.new innerClass();
		System.out.println(out.x + inner.y);
		myCow.animalSound();
		myCow.sleep();
		myHorse.animalSound();
		myHorse.sleep();
		Level myvar = Level.LOW;
		System.out.println(myvar);
		switch(myvar) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("Hight Level");
			break;
		}
		for(Level myVar:Level.values()) {
			System.out.println(myVar);
		}
		LocalDate obj = LocalDate.now();
		System.out.println(obj);
		LocalTime myobj = LocalTime.now();
		System.out.println(myobj);
		LocalDateTime obj2 = LocalDateTime.now();
		System.out.println(obj2);
		DateTimeFormatter Obj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = obj2.format(Obj);
		System.out.println(formattedDate);
		ArrayList<String> car = new ArrayList<String>();
		car.add("Volvo");
		car.add("Audi");
		car.add("Mercedes");
		car.add("Ford");
		car.add("BMW");
		car.add("Mazda");
		System.out.println(car);
		car.get(0);
		car.set(0,"Opel");
//		car.remove(1);
//		car.clear(); Removes everything in ArrayList
//		car.size(); To find how many elements are in ArrayList
		for(int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i));
		}
		System.out.println();
		for(String i : car) {
			System.out.println(i);
		}
		ArrayList<Integer> Number = new ArrayList<Integer>();
		Number.add(4);
		Number.add(1);
		Number.add(5);
		Number.add(2);
		Number.add(3);
		for(int i : Number) {
			System.out.println(i);
		}
		Collections.sort(car);
		for(String i : car) {
			System.out.println(i);
		}
		Collections.sort(Number);
		for(int i : Number) {
			System.out.println(i);
		}
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Audi");
		cars.add("Mercedes");
		cars.add("BMW");
		System.out.println(cars);
		HashMap<String, String> capital = new HashMap<String, String>();
		capital.put("England" , "London");
		capital.put("USA", "Washington DC");
		capital.put("Germany", "Berlin");
		capital.put("Sweden", "Stockholm");
		capital.put("Norway", "Oslo");
		System.out.println(capital);
		for(String i : capital.values()) {
			System.out.println(i);
		}
		for(String i : capital.keySet()) {
			System.out.println("Key: " + i + " Values: " + capital.get(i));
		}
		for(String i : capital.keySet()) {
			System.out.println(i); 
		}
	}
}
