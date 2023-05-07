package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class b2010 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 1;
		
		for(int i = 0; i < N; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		sum -= N;
		System.out.println(sum);
	}
	
}