package bronze5;

import java.util.Scanner;

public class b2744 {
//	영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String Word = scan.nextLine();
		
		String[] wording = Word.split("");
		
		for(int i=0;i<Word.length();i++) {
			if(Character.isUpperCase(wording[i].charAt(0))) {
				wording[i] = wording[i].toLowerCase();
			}else {
				wording[i] = wording[i].toUpperCase();
			}
			System.out.print(wording[i]);
		}

		scan.close();
	}

}