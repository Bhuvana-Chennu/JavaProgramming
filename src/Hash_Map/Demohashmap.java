package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Demohashmap {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<Integer, String>();
		//HashMap map2 = new HashMap();
		map1.put(1, "Bhuvana");
		map1.put(2, "Babji");
		//System.out.println(map1.get(1));
		map1.put(3, "Babji");
		map1.put(4, "Rasool");
		map1.put(5, "Pawan");
		map1.put(6, "Vijay");
		
	//	System.out.println(map1.get(1));
	//	System.out.println(map1.replace(1, "Anusha"));
	//	System.out.println(map1.get(1));
		//System.out.println(map1.get(2));
		//System.out.println(map1.replace(2, "Babji", "Praveen"));
	//	System.out.println(map1.get(2));
		System.out.println(map1.containsValue("Bhuvana"));
		System.out.println(map1.containsKey(7));
		
		System.out.println(map1.keySet());
		System.out.println(map1.entrySet());
		
		for(Map.Entry<Integer, String> s: map1.entrySet())
		{
			System.out.println(s.getKey() + " " + s.getValue());
		}
		
		map1.remove(1);
		System.out.println(map1.get(1));
		System.out.println(map1.remove(2, "Babji"));
		System.out.println(map1.isEmpty());
		
		
	}

}
