package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2884 {
//	알람 시계 45분 일찍 알람 설정하기
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
		int a = Integer.parseInt(st.nextToken()); //첫번째 호출
		int b = Integer.parseInt(st.nextToken()); //두번째 호출
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