package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11050 {

	static int[][] dp;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		dp = new int[N + 1][K + 1];
		 
		System.out.println(BC(N, K));
	}
	
	static int BC(int n, int k) {
		 
		// �̹� Ǯ���� sub������ ��� ���� ��Ȱ��
		if (dp[n][k] > 0) {
			return dp[n][k];
		}
 
		// 2�� ����
		if (k == 0 || n == k) {
			return dp[n][k] = 1;
		}
 
		// 1�� ����
		return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
	}
}