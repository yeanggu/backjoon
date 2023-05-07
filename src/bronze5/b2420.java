package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class b2420 {

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