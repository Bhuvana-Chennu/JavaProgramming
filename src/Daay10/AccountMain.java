package Daay10;

public class AccountMain {

	public static void main(String[] args) {
		
		
		Account acc = new Account();
		acc.setaccno(1001);
		//  this keyword is used to 
		System.out.println(acc.getaccno());
		acc.setName("jhon");
		acc.setBalance(450000.567);
		System.out.println(acc.getName());
		
		

	}

}
