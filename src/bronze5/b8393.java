package bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b8393 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //�Ҵ�� ���ۿ� �� �־��ֱ�
		
		int a = Integer.parseInt(br.readLine());
		int b = 0;
		for(int i=0;i<a;i++) {
			b += a-i;
		}
		bw.write(b+"\n");
		bw.close();
		br.close();
		
	}
	
}