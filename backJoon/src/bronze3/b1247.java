package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class b1247 {
//	��ȣ
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<3;i++) {
			BigInteger S = new BigInteger("0");
			int N = Integer.parseInt(br.readLine());
			
			for(int j=0;j<N;j++) {
				BigInteger N2 = new BigInteger(br.readLine());
				S = S.add(N2);
			}
			
			if(S.compareTo(BigInteger.ZERO) == -1) {
				System.out.println("-");
			}else if(S.compareTo(BigInteger.ZERO) == 1) {
				System.out.println("+");
			}else {
				System.out.println(0);
			}
		}
	}
	
}