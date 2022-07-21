package silver5;

import java.util.Scanner;

public class s1010 {
	/*
	 * ����̴� �� ������ ������ �Ǿ���. �� ���ÿ��� ���ø� ���ʰ� �������� ������ ū ������ ����� ���� �帣�� �ִ�. ������ ����̴� �ٸ���
	 * ��� �ùε��� ���� �ǳʴµ� ū ������ �ް� ������ �˰� �ٸ��� ����� ����Ͽ���. �� �ֺ����� �ٸ��� ���⿡ ������ ���� ����Ʈ���
	 * �Ѵ�. ����̴� �� �ֺ��� ����� ������ �� ��� ���� ���ʿ��� N���� ����Ʈ�� �ְ� ���ʿ��� M���� ����Ʈ�� �ִٴ� ���� �˾Ҵ�. (N
	 * �� M)
	 * 
	 * ����̴� ������ ����Ʈ�� ������ ����Ʈ�� �ٸ��� �����Ϸ��� �Ѵ�. (�̶� �� ����Ʈ���� �ִ� �� ���� �ٸ��� ����� �� �ִ�.) ����̴�
	 * �ٸ��� �ִ��� ���� �������� �ϱ� ������ ������ ����Ʈ ������ŭ (N��) �ٸ��� �������� �Ѵ�. �ٸ������� ���� ������ �� ���ٰ� �� ��
	 * �ٸ��� ���� �� �ִ� ����� ���� ���ϴ� ���α׷��� �ۼ��϶�.
	 */
	//aCb = a-1Cb-1+a-1+Cb
	
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