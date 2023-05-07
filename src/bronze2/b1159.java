package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1159 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());  //������ ��
        boolean possible = false;  //�ټ� ���� ������ �� �ִ���
        
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            char c = name.charAt(0);  //ù ����
            arr[c - 97]++;  //�ƽ�Ű �ڵ� �̿�
            if (arr[c - 97] == 5) possible = true;  //5���� �Ǹ� 5���� ������ �� �ִ�
        }
        
        if (possible) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) System.out.print((char)(i+97));
            }
        } else {
            System.out.print("PREDAJA");
        }
	}
	
}