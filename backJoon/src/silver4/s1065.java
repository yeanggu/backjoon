package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1065 {
	//	�Ѽ�

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int count = 0; //���� �� �뵵
		
		if(N < 100) { //������ 100���ϴ� ���� ��������
			sb.append(N);
			
		}else { //100�̻��϶�
			
			for(int i=100;i<=N;i++) { //100���� �־��� ���ڱ���
				
				int num = i;
				int length = (int)(Math.log10(i)+1);
				int[] array = new int[length]; //���� �� �ڸ��� �ֱ����� �迭����
				int[] common = new int[length-1]; //���� �迭����
				int temp = 0; // ������ ��� ������������ Ȯ���� �뵵
				
				
				for(int j=0;j<length;j++) { //�ڸ��� �迭�� �ֱ�
					array[j] = num%10;
					num /= 10;
				}
				
				for(int j=0;j<common.length;j++) { //��������(����-1)��ŭ �ݺ��ؼ� ���� �迭�� �ֱ�
					common[j] = array[j] - array[j+1];
				}
				
				for(int j=1;j<common.length;j++) { //������ ��� ���� ��������
					if(common[0] == common[j]) { //ù��° ������ ���������� ��� ��
						temp++;
					}
				}
				
				if(temp == common.length-1) { //��� �������ڶ�� ����ũ��-1�� ���� ����
					count++; //�̶� �Ѽ� ���� �߰�
				}
				
			}
			
			sb.append(count+99);
			
		}
		
		System.out.println(sb);
	}

}