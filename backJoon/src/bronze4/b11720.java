package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11720 {
	// 숫자의 합
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += br.read() - 48;
		}
		
		System.out.print(sum);
	}

}