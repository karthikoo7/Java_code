package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CharacterOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "coccacola";
		
		Map<Character,Integer> mp = new HashMap<>();
		
		for(int i = 0; i<str.length();i++) {
			
			char c = str.charAt(i);
			
			mp.put(c, mp.getOrDefault(c, 0)+1); //return value stored at c if found and then adds 1, else adds it the map and stores with count 1
		}
		
		for(Entry<Character, Integer> m : mp.entrySet()) {
			System.out.println(m);
			
		}
		System.out.println("***********************************************");
		
		// Another Solution: Another Logic to implemetn and solve the probleam
		
		Map<Character,Integer> map = new TreeMap<>();
		
		for(int i = 0; i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		
		for(Entry<Character, Integer> m : mp.entrySet()) {
			System.out.println(m);
			
		}
		
		
		
	

	}

}
