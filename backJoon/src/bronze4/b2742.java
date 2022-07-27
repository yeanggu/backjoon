package bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b2742 {
//	기찍 N
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		
		int a = Integer.parseInt(br.readLine()); //첫번째 호출
		for(int i=0;i<a;i++) {
			bw.write(a-i+"\n");
		}
		bw.close();   //스트림을 닫음
		br.close();
		
	}
	
}