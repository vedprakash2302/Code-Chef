import java.util.*;
import java.io.*;
public class Main {
 
	static String first_, current, other, L1, L2;
	static int count, N; static boolean switchLock =false;
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		boolean lock;
		boolean NO;
		while(testCases-- != 0){
			count = 0;
			lock =true; switchLock = false;
			NO = false;
			L1 = br.readLine();
			L2= br.readLine();
			current = L1;
			other = L2;
			N = L1.length();
			for(int i =-1; i < N-1; i++){
 
				if(current.charAt(i+1) == '#' && other.charAt(i+1)=='#'){
					System.out.println("No"); NO = true; break;
				}
				if(lock){
					if(current.charAt(i+1)=='#'){ first_ = L1; lock = false;}
					if(other.charAt(i+1)=='#'){ first_ = L2; lock = false;}
				}
 
				if(current.charAt(i+1) == '#') switch1();
			}
			if(!NO) System.out.println("Yes " + count);
		}
 
	}
 
	private static void switch1() {
		String temp = current;
		current = other;
		other = temp;
		count++;
		if(!switchLock && first_ == L1){ count--; switchLock =true;}
	}
} 