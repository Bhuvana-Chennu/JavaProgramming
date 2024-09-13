package Day12;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}	
	class B  extends A// single
	{
		int b;
		void show()
		{
			System.out.println(b);
		}
	}
	
	class C extends B//multi level 
	{
		int c;
		void print() {
			System.out.println(c);
		}
	}


public class Inheriance {


	public static void main(String[] args) {
		/*
		 * Acquiring the properties(variables) and  behavior(methods) from one class to another
		 * class is called inheritance.
		 * Objective
		 * -----------------
		 * 1)We can achieve re-usability
		 * 2) Avoid duplication
		 * Types of inheritance
		 * 1)Single---single parent single child
		 * 2)Multi level----chain type
		 * 3)hierarchy---single parent multiple child
		 * 4)multiple---it contains multiple parents and single child.
		 *    It is not supported in class level we can use extend keyword only once in a statement
		 *    There will be parent  class called as OBJECT class for every class and it results in ambiguity
		 * 
		 * 
		 */
		
	/*	B bobj = new B();
		bobj.show();
		bobj.display(); */
		
		C cobj = new C();
		cobj.c=900;
		cobj.b=309;
		cobj.a=345;
		cobj.display();
		cobj.print();
		cobj.show();
				
		
	
			}

}
