package bronze5;

import java.util.Scanner;

public class b2744 {
//	���� �ҹ��ڿ� �빮�ڷ� �̷���� �ܾ �Է¹��� ��, �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
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