package Day11;

public class Stsic_Keyword {
	static int a = 10; //static variable
	int b = 20;  // non static variable
	
	static void m1() {
		System.out.println("this is m1 static mehod");
	}
	
	void m2() {
		System.out.println("this is m2 non staticmethod");
	}
	void m() // we can access every thing in non static method directly
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) // but we cannot access directly non static methods in static method
	{
		/*
		 * Static keyword can be applied for both variables and methods
		 * Static variables
		 * Static methods
		 * 
		 * Non Static variables
		 * Non Static methods
		 * Static keyword is used when we have same values for variables across different objects
		 * static methods can access static stuff directly (without objects)
		 * static methods can access non static stuff through object.
		 * non static methods can access every thing directly	
		 */
		System.out.println(a);
		m1();
		
		// System.out.println(b); cannot access non static variable directly
		// m2(); cannot access non static method directly
		Stsic_Keyword sk = new Stsic_Keyword();
		System.out.println(sk.b);
		sk.m2();
		sk.m();
	}
	/*
	 * public static void main(String args[])
	 * {
	 * }  -----valid main method syntax
	 *  
	 * static public void main(String args[])
	 * {
	 * }---------------valid main method
	 * 
	 * public void static main(String args[])
	 * {
	 * }------------------invalid void position should not be changed
	 * 
	 * public static void (int a[])
	 * {
	 * }-----------------this is valid but not the main method JVM looking for but valid
	 * 
	 */

}
