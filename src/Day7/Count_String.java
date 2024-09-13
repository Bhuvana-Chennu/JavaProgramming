package Day7;

public class Count_String {

	public static void main(String[] args) {
		String a="welcome";
		/*
		 * char s[]=a.toCharArray(); int count=0; for(int i=0;i<a.length();i++) {
		 * count+=1;
		 * 
		 * }
		 */
		int count = 0;
		for(int i=0;i<a.length();i++)
		{
			count++;
		}
		System.out.println(count);

	}

}
