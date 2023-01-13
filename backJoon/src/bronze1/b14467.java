package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class b14467 {
	// 소가 길을 건너간 이유 1
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[11];
		
		Arrays.fill(arr, -1);
        int answer = 0;
        
        while (N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (arr[a] != -1 && arr[a] != b) answer++;
            arr[a] = b;
        }
        
        System.out.println(answer);
	}
}