package bronze5;

import java.util.Scanner;

public class b2475 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		for(int i=0;i<5;i++) {
			int temp = scan.nextInt();
			result += temp * temp;
		}
		
		System.out.println(result%10);
        
        scan.close();
	}

}