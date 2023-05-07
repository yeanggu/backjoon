package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class b14659 {

	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		int result = Integer.MIN_VALUE;
		
		for(int i=0; i<N ; i++) {
			count = 0;
			for(int j=i+1; j<N ; j++) {
				if(arr[i]>arr[j]) {
					count++;
				} else {
					break;
				}
			}
			result = Math.max(result, count);
		}
		
		System.out.println(result);
	}
}