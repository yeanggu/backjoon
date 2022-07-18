package bronze5;

import java.util.Scanner;

public class b2738 {
	
	/*
	 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오. 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째
	 * 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은
	 * 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
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