package hashSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new TreeSet<>(new Comparator<String>() { //Anonymous Inner Function

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
			
		});
		
		set1.add("if");
		set1.add("implements");
		set1.add("class");
		set1.add("john");
		set1.add("kabir");
		set1.add("winning");
		set1.add("dancer");
		set1.add("master");
		set1.add("wow");
		
		for(String s: set1) {
			System.out.println(s);
		}


	}

}
/*
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}
	
}*/
