package Day16;

import java.io.FileInputStream;
import java.io.IOException;

public class Checked_Exception {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.println("program started......");
		System.out.println("program in progress..........");
	
		Thread.sleep(4000);
		try
		{
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Documents");
		System.out.println(file.read());
		file.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			
		
		System.out.println("Program finished.........");
		System.out.println("Program exited.......");
		}

	}

}
