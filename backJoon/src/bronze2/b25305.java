package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class b25305 {
	// 커트라인
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Integer[] arr = new Integer[N];
        
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
		Arrays.sort(arr, Collections.reverseOrder());
        
		System.out.println(arr[k-1]);
	}
}