package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class b2420 {
	/*
	 * ���ĸ������ ���ͳ����θ� �����ϴ� �̽��׸��� �����̴�. ���ĸ����忡�� 2���� ���굵������ seunghwan.royal.gov.sw��
	 * kyuhyun.royal.gov.sw �� �ִµ�, �̰��� couple.royal.gov.sw���� ������ ���̴�. �׷��� ������ ���� ����
	 * SWNIC(������: �赿��)���� ������ ���� �ִ�. �� ���굵������ ��ĥ ��, ������ ���̰� �ʹ� ���̳��� ���� ��쿡�� �� ���굵������
	 * ��ȥ��Ű�� ���̴�. ���굵������ ������ �����̴�. �� ���굵������ ������ �־����� ��, �� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        
        if((A.compareTo(B)>0))
			System.out.println(A.subtract(B));
		else
			System.out.println(B.subtract(A));
        
        //BigInteger�� value�� ���ڿ��̶� ������, �޼����������� ����� ����
        
        scan.close();
	}

}