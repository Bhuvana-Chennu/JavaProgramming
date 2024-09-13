package Day6;

import java.util.Arrays;

public class String_methods {

	public static void main(String[] args) {
		// String s= "welcome";
		// String s= new String("welcome");
		// System.out.println(s);
		 
		// length()- returns length i.e num of characters in a string
		String s="welcome";
		System.out.println(s.length()); // 7
		System.out.println("welcome".length()); // 7
		//concat-- at a time join two strings 
		
		String s1="welcome";
		String s2="home";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		String a="Hello";
		String b="Bhuvana";
		String c="prabha";
		String d ="chennu";
		System.out.println(a.concat(b).concat(c).concat(c));
		
		// trim()--removes right and left spaces
		
		String x="   welcome   ";
		System.out.println("Before trimming"+ x.length());
		System.out.println(x); 
		System.out.println(x.trim());
		System.out.println("After trimming"+x.trim().length());
		
		// charAt() -  returns a character from a string based on index
		
		x="bhuvana";
		System.out.println(x.charAt(3)); //v
		
		// contains()--returns true or false
		System.out.println(a.contains("llo ")); // true
		System.out.println(b.contains("BHu"));// false it is case sensitive
		
		//equals()  equalsIgnoreCase()--- compares strings
		
		System.out.println(a.equals(b));
		a="bhuvana";
		b="bhuvana";
		String y = "bhuvana";
		System.out.println(a.equals(b));// true
		System.out.println(a.equals("Bhuvana")); //false
		System.out.println(a.equalsIgnoreCase("BHUVANA")); //true
		System.out.println(a==y); // true
		
		//replace()---replace single or multiple sequence of characters
		
		s="Welcome to selenium";
		System.out.println(s.replace('l', 'b')); //Wclcomc to sclcnium
		
		System.out.println(s.replace("selenium", "playwright"));
		
		//substring()---returns the substring in a string. we have to pass starting index and ending index
		// starting index starts from zero and for ending index starts from 1
		//welcome staring index(0,1,2,3,4,5,6) ending index(1,2,3,4,5,6,7) 
		
		s="welcome";
		System.out.println(s.substring(1,5));//elco
		
		
		//toUpperCase()  toLowerCase()
		
		System.out.println(s.toUpperCase());
		
		// split()---splits the string into multiple parts based on delimiter(@,.,space)
		s="abcd@gmail.com";
		String z[]=s.split("@");// split method returns arrays
		System.out.println(z[0]);
		System.out.println(Arrays.toString(z));
		
		String amount="$15,20,30";// 152030
		System.out.println(amount.replace("$", "").replace(",", ""));
		s="abcd,1234@ghi";
		String array1[]=s.split(",");
		System.out.println(Arrays.toString(array1));
		String array2[]=array1[1].split("@");
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array1[0]);
		// * ^ () % &--you cannot use this as delimiters  
		s="abc xyz pqr";
		String v[]=s.split(" ");
		System.out.println(Arrays.toString(v));
		
		String name="Jhon kenedy";
		System.out.println(name.toLowerCase().subSequence(0, 4));
		System.out.println(name.replace('J', 'j').contains("jhon"));
		
		
		
	}

}
