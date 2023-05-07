package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2747 {

	static int[] D;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		D = new int[N + 1];
		for(int i = 0; i<=N; i++) {
			D[i] = -1;
		}
		D[0] = 0;
		D[1] = 1;
		fibo(N);
		
		/*
		 * ����-�� ���
		 * for (int i = 2; i <= N; i ++) { D[i] = D[i-1] + D[i-2]; }
		 */
		
		System.out.println(D[N]);
	}
	
	//ž-�ٿ� ���
	private static int fibo(int N) {
		// ������ ����� ���� �ִ� �κ��� ������ �������� �ʰ� ����
		if(D[N] != -1) return D[N];
		
		// �޸������̼� : ���� ���� �ٷ� �������� �ʰ� DP ���̺� ������ �� �����ϵ��� ��������
		return D[N] = fibo(N-2) + fibo(N-1);
	}
	
}