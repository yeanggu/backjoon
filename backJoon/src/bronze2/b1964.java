package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1964 {
//	오각형, 오각형, 오각형…
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int mod = 45678;
		int result = 5;
		
		for (int i = 1; i < N ; i++) {
			result = (result + (i + 2) * 3 - 2) % mod;
		} 
		
		System.out.println(result);
		
	}
	
}