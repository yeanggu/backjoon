package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s9020 {
	//	골드바흐의 추측
	
	public static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(N%2 != 0) {
				while(N%2 != 0) {
					System.out.println("짝수를 입력해주세요.");
					N = Integer.parseInt(br.readLine());
				}
			}
			
			prime = new boolean[N + 1];
			prime();
			
			int first_partition = N / 2;
			int second_partition = N / 2;
			
			while (true) {
	            
				if (!prime[first_partition] && !prime[second_partition]) {
					sb.append(first_partition).append(' ').append(second_partition).append('\n');
					break;
				}
				first_partition--;
				second_partition++;
			}
			
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