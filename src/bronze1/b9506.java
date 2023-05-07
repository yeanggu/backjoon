package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b9506 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N == -1) break;
			int[] arr = new int[N]; 
			int sum = 0;			
			int index = 0;		
			
			for(int i=1; i<N; i++) {
				if(N%i == 0) {		
					arr[index++] = i;	
					sum += i;			
				}
			}
			
			if(sum != N) {
				System.out.println(N + " is NOT perfect.");
				continue;
			}
			
			System.out.print(N + " = ");
			
			for(int i=0; i<index; i++) {
				if(i == index-1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i] + " + ");
				}
			}
			
			System.out.println();
		}
	}
	
}