package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1157 {
//	단어 공부
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { //소문자 범위
				arr[s.charAt(i) - 97]++; //소문자 숫자 뺌 인덱스 1증가
			} else {
				arr[s.charAt(i) - 65]++; //대문자 숫자 뺌 인덱스 1증가
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