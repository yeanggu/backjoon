package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2231 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		// �ڸ����� ���̸� �˱����� �ϴ� ���ڿ��� �Է¹޴´�.
		String str_N = br.readLine();
 
		// �ش� ���ڿ��� ���� ����
		int N_len = str_N.length();
 
		// ���ڿ��� ����(int)�� ��ȯ 
		int N = Integer.parseInt(str_N);
		int result = 0;
 
		
		// i �� ������ �ּڰ��� N - 9 * N�� �� �ڸ������� ���� 
		for(int i = (N - (N_len * 9)); i < N; i++) {
			int number = i;
			int sum = 0;	// �� �ڸ��� �� ���� 
			
			while(number != 0) {
				sum += number % 10;	// �� �ڸ��� ���ϱ�
				number /= 10;
			}
			
			// i ���� �� �ڸ��� �������� ���� ��� (�����ڸ� ã���� ���) 
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
		
	}
	
}