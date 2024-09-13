package Day11;

public class Static_Main {

	public static void main(String[] args) {
		System.out.println(Stsic_Keyword.a);// classname.variable
		Stsic_Keyword.m1();// classname.method
		
		//System.out.println(b); cannot access non static variable directly
		//m2(); cannot access non static method directly
		Stsic_Keyword sk = new Stsic_Keyword();
		System.out.println(sk.b);
		sk.m2();
		sk.m();

	}

}
