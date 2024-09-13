package ArrayDemo;

public class Two_Dimensionalarray {

	public static void main(String[] args) {
		//declaring array
		//Approach 1
		/*int a[][]=new int[3][2]; // a[][]=[][]a=[]a[]
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;*/
		
		
		// Approach2
		int [][]a= { {100,200}, {300,400}, {500,600}}; // first row second row third row
		System.out.println("length of array is:"+a.length); // this returns the row length
		System.out.println("lngth of columns:"+a[0].length);
		System.out.println(a[1][0]);
		System.out.println(a[2][1]);
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		
		//  enhanced forloop
		/*for(int arr[]:a) {
			for(int x:arr) {
				System.out.println(x+"  ");
				
			}
			System.out.println();*/
		}

	}

}
