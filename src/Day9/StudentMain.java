package Day9;

public class StudentMain {

	public static void main(String[] args) {
	//	Student stu=new Student();
	/*	//using object reference variable
		stu.sid=101;
		stu.grade='A';
		stu.sname="bhuvana";
		stu.printStudentData();
		
		//using method
		stu.setStudentData(102,"bhuvana", 'A');
		stu.printStudentData();*/
		// Using constructors
		Student su= new Student(101,"Bhuvana",'A');
		su.printStudentData();
		
	}

}
