package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AS6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> mp = new HashMap<>();
		
		mp.put(43, "Rehman");
		mp.put(62, "Kabir");
		mp.put(71, "Don");
		mp.put(78, "Karthik");
		mp.put(25, "Dhurandhar");
		mp.put(33, "Dancing Man");
		mp.put(null,"TIger");
		
		
		System.out.println(mp);
		
		System.out.println("*************************************");
		
		for(Entry<Integer, String> m : mp.entrySet()) {
			System.out.println(m);
			
		}
		
		System.out.println("*************************************");
		
		//convert map to set
		
		Set<Entry<Integer,String>> set = mp.entrySet();
		
		Iterator <Entry<Integer,String>> it = set.iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> entry = it.next();
			System.out.println("Key : "+ entry.getKey() + "| Value: " + entry.getValue());
		}

	}

}
