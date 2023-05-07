package silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class s2869 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		//int num = 0;
		//int day = 0;
		
		/*
		 * while(true) { num += A; if(V <= num) { day++; break; } num -= B; day++; }
		 */
		
		int day = (V-B) / (A-B);
		if ((V-B) % (A-B) != 0)
			day++;
		
		System.out.println(day);
	}
	
}