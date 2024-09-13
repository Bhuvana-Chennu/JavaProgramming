package Day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		HashSet myset = new HashSet();
	//	Set myset = new HashSet();
	//	HashSet<Integer> myset = new HashSet<Integer>();
		myset.add(123);
		myset.add(12.33);
		myset.add(null);
		myset.add(true);
		myset.add("welcome");
		myset.add('A');
		myset.add(123);
		myset.add(null);
		System.out.println(myset); //[null, A, 123, 12.33, welcome, true]
		myset.remove("welcome"); //we have to pass value not index
		System.out.println(myset);
		
		//Inserting element and accessing specific element is not possible
		
		//Convert HashSet----ArrayList
		ArrayList al = new ArrayList(myset);
    	System.out.println(al.get(3));
    	
    /*	for(Object x:myset)
    	{
    		System.out.println(x);
    	}*/
    	
    	
    	Iterator it = myset.iterator();
    	
    	while(it.hasNext()) {
    		System.out.println(it.next());
    		
    	}
    	//myset.clear();
    	myset.isEmpty();
    	System.out.println(myset.size());
    	
		
		
		
		
	}

}
