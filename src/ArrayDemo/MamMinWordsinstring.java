package ArrayDemo;

public class MamMinWordsinstring {

	public static void main(String[] args) {
		String s1 ="Hi this is Java Selenium";
		String[] words =s1.split("\\s+");
		System.out.println(words[1]);
		String minword = words[0];
		String maxword = words[0];
		
		for(String word:words)
		{
			if(word.length()<minword.length())
			{
				minword = word;
			}
			
			if(word.length()>maxword.length())
			{
				maxword = word;
			}
		}
		
		System.out.println(minword);
		System.out.println(maxword);
		
		

	}

}
