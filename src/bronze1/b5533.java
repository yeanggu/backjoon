package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b5533 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
		
        int N = Integer.parseInt(br.readLine()); 
        int[][] arr = new int[N][3]; 
        
        for(int i = 0;i < N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int j = 0;j < 3;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i = 0;i < N;i++) {
            for(int j = 0;j < 3;j++) {
                int sw = 0;  
                
                for(int k = 0;k < N;k++) {
                    if(i != k && arr[i][j] == arr[k][j]) {
                        arr[k][j] = 0;
                        sw = 1;
                    }
                }
                
                if(sw == 1) arr[i][j] = 0;
                
            }
            
            bw.write((arr[i][0] + arr[i][1] + arr[i][2]) + "\n");            
        }
 
        bw.flush();
        
	}
	
}