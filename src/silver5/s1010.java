package silver5;

import java.util.Scanner;

public class s1010 {
	
	static int[][] dp = new int[30][30];
			
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<test;i++) {
			int N = scan.nextInt();	// N = r
			int M = scan.nextInt();	// M = n
						
			sb.append(combi(M, N)).append('\n');
		}
		
		System.out.println(sb);
		
		scan.close();
	}
	
	static int combi(int n, int r) {
		
		// �̹� Ǯ�� ��� �ٷ� ��ȯ
		if(dp[n][r] > 0) {
			return dp[n][r]; 
		}
		
		// 2�� ����
		if(n == r || r == 0) {
			return dp[n][r] = 1;
		}
		
		// 1�� ����
		return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	}

}