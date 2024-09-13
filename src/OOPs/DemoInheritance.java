package OOPs;
class vehicle{
	String brand ="Benz";
	void m1() {
		System.out.println("This is method from parent class");
	}
}
class car extends vehicle{
	String name ="Audi";
	void m2() {
		System.out.println("This is method from child class");
	}
}

public class DemoInheritance {
	
	
		
	public static void main(String[] args) {
		
		car c = new car();
		c.m1();
		c.m2();
		System.out.println(c.brand);
		System.out.println(c.name);
		
		vehicle v = new vehicle();
		v.m1();
		
	

}
}