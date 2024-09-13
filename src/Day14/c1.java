package Day14;

public class c1 extends C2 implements I1, I2  //Hybrid inheritance combination of multiple and heirarical inheritance
{
	public void m1()
	{
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		c1 c1obj = new c1();
		c1obj.m1();
		c1obj.m2();
		c1obj.m3();

	}

}
