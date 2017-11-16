import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int testCases = Integer.parseInt(br.readLine());
        String[] s;
 
        while (testCases-- != 0) {
 
            s = br.readLine().split(" ");
            int chains = Integer.parseInt(s[1]);
            int min;
            int[] nums = new int[chains];
            String[] temp = br.readLine().split(" ");
 
            for (int i = 0; i < chains; i++) {
                nums[i] = Integer.parseInt(temp[i]);
            }
 
            Arrays.sort(nums);
 
            min = nums[0];
            int i = 1;
 
            while (true){
 
                if (chains - 2 == min) {
                    System.out.println(min);
                    break;
                }
 
                if (chains - 2 < min) {
                    System.out.println(chains - 1);
                    break;
                }
 
                min = min + nums[i];
                chains--;
                i++;
 
            }
 
        }
 
    }
 
} 