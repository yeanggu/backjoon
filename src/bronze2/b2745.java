package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2745 {

	static String N;
	static int B;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = st.nextToken();
		B = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			if ('A' <= c && c <= 'Z') {
				ans = ans * B + ((c - 'A') + 10);
			} else {
				ans = ans * B + (c - '0');
			}
		}
		System.out.println(ans);
	}
	
}