package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int i=M;i<=N;i++) {
			int num = i;
			
			if(prime(num) == true) {
				sum += num;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
			
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	
	
	public static boolean prime(int num) {
		if((num%2 == 0 && num != 2) || num == 1) {
			return false;
		}else if(num == 2){
			return true;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}