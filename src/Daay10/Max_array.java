package Daay10;

public class Max_array {

	public static void main(String[] args) {
		int a[] = {100,45,78,90};
		int max =a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<=a[i]) {
				max=a[i];
				
			}
			if(min>=a[i]) {
				min=a[i];
				
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
