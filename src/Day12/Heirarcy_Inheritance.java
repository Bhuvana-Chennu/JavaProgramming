package Day12;

class P
{
	void show(int a) {
		System.out.println(a);
	}
}
class child1 extends P
{
	void display(int b) {
		System.out.println(b);
	}
}
class child2 extends P
{
	void print(int c) {
		System.out.println(c);
	}
}



public class Heirarcy_Inheritance {

	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.display(46);
		c1.show(56);
		
		
		child2 c2 = new child2();
		
		c2.print(50);
		c2.show(45);

	}



	
}