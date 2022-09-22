package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1929 {
	//	소수 구하기 (에라토스테네스의 체)
	
	public static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		prime = new boolean[N + 1];
		prime();
		
		for(int i=M;i<=N;i++) {
			if(!prime[i]) sb.append(i).append('\n');
		}

		System.out.println(sb);
	}
	
	
	public static void prime() { //true는 소수가 아니다
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) { //소수의 제곱부터 배수는 다 제외하기
				prime[j] = true;
			}
		}
	}

}