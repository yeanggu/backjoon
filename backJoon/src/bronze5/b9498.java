package bronze5;

import java.util.Scanner;

public class b9498 {
//	���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		switch(score/10) {
		case 6 : System.out.println("D");break;
		case 7 : System.out.println("C");break;
		case 8 : System.out.println("B");break;
		case 9: case 10: System.out.println("A");break;
		default : System.out.println("F");break;
		}
		
		scan.close();
	}

}