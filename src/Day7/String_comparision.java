 package Day7;

public class String_comparision {
	public static void main(String[] args) {
		//case1
		/*String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);// true
		System.out.println(s1.equals(s2));// true*/
		//case2
		/*String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1==s2); //false  this method is to compare objects
		System.out.println(s1.equals(s2)); //true this method is to compare values of objects*/
		
		//case3
		/*String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));//true*/
		
		// case4
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s2==s3);//true---objects are same/equal
		System.out.println(s2.equals(s3));//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		
				
		
		
	}

}
