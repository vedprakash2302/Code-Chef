import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int count;
		while(testCases-- != 0){
			count = 0;
		String[] s = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		
		if(A == B) System.out.println("0");
 
		else if(A > B){
			while(A != B){
				if(bitCount(A) == 1){
					while(A != B){
						if(A > B) A = A >> 1;
						else {A = A << 1;}
						count++;
					}
			}
			else if(A % 2 == 0){
				A = A >> 1; count++;
			}
			else{
				A = (A - 1) >> 1; count++;
			}
		}
		System.out.println(count);
	}
	
	else{
		while(A != B){
			if(bitCount(A) == 1){
				while(A != B){
					if(A > B) A = A >> 1;
					else{ A = A << 1; }
					count++;
				}
			}
			else if(A % 2 ==0){
				A = A / 2;
				count++;
			}
			else{
				A = (A -1) >> 1;
				count++;
			}
		}
		System.out.println(count);
	}
		
	}
	}
	 public static int bitCount(int u){
     int uCount;
 
     uCount = u - ((u >> 1) & 033333333333) - ((u >> 2) & 011111111111);
     return ((uCount + (uCount >> 3)) & 030707070707) % 63;
}
} 