package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class b2338 {
	/*
	 * �� �� A, B�� �Է¹޾�, A+B, A-B, A��B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ù° �ٿ� A��, ��° �ٿ� B�� �־�����. ������ ���� 10������ 1,000�ڸ��� ���� ������ ����� ������ ��� �־��� �� �ִ�.
	 * 
	 * ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A��B�� ����Ѵ�. ������ ����� ��, ���� 0�� ��츦 �����ϰ�� 0���� �����ϰ� �ؼ��� �� �ȴ�(1�� 01�� ����ϸ� �� �ȴٴ� �ǹ�).
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        
        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
        
        scan.close();
	}

}