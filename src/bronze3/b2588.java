package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2588 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a*(b%10));
		System.out.println(a*((b/10)%10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
	
}