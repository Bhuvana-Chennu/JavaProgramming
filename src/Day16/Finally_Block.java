package Day16;

public class Finally_Block {

	public static void main(String[] args) {
		String s = "welcome";
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Entered into finally block....");
		}
		System.out.println("Program completed......");

	}

}
