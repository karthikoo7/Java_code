package demos;
import staff.*;
import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Emp [] arr = new Emp[3];
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:/myData/empsData"));
		
		for( int i =0; i< arr.length; i++) {
			Object o = ois.readObject();
			if(o instanceof Emp) {
				arr[i] = (Emp)o;
			}
		}
		for(Emp e : arr) {
			System.out.println(e);
		}
	}

}
