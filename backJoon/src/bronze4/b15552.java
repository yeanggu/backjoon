package bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b15552 {
//	A+B - 3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //�Ҵ�� ���ۿ� �� �־��ֱ�
		
		int a = Integer.parseInt(br.readLine()); //ù��° ȣ��
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer���ڰ��� �Է� ���ڿ� ����
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.close();   //��Ʈ���� ����
		br.close();
		
	}
	
}