package bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b14681 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		br.close();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println(1);
		}else if(num1 < 0 && num2 > 0) {
			System.out.println(2);
		}else if(num1 < 0 && num2 < 0) {
			System.out.println(3);
		}else if(num1 > 0 && num2 < 0) {
			System.out.println(4);
		}
	}

}