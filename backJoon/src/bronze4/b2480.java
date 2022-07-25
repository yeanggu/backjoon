package bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2480 {
//	주사위 세개
/*	1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
	2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
	3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
*/
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
		int a = Integer.parseInt(st.nextToken()); //첫번째 호출
		int b = Integer.parseInt(st.nextToken()); //두번째 호출
		int c = Integer.parseInt(st.nextToken()); //세번째 호출
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