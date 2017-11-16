import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args){
 
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.parseInt(br.readLine());
            String[] s1;
 
            while(testCases-- != 0){
 
                s1 = br.readLine().split(" ");
                int N = Integer.parseInt(s1[0]); int height = Integer.parseInt(s1[1]);
                int[] open = new int[N];
                int low;    int high;
                for(int i = 0; i < N; i++){
                    s1 = br.readLine().split(" ");
                    low = Integer.parseInt(s1[0]);
                    high = Integer.parseInt(s1[1]);
                    for(int j = low; j <= high; j++){
                        open[j] += 1;
                    }
                }
                int max;    int sum=0;
 
                for(int i=0; i < height; i++)
                    sum += open[i];
                max = sum;
                for(int i = height; i < N; i++){
                    sum = sum - open[i - height] + open[i];
                    if (sum > max) max = sum;
                }
 
 
                int energy = N * height - max;
                System.out.println(energy);
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
} 