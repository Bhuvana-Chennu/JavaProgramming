package ArrayDemo;

public class Sum_ofArray {

	public static void main(String[] args) {
		int a[]= {23,45,67};
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i]; //23 23+45=68 68+67
			
		}
		System.out.println(sum);

	}

}
