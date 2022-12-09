package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2747 {
//	피보나치 수

	static int[] D;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		D = new int[N + 1];
		for(int i = 0; i<=N; i++) {
			D[i] = -1;
		}
		D[0] = 0;
		D[1] = 1;
		fibo(N);
		
		System.out.println(D[N]);
	}
	
	private static int fibo(int N) {
		if(D[N] != -1) return D[N];
		return D[N] = fibo(N-2) + fibo(N-1);
	}
	
}