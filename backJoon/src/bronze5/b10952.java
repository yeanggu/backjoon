package bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b10952 {
//	A+B - 5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0) {
				break;
			}
			bw.write((a+b)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
	
}