package Arraylist;



public class String_Rev {

	public static void main(String[] args) {
		
		  String str="Welcome"; 
		  String rev = ""; 
		  
		  
		  /*int len = str.length(); 
		  for(int i=len-1;i>=0;i--) 
		  { 
			  rev= rev+str.charAt(i); 
		  } 
		  System.out.print(rev);
		 */
		  
		  /*char a[] = str.toCharArray();
		  //System.out.println(a);
		  int len = a.length;
		  for(int i =len-1;i>=0;i--)
		  {
			  rev = rev+a[i];
		  }*/
		  
		  StringBuffer sb= new StringBuffer(str);
		  System.out.println(sb.reverse());
		
		
	}

}
