package bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2480 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		br.close();
		
		int answer;
		if(a==b && b==c) {
			answer = 10000 + a*1000;
		}else if(a==b || b==c || a==c){
			if(a==b|| a==c) {
				answer = 1000 + a*100;
			}else {
				answer = 1000 + b*100;
			}
		}else {
			if(a>b && a>c) {
				answer = a*100;
			}else if(b>c && b>a) {
				answer = b*100;
			}else{
				answer = c*100;
			}
		}
		
		System.out.println(answer);
	}
	
}