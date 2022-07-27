package bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b11022 {
//	A+B - 7
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		
		int a = Integer.parseInt(br.readLine()); //첫번째 호출
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+
					b+" + "+c+" = "+
			(b+c)+"\n");
		}
		bw.close();   //스트림을 닫음
		br.close();
		
	}
	
}