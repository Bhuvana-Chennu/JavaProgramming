 package Day12;
 
 class Test
 {
	final int x= 100;
 }

public class Final_Keyword {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);
		/*
		 * variables-we cannot change the value of variable(constant)
		 * Mehods-We cannot override those methods in child classes
		 * When we apply final keyword for a class we cannot use as parent class 
		 * we cannot override those methods in child class when we use final keyword
		*/

	}

}
