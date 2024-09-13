package Day8;

public class Employee_Main {

	public static void main(String[] args) 
	{
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

		

	}

}
