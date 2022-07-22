package bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b10872 {
	//ÆÑÅä¸®¾ó
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(factorial(num));
	}
	
	public static int factorial(int a) {
		if(a==1) {
			return a;
		}else if(a==0) {
			return 1;
		}
		
		return a * factorial(a-1);
	}

}