package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1157 {
//	�ܾ� ����
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26]; // �������� ������ 26����
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { //�ҹ��� ����
				arr[s.charAt(i) - 97]++; //�ҹ��� ���� �� �ε��� 1����
			} else {
				arr[s.charAt(i) - 65]++; //�빮�� ���� �� �ε��� 1����
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} 
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
		
	}
	
}