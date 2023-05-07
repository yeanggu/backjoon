package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for(int i=0;i<T;i++) {
			int k = Integer.parseInt(br.readLine()); //�� ��
			int n = Integer.parseInt(br.readLine()); //ȣ ��
			
			sb.append(Integer.toString(print(k+1,n))).append('\n'); //�迭 ũ�⸦ ���߷��� k+1. why? k�� 0������ �����ϴϱ�
		}

		System.out.println(sb);
	}

	static int print(int k,int n) {
		int [][] array = new int[k][n];
		
		for(int i=0;i<k;i++) {
			array[i][0] = 1; //��� 1ȣ���� 1����
			if(i == 0) { //0���϶�
				for(int j=0;j<n;j++) {
					array[i][j] = j+1; //1 2 3 4 5 ... ����
				}
			}else {
				for(int j=1;j<n;j++) { //2ȣ������(�迭�� 1����) ���� 
					array[i][j] = array[i][j-1] + array[i-1][j]; //����ȣ�� + �Ʒ���ȣ��
				}
			}
		}
		
		return array[k-1][n-1]; //�����Ҷ��� �迭ũ�Ⱑ �ƴ϶� �迭 ������ ���缭

	}

}