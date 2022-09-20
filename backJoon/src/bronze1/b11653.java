package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11653 {
	//	소인수분해

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=2;i<=N;i++) {
			
			while(N%i == 0) {
				N /= i;
				sb.append(i).append('\n');
			}
		}
		
		System.out.println(sb);
	}
	
}