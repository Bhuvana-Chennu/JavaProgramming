package Day16;

import java.rmi.AccessException;
import java.util.Scanner;

public class Handle_Exception {

	public static void main(String[] args) {
System.out.println("program is started.....");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num:");
		int num = sc.nextInt();
		try
		{
		System.out.println(100/num); //Arthemetic Exception
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("program is completed..");
		System.out.println("program is exited...");

	}

}
