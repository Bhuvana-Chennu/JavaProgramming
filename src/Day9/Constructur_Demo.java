package Day9;

public class Constructur_Demo {
	
	int x,y;
	Constructur_Demo(){ //default constructor
		x=100;
		y=200;
	}
	Constructur_Demo(int a,int b){
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	
	

	public static void main(String[] args) {
		// Constructur_Demo cd=new Constructur_Demo(); //invoke default constructur
		Constructur_Demo cd=new Constructur_Demo(40,50);
		
		cd.sum();
		

	}

}
