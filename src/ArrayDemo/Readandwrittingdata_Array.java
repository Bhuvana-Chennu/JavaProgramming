package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Readandwrittingdata_Array {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a value for te position"+i);
			a[i]=sc.nextInt();
			
		}
		System.out.println("printing array elements");
		System.out.println(Arrays.toString(a));

	}

}