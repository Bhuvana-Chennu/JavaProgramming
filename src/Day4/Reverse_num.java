package Day4;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: "); //6789
		
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;//0+9=9, 90+8=98,  980+7=987, 9870+6=9876
			num=num/10;//678,67,6
			
		}
		//using StringBuffer  class
		/*StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));	
				rev=sb.reverse();*/
		
		
	    if(rev==num) {
	    	System.out.println("entered num is palindrome");
	    }
	    else {
	    	System.out.println("not a palindrome");
	    }
	}

}
