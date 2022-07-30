package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1110 {
//	더하기 사이클
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int count = 0;
		
		while(num<99){
			int sum = 0;
			int sum2 = 0;
			
			sum += num%10;
			num /= 10;
			
			if(sum2 == 0) {
				sum2 = sum + num;
				num = (sum*10) + (sum2%10);
				count++;
			}
			
			if(temp == num) {
				break;
			}
		}
		System.out.println(count);
		
	}
	
}