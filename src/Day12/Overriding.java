package Day12;

class Bank
{
	double RTI() {
		return 0;
	}
}
class ICICI // here the method is same but implementation is different here it returns 10.5 interest
{
	double RTI() {
		return 10.5;
	}
}
class SBI
{
	double RTI() {
		return 7.89;
	}
}

// over riding is achieved with inheritance whereas overloading is achieved with or without inheritance


public class Overriding {

	public static void main(String[] args) {
			
		ICICI ic = new ICICI();
		System.out.println(ic.RTI());
		
		SBI sb = new SBI();
		System.out.println(sb.RTI());
	}
	
	

}
