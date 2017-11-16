import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		long[] dictionary = new long[92];	long fib; long  n1 = 0; long n2 =1;
		for(int i=1;i<92;++i)   
		 {    
		  fib=n1+n2;    
		  dictionary[i] = fib;   
		  n1=n2;    	n2=fib;    
		 }    		
		while(testCases-- != 0){
			long user = Long.parseLong(br.readLine());
			byte n = 0;			
 
			if(user == 1) System.out.println("1");
			
			else{ 
				for(int i = 1; i < 92; i++){
					if(dictionary[i] <= user) n++;
				}
				System.out.println(n);
			}
		}
	}
} 