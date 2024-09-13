package ArrayDemo;

public class Even_Odd_Inarray {
	public static void main(String[] args) {
		int a[]= {33,45,28,76,88};
		int Evennum=0;
		int Oddnum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				Evennum=a[i];
				System.out.println("Evennum is:" + Evennum);
			}
			else {
				Oddnum=a[i];
				System.out.println("Oddnum is:"+Oddnum);
			}
		}
		
	}

}
