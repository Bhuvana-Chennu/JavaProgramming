package Day17;

//Up casting: Converting value from smaller--->larger
//int--long
//float--double
//Down casting: Converting value from larger--->smaller
//long---int
//double--float

public class Type_casting {

	public static void main(String[] args) {
	/*	//Up casting  smaller---larger(this automatic)
		int intvalue = 100;
		long longvalue = intvalue;
		System.out.println(longvalue);*/
		
		
		//Down casting-----larger--->lower
		
	//long longvalue= 100000;
		//int intvalue = (int)longvalue;
		
	double doublevalue = 1255687937279823.5;
	float floatvalue=(float) doublevalue;
	System.out.println(floatvalue);
		
		int x = 100;
		double y = x;
		System.out.println(x);
		
		double d = 10.5;
		int i= (int) d;
		System.out.println(i);
		
		
		
		
		
		

	}

}
