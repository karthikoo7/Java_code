public class Hello{

	public static void main(String [] args){
		int num = 28;
		int i = 1;
		int sum =0;
		
		while(i<=num){
			if(num % i == 0){
				System.out.println(i);
				sum += i;
				
		}
		 
		i++; 
}
		System.out.println("SUM-" + sum);




		}
}