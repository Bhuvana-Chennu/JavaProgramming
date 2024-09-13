package Day7;

import java.util.Arrays;

public class Mutable_Immutable {

	public static void main(String[] args) {
		//mutable---we can change (if any operation or method able to change the value of variable)
		//Immutable--cannot change (if any method or operation not able to change the value of variable)
		//mutable
		int a[]= {12,4,7,8,76,56};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);  // mutable
		System.out.println(Arrays.toString(a));
		
		//immutable
		String s= new String("welcome");
		System.out.println(s);
		String x=s.concat("to java");
		System.out.println(s);//welcome----> immutable
		System.out.println(x);
	}

}
