package Day4;

import java.util.Scanner;

public class Count_even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		int Evencount=0;
		int Oddcount=0;
		
		while(x>0) {
			int rem=x%10;
			if(rem%2==0) {
				Evencount=Evencount+1;
				
			}
			else {
				Oddcount=Oddcount+1;
			}
			x=x/10;
		
		}
		System.out.println("no of even digits:"+Evencount);
		System.out.println("no of odd digits:"+Oddcount);
	}

}
