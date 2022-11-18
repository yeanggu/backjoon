package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2563 {
	//	������

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0;  //���� ������ ����
		int n = Integer.parseInt(br.readLine());  //������ ����
		boolean[][] arr = new boolean[101][101];  //��ȭ��
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			//(x,y)���� (x+9, y+9)������ ������ �ϳ��� üũ�� �� �� ���̿� �����ش�
			for (int j = x; j < x+10; j++) {
				for (int k = y; k < y+10; k++) {
					if (!arr[j][k]) {
						arr[j][k] = true;
						total++;
					}
				}
			}
		}
		
		System.out.print(total);
	}

}