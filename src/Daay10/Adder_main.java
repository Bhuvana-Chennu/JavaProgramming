package Daay10;

public class Adder_main {

	public static void main(String[] args) {
		Adder adder=new Adder();
		adder.sum(); //1st method
		adder.sum(200,300); // 2nd method
		adder.sum(12.4, 34); // 4th method);
		adder.sum(2, 3, 4);
		adder.sum(); //40
		adder.sum(12.56, 40);
		adder.sum(14, 35.78);
		adder.sum(34,45, 60);
		adder.sum(30, 56);
		
	}

}