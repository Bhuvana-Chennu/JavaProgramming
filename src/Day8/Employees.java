package Day8;

public class Employees {
	//variables
	int eid;
	String ename;
	String job;
	int sal;
	//Methods
	void display(){ //void no return value when we specify method we have to specify return type
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	/*public static void main(String[] args) { //cannot create a method inside any method
		Employees emp1=new Employees();//object can be created inside main method only 
		emp1.eid=101;
		emp1.ename="Bhuvana";
		emp1.job="QA";
		emp1.sal=15000;
		emp1.display();
		
		Employees emp2=new Employees();
		emp2.eid=102;
		emp2.ename="Sagar";
		emp2.job="Sr.PaintArtist";
		emp2.sal=900000;
		emp2.display();

	}*/

}
