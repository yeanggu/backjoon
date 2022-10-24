package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1547 {
	//	��
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = 1;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X =Integer.parseInt(st.nextToken());
			int Y =Integer.parseInt(st.nextToken());

			if(X == num) {
				num = Y;
			}else if(Y == num){
				num = X;
			}
		}
		
		System.out.println(num);
            
	}
	
}