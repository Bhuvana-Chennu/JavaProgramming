package Day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap_Demo {

	public static void main(String[] args) {
	//	HashMap hm = new HashMap();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101,"Jhon");
		hm.put(102,"kin");
		hm.put(103,"Marry");
		hm.put(104,"Kim");
		hm.put(101,"krish");
		System.out.println(hm);
		System.out.println(hm.size());
		hm.remove(103);
		System.out.println(hm);
		//value of the key
		System.out.println(hm.get(104));
		
		//Get all keys
		System.out.println(hm.keySet()); //[101, 102, 104]
		System.out.println(hm.values());//[krish, kin, Kim]
		System.out.println(hm.entrySet());//[101=krish, 102=kin, 104=Kim]
		
		//Reading data from hashmap //101  krish
									//102  kin
									//104  Kim
	/*	for(int k:hm.keySet()) 
		{
			System.out.println(k + "  "+hm.get(k));
		}*/
		
		Iterator<Entry<Integer,String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		hm.clear();
		hm.isEmpty();
	}

}
