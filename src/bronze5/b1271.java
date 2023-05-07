package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class b1271 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        
        System.out.println(A.divide(B));
        System.out.println(A.remainder(B));
        
        scan.close();
	}

}