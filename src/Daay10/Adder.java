package Daay10;

public class Adder {
	int a=10,b=30;
	void sum() 
	{ // no parameters
		System.out.println(a+b);
	}
	
	void sum(int x, int y) 
	{  // two parameters
		System.out.println(x+y);
		
	}
	void sum(int x, double y) 
	{ // different data types
		System.out.println(x+y);
		
	}
	void sum(double x, int y) 
	{
		System.out.println(x+y);
	}
	void sum(int a, int b, int c) 
	{
		System.out.println(a+b+c);
	}
	
}	