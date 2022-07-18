package bronze5;

import java.util.Scanner;

public class b2738 {
	
	/*
	 * N*Mũ���� �� ��� A�� B�� �־����� ��, �� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ù° �ٿ� ����� ũ�� N �� M�� �־�����. ��°
	 * �ٺ��� N���� �ٿ� ��� A�� ���� M���� ���ʴ�� �־�����. �̾ N���� �ٿ� ��� B�� ���� M���� ���ʴ�� �־�����. N�� M��
	 * 100���� �۰ų� ����, ����� ���Ҵ� ������ 100���� �۰ų� ���� �����̴�.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] arr = new int[N][M];
		
		for(int x=0;x<=1;x++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					arr[i][j] += scan.nextInt();
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}