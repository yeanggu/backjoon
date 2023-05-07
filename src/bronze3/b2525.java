package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2525 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		br.close();
		
		int answer = b+c;
		if(answer>=60) {
			a=a+(answer/60);
			if(a>=24) {
				a=a-24;
			}
			b=answer-60*(answer/60);
		}else {
			b=answer;
		}
		
		System.out.println(a+" "+b);
	}
	
}