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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //�Ҵ�� ���ۿ� �� �־��ֱ�
		
		int a = Integer.parseInt(br.readLine()); //ù��° ȣ��
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer���ڰ��� �Է� ���ڿ� ����
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+
					b+" + "+c+" = "+
			(b+c)+"\n");
		}
		bw.close();   //��Ʈ���� ����
		br.close();
		
	}
	
}