package bronze4;

import java.util.Scanner;

public class b2439 {
	/*
	 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ���� ������, �������� �������� ������ ��(���� ����)��
	 * ����Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		for(int i=0;i<count;i++) {
			for(int j=count-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}