package bronze5;

import java.util.Scanner;

public class b2475 {
	/*
	 * ��ǻ�͸� �����ϴ� ȸ���� KOI ���ڿ����� �����ϴ� ��ǻ�͸��� 6�ڸ��� ������ȣ�� �ű��. ������ȣ�� ó�� 5�ڸ����� 00000����
	 * 99999������ �� �� �ϳ��� �־����� 6��° �ڸ����� �������� ����. �������� ������ȣ�� ó�� 5�ڸ��� ���� 5���� ���ڸ� ����
	 * ������ ���� ���� 10���� ���� �������̴�.
	 * 
	 * ���� ��� ������ȣ�� ó�� 5�ڸ��� ���ڵ��� 04256�̸�, �� ���ڸ� ������ ������ �� 0+16+4+25+36 = 81 �� 10���� ����
	 * �������� 1�� �������̴�.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		for(int i=0;i<5;i++) {
			int temp = scan.nextInt();
			result += temp * temp;
		}
		
		System.out.println(result%10);
        
        scan.close();
	}

}