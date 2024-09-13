package Day15;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		//String--int
		
		/*String s = "welcome";
		int sint = Integer.parseInt(s);
		System.out.println(sint); // cannot convert string to integer*/
		
		/*String a = "1234";
		int a1=Integer.parseInt(a);
		System.out.println(a1);
		String s1 = "12";
		String s2 = "34";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		String s3= "12.4";
		String s4 = "13.56";
		
		System.out.println(Double.parseDouble(s4)+Double.parseDouble(s3));
		
		String s= "WELCOME"; //other than true if you pass anything it returns false
		System.out.println(Boolean.parseBoolean(s));*/
		
		//int,boolean,char-----String
		
		int a =12;
		double d = 13.56;
		char c = 'A';
		boolean bool = true;
		
		String s = String.valueOf(a);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(bool);
		System.out.println(s);
		
		

	}

}
