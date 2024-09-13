package ArrayDemo;

import java.util.Arrays;
import java.util.List;

public class Single_DimensionalArray {

	public static void main(String[] args) {
		// declaring array
		
		//Approach 1
		
		/*int a[]=new int[5]; // []a=a[]
		a[0]=100;
		a[1]=56;
		a[2]=150;
		a[3]=67;
		a[4]=46;*/
		
		int a[]= {100,200,300,400,500};
		System.out.println(a.length);
		System.out.println(a[0]);
		
		
		/*for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}*/
		for(int x:a) {
			System.out.println(x);
		}
		
		List<int[]> numArrayList = Arrays.asList(a);
		

	}

}
