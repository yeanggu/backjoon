package bronze1;

import java.util.Scanner;

public class b1834 {
	//	나머지와 몫이 같은 수
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		long sum = 0;

		for (int i = 0; i < num; i++) {
			sum += (num + 1) * i;
		}
		
		System.out.println(sum);
		
	}
	
}