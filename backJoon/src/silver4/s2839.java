package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2839 {
	//	º≥≈¡ πË¥ﬁ

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(true) {
			if(N%5 ==0) {
				System.out.println(N/5 + count);
				break;
			}else if(N < 0) {
				System.out.println(-1);
				break;
			}
			N = N-3;
			count++;
		}
		
	}

}