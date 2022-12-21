package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2846 {
	//	오르막길

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0;i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}

		int sum = 0;
		int result = 0;
		
		for(int i = 0;i < N-1;i++) {
			if(arr[i]<arr[i+1]) {
				sum += (arr[i+1]-arr[i]);
			}else {
				sum = 0;
			}
			
			result = Math.max(result, sum);
		}

		System.out.println(result);
	}

}