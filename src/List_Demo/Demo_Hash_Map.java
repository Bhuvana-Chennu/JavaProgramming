package List_Demo;

import java.util.HashMap;
import java.util.Map;


public class Demo_Hash_Map {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<Integer, String>();
	//	HashMap map2 = new HashMap();
		map1.put(1, "Bhuvana");
		map1.put(2, "Sagar");
		map1.put(3, "Shannu");
		map1.put(4, null);
		map1.put(null, null);
		System.out.println(map1.get(4));
		map1.remove(3);
		map1.replace(4, "Vedha");
		System.out.println(map1.containsKey(3));
		//Set set =map1.keySet();
		
		for(Map.Entry<Integer, String> s:map1.entrySet()) 
		{
			System.out.println(s.getKey() + " " + s.getValue());
		}
		
		 String input = "programming"; // Example string
	        HashMap<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the string to a character array
	        char[] strArray = input.toCharArray();

	        // Iterate through the character array
	        for (char c : strArray) {
	            if (charCountMap.containsKey(c)) {
	                // If the character is already in the map, increment its count
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                // If the character is not in the map, add it with a count of 1
	                charCountMap.put(c, 1);
	            }
	        }

	        // Print characters that are repeated
	        System.out.println("Repeated characters in the string:");
	        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + ": " + entry.getValue());
	            }
	        }
	}

}
