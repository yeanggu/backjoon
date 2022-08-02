package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2577 {
//	숫자의 개수
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int[] box = new int[10];
		
		int cal = a * b * c;
		
		String calbefore = String.valueOf(cal);
		String calafter[] = calbefore.split("");
		
		for(int i=0;i<calafter.length;i++) {
			//System.out.println(cal%10);
			++box[cal%10];
			cal/=10;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(box[i]);
		}
		
		br.close();
		
	}
	
}