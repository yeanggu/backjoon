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
		
		/*
		 * 바텀-업 방식
		 * for (int i = 2; i <= N; i ++) { D[i] = D[i-1] + D[i-2]; }
		 */
		
		System.out.println(D[N]);
	}
	
	//탑-다운 방식
	private static int fibo(int N) {
		// 기존에 계산한 적이 있는 부분의 문제는 재계산하지 않고 리턴
		if(D[N] != -1) return D[N];
		
		// 메모이제이션 : 구한 값을 바로 리턴하지 않고 DP 테이블에 저장한 후 리턴하도록 로직구현
		return D[N] = fibo(N-2) + fibo(N-1);
	}
	
}