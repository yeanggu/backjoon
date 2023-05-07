package bronze5;

import java.util.Scanner;

public class b2741 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i=N-1;i>-1;i--) {
			System.out.println(N-i);
		}
		
		scan.close();
	}

}