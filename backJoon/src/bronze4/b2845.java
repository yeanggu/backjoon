package bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b2845 {
	// ��Ƽ�� ������
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());   //�����/1m^2
        int P = L * Integer.parseInt(st.nextToken());   //��Ƽ�� ���ȴ� �� ���� X �����/1m^2
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        for(int i = 0; i<5; i++) {
        int a = Integer.parseInt(st2.nextToken());
            System.out.print(a - P + " ");
        }

        bw.close();   
	}

}