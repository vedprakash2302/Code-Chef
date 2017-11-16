import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int Q = Integer.parseInt(s1[1]);
        ArrayList<Integer> array = new ArrayList<>(2*N);
        array.add(0);
        String[] s2 = br.readLine().split(" ");
        for(int i =0; i<N; i++) {
            array.add(Integer.parseInt(s2[i]));
        }
        int query;  int num1;   int num2;
        while (Q-- != 0) {
            String[] s3 = br.readLine().split(" ");
            query = Integer.parseInt(s3[0]);
            num1 = Integer.parseInt(s3[1]);
            if(query != 3)  num2 = Integer.parseInt(s3[2]);
            else num2 = 0;
 
            switch (query){
                case 1: {
                    HashSet<Integer> hashSet = new HashSet<>(N);
                    for(int i = num1; i <= num2; i++) {
                        hashSet.add(array.get(i));
                    }
                    int size = hashSet.size();
                    ArrayList<Integer> temp = new ArrayList<>(hashSet);
                    long ans=0; long x; long y; long z;
                    for(int i =0; i < size-2; i++){
                        for(int j =i+1; j < size-1;j++){
                            for(int k =j+1 ; k < size; k++){
                               x = temp.get(i);    y = temp.get(j);   z = temp.get(k);
                                ans += (((x*y)%1000000007)*z)%1000000007;
                            }
                        }
                    }
                    System.out.println(ans);
                    break;
                }
 
                case 2: {
                    array.set(num1, num2);
                    break;
                }
 
                case 3: {
                    array.remove(num1);
                    break;
                }
                case 4: {
                    array.add(num1 + 1, num2);
                    break;
                }
 
                case 5: {
                    int count=1;
                    for(int i = num1; i < num2; i++){
                        if(array.get(i)!=array.get(i+1))    count++;
                    }
                    System.out.println(count);
                }
            }
        }
    }
} 