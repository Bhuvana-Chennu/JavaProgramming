package Day11;

public class KeyWords {
	int x,y;  // Class/Instance variables
	KeyWords(int a,int b)
	{
		x=a;
		y=b;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		/*
		 * this keyword
		 * ------------------------
		 * 
		 * Class/Instance variables
		 * Local variables
		 * 
		 */
		KeyWords kw=new KeyWords(100,200);
		kw.display();

	}

}
