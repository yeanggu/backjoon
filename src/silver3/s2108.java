package silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class s2108 {

	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double avg = 0;
		int median = 0;
		int range = 0;
		
		Integer[] arr = new Integer[N];
        
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
			avg += arr[i];
		}
        
		Arrays.sort(arr);
		
		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int jump = 0;
			int count = 1;
			int i_value = arr[i];
			
			for(int j = i + 1; j < N; j++){
				if(i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			
			i += jump;
		}
		
		avg /= N;
		median = arr[N/2];
		
		range = arr[N-1]-arr[0];
		
		System.out.println(Math.round(avg));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(range);
	}
}