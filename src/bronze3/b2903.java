package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2903 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int fir = 2;
		int result = 0;

		for(int i = 0; i < N; i++) {
			fir += (int) (Math.pow(2, i));
		}

		System.out.println((int)(Math.pow(fir, 2)));
	}
	
}