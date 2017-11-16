import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        //long start = System.currentTimeMillis();
        int rows1;  int rows2;  int ans;
        int cols1;  int cols2;
        String[] colRows;
        String[] array = new String[500 * 500 + 1];
        
        while (testCases-- != 0){
            
            ans = 0;
            int size = Integer.parseInt(br.readLine());
            
            for (int i = 1; i < size + 1; i++) {
                
                String[] col = br.readLine().split(" ");
                
                for (int j = 1; j < size + 1; j++) {
                   
                    int val = Integer.parseInt(col[j - 1]);
                    array[val] = i + " " + j;
                }
            }
            
            for (int i = 2; i < size * size + 1; i++) {
                
                colRows = array[i].split(" ");
                rows1 = Integer.parseInt(colRows[0]);
                cols1 = Integer.parseInt(colRows[1]);
                colRows = array[i - 1].split(" ");
                rows2 = Integer.parseInt(colRows[0]);
                cols2 = Integer.parseInt(colRows[1]);
                ans += Math.abs(rows1 - rows2) + Math.abs(cols1 - cols2);
                
            }
            
            System.out.println(ans);
            
        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
        
    }
} 