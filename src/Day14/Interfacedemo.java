package Day14;

interface shape{
	int length = 10; //final and static
	int width = 30;  //final and static
	void circle();   // abstract method Unimplemented method it is default method here
	
	default void square() {
		System.out.println("this is square-----default method");
	}
	
	static void rectangle() {
		System.out.println("this is rectangle------static method");
		
	}
	
}


public class Interfacedemo implements shape
{
	public void circle() {  // To implement here it should be made public using the keyword 
		System.out.println("this is circle....a bstarct method");
		}
	
	void triangle() {
		System.out.println("This is triangle---default method");
	}
	int x=50;
	int y=49;

	public static void main(String[] args) {
		// Scenario 1
		Interfacedemo idobj = new Interfacedemo();
		idobj.circle();
		idobj.square();
		shape.rectangle(); // static method directly access from the interface 
		idobj.triangle();
		
		
		//Scenario 2
		
		shape sh = new Interfacedemo();
		
		sh.circle();
		sh.square();
		shape.rectangle();// static method directly access from interface
		//sh.triangle(); // we cannot access the method using interface reference
		System.out.println(sh.length*sh.width);
		//sh.x; // cannot access because it is declared in interface demo class
		
		

	}

}
