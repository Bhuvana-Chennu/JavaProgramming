package Day17;

//Daughter--A d--b = (Daughter)--C f--d
/*
 * RULE 1: Conversion is valid or not---compile time error
 * The type of C and d should have relationship. (parent to child or vice verca) 
 * 
 * 
 */

class Father{}

class Daughter extends Father{}
class Son extends Father{}


public class TypeCasting_Object2 {

	public static void main(String[] args) {
		
		Father f = new Son();
		Daughter d = (Daughter) f;
        //Rule 2: Assignment is valid or not----Compile time error
		//C must be Same or Parent of A
		//Father f = new Daughter();
		//Son s = (Son) f;
		
	//	Father f = new Daughter();
		
	//	Son s = (Daughter) new Father();  Invalid as per second rule
		
		//RULE 3 : The underlying object type of 'd' must be either same or child of 'C' ---Run time error
		
		//Father f = new Daughter();
		//Son s = (Son) f; // The underlying object of f is Daughter. No relation b/w Daughter and son
		
		//Father f = new Son();
		
		Son s = (Son) f; //RULE1--YES, RULE2--YES,  RULE3---- YES
		
		

	}

}
