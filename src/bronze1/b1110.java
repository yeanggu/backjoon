package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1110 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int count = 0;
		
		while(true) {
			int left = temp / 10;
			int right = temp % 10;
			temp = right * 10 + (left + right) % 10;
			count++;
			if(num == temp) {
				break;
			}
		}
		System.out.println(count);
		
	}
	
}