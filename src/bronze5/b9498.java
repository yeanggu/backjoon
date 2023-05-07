package bronze5;

import java.util.Scanner;

public class b9498 {

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