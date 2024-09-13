package Day7;

public class String_StringBuffer_StringBuilder {
	public static void main(String[] args) {
		//String immutable
		/*String s="welcome";
		s.concat("to java");
		System.out.println(s); //welcome cannot  change the value in variable*/
		//StringBuffer ---mutable
		/*StringBuffer s=new StringBuffer("welcome");
		s.append("to java");
		System.out.println(s);// welcome to java----mutable--original value changed*/
		
		//StringBuilder---mutable
		StringBuilder s=new StringBuilder("welcome");
		s.append("to java");
		System.out.println(s);// welcome to java----mutable,original value changed
	}

}
