package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1929 {
	//	소수 구하기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=M;i<=N;i++) {
			int num = i;
			
			if(prime(num) == true) {
				sb.append(num).append('\n');
			}
			
		}

		System.out.println(sb);
	}
	
	
	
	public static boolean prime(int num) {
		if((num%2 == 0 && num != 2) || num == 1) { //1제외, 짝수제외
			return false;
		}else if(num == 2){ //2는 소수
			return true;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}