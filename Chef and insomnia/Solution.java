import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
 
public class Main{
 
    public static void main(String[] args) throws IOException{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int K = Integer.parseInt(s1[1]);
        int[] array = new int[N];
 
        String[] s2 = br.readLine().split(" ");
        int a;   int b;     int count = 0;
 
        for(int i = 0; i < N; i++) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            boolean key = false;
            a = Integer.parseInt(s2[i]);
            for (int j = i + 1; j < N; j++) {
                b = Integer.parseInt(s2[j]);
                array[j] = b;
                if (b == 0) continue;
                if (a % b == K) {
                    count = count + N - j;
                    break;
                } else {
                    if (hash.containsKey(b)) {
                        int c = hash.get(b);
                        for (int k = j - 1; k >= c; k--) {
                            if (array[k] % b == K) {
                                count = count + N - j;
                                key = true;
                                break;
                            }
                        }
                    } else {
                        hash.put(b, j);
                        for (int k = j - 1; k > i; k--) {
                            if (array[k] % b == K) {
                                count = count + N - j;
                                key = true;
                                break;
                            }
                        }
                    }
                    if (key) break;
                }
            }
        }
        System.out.println(N*(N+1)/2 - count);
    }
}