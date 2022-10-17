package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b2609 {
	//	최대공약수와 최소공배수
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int d = gcd(a, b);	// 최대공약수

		System.out.println(d);
		System.out.println(a * b / d);
	}
	
	public static int gcd(int a, int b) {
		if (b == 0) return a;
            
		return gcd(b, a % b);
	}
	
}