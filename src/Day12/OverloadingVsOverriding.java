package Day12;

class XYZ
{
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
}
class PQR extends XYZ   //three methods are present m1,m2 with one parameters and m2 with 2 params
{
	void m1(int a) //m1 of parent class is override by child class. 
	{
	
		System.out.println(a*a);
		
	}
	void m2(int a,int b) //m2 of parent class is overloaded by child class
	{
		System.out.println(a+b);
	}
}
/*Method Overriding
 --------------------
  1)Possible only in Multiple classes(inheritance)
  2)We should not change the signature/declaration of the method but we should change body of method
  3)Method names are same
  4)belongs to inheritance
 * -----------------------------------
 * 
 * Method Overloading
 * -------------------------
 * 1)Possible in single/multiple classes(with or without inheritance)
 * 2)We should change the signature/declaration of the method
 * 3)method names are same
 * 4)belongs to polymorphism
 * ------------------------------------------------------
 * final-----methods, class,variables
 * 
 */

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		PQR xobj = new PQR();
	//	xobj.m1(23);
	//	xobj.m2(45);
	//	xobj.m2(12, 50);
		xobj.m1(4);
		
		xobj.m2(6);
		xobj.m2(20, 67);
		
		

	}

}
