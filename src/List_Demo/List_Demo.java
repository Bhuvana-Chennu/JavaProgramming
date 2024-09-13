package List_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class List_Demo {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2= new LinkedList<Integer>();
		List<Integer> list3 = new Vector();
		List<String> list4 = new Stack();
		list1.add("Bhuvana");
		list1.add(1, "Babji");
		list1.add("Rassol");
		list1.add("Vijay");
		list1.add("Pawan");
		list1.add("Babji");
		System.out.println(list1);
		list1.add(null);
		System.out.println(list1);
		//list1.remove(4);
		System.out.println(list1);
		list1.remove(null);
		
		/*
		 * Iterator it = list1.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 * 
		 * for(String l:list1) { System.out.println(l); }
		 * System.out.println(list1.size());
		 * 
		 * for(int i=0;i<list1.size();i++) { System.out.println(list1.get(i)); }
		 */
		
		System.out.println(list1.contains("vedha"));
		System.out.println(list1.isEmpty());
		System.out.println(list1.getFirst());
		//list1.clear();
		//System.out.println(list1);
		//System.out.println(list1.isEmpty());
		System.out.println(list1.indexOf("Babji"));
		System.out.println(list1.removeFirst());
		System.out.println(list1);
		
		/*
		 * Collections.sort(list1); for(String l:list1) { System.out.println(l); }
		 */
		
		
		 Collections.sort(list1); 
		 for(String s : list1) { 
			 System.out.println(s); 
			 }
		 
			/*
			 * for(String l: list1) { System.out.println(l); }
			 */
	}
	
	
	
	
	

}
