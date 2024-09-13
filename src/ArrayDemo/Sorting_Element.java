package ArrayDemo;

import java.util.Arrays;

public class Sorting_Element {
	public static void main(String[] args) {
		int a[]= {100,600,200,50,150};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));
		
	}

}
