package Day4;

import java.util.Scanner;

public class Count_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();//3456
		int count=0;
		while(a!=0) {
			count+=1; //1, 2,3,
			a=a/10;   // 345,34,3
	
		}
		System.out.println("no of digits is:"+count);
		
		
	}

}
