package Day18;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
	//	List mylist = new ArrayList();---Child class is stored in parent reference variable
		
	//	ArrayList<Integer> mylist = new ArrayList<Integer>();
	//	ArrayList<Employee> mylist = new ArrayList<Employee>();--- Represents Employee objects.Here employyee class must be stored
		
	//	ArrayList<String> mylist = new ArrayList<String>();
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add("Bhuvana");
		mylist.add('A');
		mylist.add(true);
		mylist.add(null);
		mylist.add(100);
		
		System.out.println(mylist.size());
		System.out.println(mylist);
		System.out.println(mylist.remove(7));
		System.out.println(mylist);
		mylist.add(3, "to");
		System.out.println(mylist);
		mylist.set(5,'S' );
		System.out.println(mylist);
		System.out.println(mylist.get(4));
		
		/*for(int i=0;1<mylist.size();i++)
		{
			System.out.println(mylist.get(i));		
			}*/
		
	/*	for(Object x:mylist) {
			System.out.println(x);
		}*/
		//Using iterator
		Iterator<Object> it = mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(mylist.isEmpty());
		ArrayList mylist2 = new ArrayList();
		mylist2.add('S');
		mylist2.add("Welcome");
		mylist2.add("to");
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		mylist.clear();
		System.out.println(mylist.isEmpty());
		
		
	}

}
