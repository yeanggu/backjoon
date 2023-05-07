package bronze4;

import java.util.Scanner;

public class b2440 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		for(int i=0;i<count;i++) {
			for(int j=count;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}