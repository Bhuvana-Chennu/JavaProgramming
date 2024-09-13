package OOPs;

public class DemoObject {
	public void employee() {
		String emp1 = "Ramya";
		String Desg = "QA Tester";
		double sal = 24567.89;
		System.out.println(emp1);
		
	}
	public String student(String stuname) {
		return stuname;
		
	}

	public static void main(String[] args) {
		DemoObject obj = new DemoObject();
		obj.employee();
		
		System.out.println(obj.student("Shanmukha"));
	}

}
