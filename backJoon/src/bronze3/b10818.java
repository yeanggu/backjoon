package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10818 {
//	최소, 최대
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] a = new int[num];
		int min = 0;
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음

		for(int i=0;i<num;i++) {
			a[i] = Integer.parseInt(st.nextToken()); //첫번째 호출
			
			if(i>0) {
				if(a[i] < min) {
					min = a[i];
				}else if(a[i] > max) {
					max = a[i];
				}
			}else {
				min = a[0];
				max = a[0];
			}
		}
		
		br.close();
		
		System.out.println(min + " " + max);
	}
	
}