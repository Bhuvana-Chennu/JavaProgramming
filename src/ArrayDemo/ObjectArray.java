package ArrayDemo;

public class ObjectArray {

	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] =1;
		x[1] = 4;
		x[2] = 5;
		x[3] =4;
		x[4] =6;
		System.out.println(x[3]);
		System.out.println("Length of an array is"+x.length);
		
		for(int y:x) {
			System.out.println(y);
		}
		Object a[]= {100,10.54,'d',"welcome",true};  // to store hetrogenous data in an array generally not preferable insted use arraylist 

		/*for(Object x:a) {
			System.out.println(x);
		}*/
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
