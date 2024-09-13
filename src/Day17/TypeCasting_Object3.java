package Day17;

//A b = (C) d

public class TypeCasting_Object3 {

	public static void main(String[] args) {
		//Object o = new String("welcome");
		//StringBuffer sb = (StringBuffer)  o; 
		//String s = new String("welcome");
		 //StringBuffer sb = (StringBuffer) s 
		
		// Object o = new String("welcome");
		// StringBuffer sb = (StringBuffer) o; 
	//	Object o = new String("welcome");
	//	StringBuffer sb = (String) o; // Rule 1 passes Rule 2 failed
		
	//	String s = new String("welcome");
	//	StringBuffer sb = (String) s; //Rule 1 passes, Rule 2 fail
		
		Object o = new String("welcome");
		String s = (String) o;
		System.out.println(s);
		
	}

}
