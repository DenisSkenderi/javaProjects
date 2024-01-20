package object;

public class object {
//	  int x = 5;
//	  int y = 100;
	String name = "Denis";
	String surname = "Skenderi";
	int age = 18;
	int carYear;
	String carName;
	
//	public void Maria() {
//		System.out.println("Pershendetje! 👾");
//	}
	public object(int year, String name) {
		 carYear = year;
		 carName = name;
	}
	public static void main(String[] args) {
//		object myobj = new object();
//		object myobj1 = new object();
//		int z = myobj.x + myobj1.y;
//		System.out.println(myobj.x);
//		System.out.println(myobj1.y);
//		System.out.println(z);
//		System.out.println("Name: " + obj.name + "\n" + "Surname: " + obj.surname + "\n" + "Age: " + obj.age);
//		obj.Maria();
		object car = new object(1903, "Ford");
		System.out.println(car.carName + " " + car.carYear);
	}
}
