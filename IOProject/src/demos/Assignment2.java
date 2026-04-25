package demos;
import java.io.*;
public class Assignment2 {

	//Accept the lines of data from the user through console until user types "quit". display no of characters for longest line entered by user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			int count = 0;
			while(!((str = br.readLine()).equals("quit"))) {
				System.out.println(str);
				
				if(str.length() > count) {
					count = str.length();
				}
			}
			System.out.println("LONGEST : "+count);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
