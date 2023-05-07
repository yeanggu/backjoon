package bronze5;

import java.util.Scanner;

public class b2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        
        for(int i=1;i<=A;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        scan.close();
	}

}