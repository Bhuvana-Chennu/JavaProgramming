package Day13;

class Test1
{
	final void m() {
		System.out.println("this is m1 method from test1");
	}
}
class Test2 extends Test1
{
	/*void m() { //we cannot override the method in test2 because m is final method in test1
		System.out.println("this is m method from test2");
	}*/
}

public class FinalKeyword2 {

	public static void main(String[] args) {
		

	}

}
