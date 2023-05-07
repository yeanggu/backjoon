package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2884 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		br.close();
		
		int answer = b-45;
		if(answer<0) {
			if(a==0) {
				a=24;
			}
			a=a-1;
			b=60+answer;
		}else {
			b=answer;
		}
		
		System.out.println(a+" "+b);
	}
	
}