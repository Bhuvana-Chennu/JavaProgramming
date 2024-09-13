package Day4;

import java.util.Scanner;

public class Sum_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		int sum=0;
		while(x!=0) {
			sum=sum+x%10;
			x=x/10;
			
		}
		System.out.println("sum of digits is:"+sum);

	}

}
