package demos;
import java.io.*;

public class Assignment3 {
//Accept file name and folder path from keyboard and then write the accepted to a file and print it back on the console
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		FileWriter fw = null;
		FileReader fr = null;
		
		
		
		try {
			
		br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter Folder Name: " );
		String filePath = br.readLine();
		System.out.println("Enter File Name: " );
		String fileName = br.readLine();
		fr = new FileReader("F:/" + filePath + "/" + fileName);
		fw = new FileWriter("F:/" + filePath + "/" + fileName,true);
		String str;
		
		while(!((str = br.readLine()).equals("quit"))) {
			fw.write(str + "\n");
			//System.out.println(str);
		}
		
		fw.close(); //close write stream to use the read stream
		
		
		int i;
		while((i = fr.read()) != -1) {
			System.out.println((char)i);;
		}
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				br.close();
				fw.close();
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
