package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2851 {
	//	���۸�����

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = 0;
		int result = 0;
		
		for(int i=0;i<10;i++) {
			int a = Integer.parseInt(br.readLine());
			if(s<100) {
				s += a;
				if(Math.abs(result-100)>Math.abs(s-100)) {
					result = s;
				} else if(Math.abs(result-100) == Math.abs(s-100)) {
					result = result > s ? result : s;
				}
			}
		}

		System.out.println(result);
	}

}