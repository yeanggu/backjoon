package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2033 {
	//	반올림
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] chArr = str.toCharArray();
		int len = chArr.length;
		
		int nextAdd = 0;
		StringBuilder sb = new StringBuilder();
		// 역순 탐색
		for(int i = len - 1; i >= 1; i--) {
			int num = (int) chArr[i] - '0';
			int nowNum = num + nextAdd;
			nextAdd = nowNum >= 5 ? 1 : 0;
			sb.append(0);
		}
		
		// 맨 앞자리부터 반올림
		sb.insert(0, (int)(chArr[0] - '0') + nextAdd);
		System.out.println(sb.toString());
	}
}