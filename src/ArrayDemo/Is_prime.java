package ArrayDemo;

import java.util.Scanner;

public class Is_prime {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		boolean flag =false;
		
		
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num+" It is a prime number");
			
			
		}
		else {
			System.out.println("Not a prime number");
		
		}
		

	}

}
