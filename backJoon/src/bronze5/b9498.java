package bronze5;

import java.util.Scanner;

public class b9498 {
//	시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	
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