package ArrayDemo;

public class Frequencyofsubsting {

	public static void main(String[] args) {
		String s1 = "Welcome to bhimavaram which is second Bardoli of India";
	
		String s2 ="India";
		String[] words = s1.split("\\s+");
		int count =0;
		for(String word:words)
		{
			if(word==s2)
			{
				count+=count;
			}
		}
		
		System.out.println(count);

	}

}
