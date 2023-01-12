package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11170 {
	//	0ÀÇ °³¼ö
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
 
            int count = 0;
 
            for (int j = N; j <= M; j++) {
                int t = j;
                if (t == 0) {
                    count++;
                    continue;
                }
 
                while (t > 1) {
                    if (t % 10 == 0) {
                        count++;
                    }
                    t /= 10;
                }
            }
 
            System.out.println(count);
        }
		
	}
	
}