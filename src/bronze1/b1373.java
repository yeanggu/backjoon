package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1373 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String N = br.readLine();

		// ���ڸ��� ������ �� �� �ڸ��� ������ ���
		if(N.length() % 3 == 1)
			sb.append(N.charAt(0));

		// ���ڸ��� ������ �� �� �ڸ��� ������ ���
		if(N.length() % 3 == 2)
			sb.append((N.charAt(0) - '0') * 2 + (N.charAt(1) - '0'));

		// ������ ���
		for(int i = N.length() % 3; i < N.length(); i+=3) {
			sb.append((N.charAt(i) - '0') * 4 + (N.charAt(i+1) - '0') * 2
					+ (N.charAt(i+2) - '0'));
		}
		System.out.println(sb);
	}
}