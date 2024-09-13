package Day6;

public class Keyword_this {
	String name;
	int age;
	//Constructor
	public Keyword_this(String name,int age) {
		this.name =name;
		this.age = age;
	}
	//Getter for name
	public String get_name() {
		return name;
	}
	//Setter for name
	
	public void change_name(String name) {
		this.name = name;
		
	}
	//Method to print details
	public void printDetails() 
	{
	System.out.println("Name : " + this.name);	
	System.out.println("Age: "+this.age);
	System.out.println();
	}
	

	public static void main(String[] args) {
		
		Keyword_this first = new Keyword_this("Bhuvana", 29);
		Keyword_this second = new Keyword_this("Sagar", 35);
		first.printDetails();
		second.printDetails();
		first.change_name("Prabha");
		System.out.println("Name has been changed to: " + first.get_name());
		first.printDetails();

	}

}
