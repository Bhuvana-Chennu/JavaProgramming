package Day13;

public class Animal {
	int x=100;
	String colour = "white";
	
	void eat() {
		System.out.println("eating........");
	}
}

class Dog extends Animal{
	String colour = "black";
	
	//super keyword invoke immediate the parent class variable from child class
	//super keyword invokes immediate parent class method from child class
	void displaycolour() {
		System.out.println(super.colour);
		System.out.println(colour);
	}
	void eat() {
		//System.out.println("eating bread.......");
		super.eat();
	}
	void cat() {
		System.out.println("cat is a animal");
		
	}
	
	
}
class cat extends Dog{
	void display()
	{
		System.out.println("cat is a domestic  animal");
		super.cat();
		
	}
}