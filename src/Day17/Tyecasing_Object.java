package Day17;

class Parent{
	String name = "jhon";
	
	void m1() {
		System.out.println("This is m1 from parent...");
	}
}
class Child extends Parent
{
	int id = 101;
	
	void m2() {
		System.out.println("This is m2 from child....");
	}
}
	


public class Tyecasing_Object {

	public static void main(String[] args) {
		
		// Upcasting
	/*	Child c = new Child();
		System.out.println(c.id); //child
		c.m1(); // parent
		c.m2(); //child
		System.out.println(c.name);// parent */
		
	/*	Parent p = new Child(); //Parent class reference variable can hold the child object
		
		System.out.println(p.name); //parent
		p.m1(); // parent
		p.m2(); //parent cannot access anything from child in this case
		System.out.println(c.id); //child */
		
		
		
	}

}
