package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2355 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        
        if(b > a) {
            long temp = b;
            b = a;
            a = temp;
        }
        
        long result = (a+b) * (a-b + 1) / 2;
        System.out.println(result);
		
	}
	
}