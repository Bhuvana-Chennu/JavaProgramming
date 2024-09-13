package ArrayDemo;

public class No_of_Reoetitons {
	public static void main(String[] args) {
		int a[]= {100,200,100,100,400,200};
		int num=200;
		int count =0;
		for(int z:a) {
			if(z==num) {
				
				count++;
			}
		}
		System.out.println(count);
	}

}
