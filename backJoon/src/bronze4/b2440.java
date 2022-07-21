package bronze4;

import java.util.Scanner;

public class b2440 {
//	첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
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