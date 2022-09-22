package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s4948 {
	//	����Ʈ�� ����
	
	public static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int count = 0;
			int N = Integer.parseInt(br.readLine());
			if(N == 0) break;

			prime = new boolean[(N*2) + 1];
			prime();
			
			for(int i=N+1;i<=N*2;i++) {
				if(!prime[i]) count++;
			}
			sb.append(count).append('\n');
			
		}

		System.out.println(sb);
	}
	
	
	public static void prime() { //true�� �Ҽ��� �ƴϴ�
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) { //�Ҽ��� �������� ����� �� �����ϱ�
				prime[j] = true;
			}
		}
	}

}