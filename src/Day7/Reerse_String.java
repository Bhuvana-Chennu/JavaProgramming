package Day7;

//import java.util.Scanner;

public class Reerse_String {
	public static void main(String[]args) {
		//String s="welcome";
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);*/
		
		//Approach2 without using string methods
		/*String s="welcome";
		String rev="";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse string is:"+rev);*/
		
		//Approach 3
		/*StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());*/
		
		//approach3
		
		StringBuilder s=new StringBuilder("welcome");
		System.out.println(s.reverse());
	}

}
