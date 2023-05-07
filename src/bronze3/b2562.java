package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2562 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[9];
		int count = 0;
		int max = 0;
		
		for(int i=0;i<9;i++) {
			a[i] = Integer.parseInt(br.readLine());
			
			if(a[i] > max) {
				max = a[i];
				count = i+1;
			}
		}
		
		br.close();
		
		System.out.println(max);
		System.out.println(count);
	}
	
}