package bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2480 {
//	�ֻ��� ����
/*	1. ���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
	2. ���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
	3. ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
*/
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer���ڰ��� �Է� ���ڿ� ����
		int a = Integer.parseInt(st.nextToken()); //ù��° ȣ��
		int b = Integer.parseInt(st.nextToken()); //�ι�° ȣ��
		int c = Integer.parseInt(st.nextToken()); //����° ȣ��
		br.close();
		
		int answer;
		if(a==b && b==c) {
			answer = 10000 + a*1000;
		}else if(a==b || b==c || a==c){
			if(a==b|| a==c) {
				answer = 1000 + a*100;
			}else {
				answer = 1000 + b*100;
			}
		}else {
			if(a>b && a>c) {
				answer = a*100;
			}else if(b>c && b>a) {
				answer = b*100;
			}else{
				answer = c*100;
			}
		}
		
		System.out.println(answer);
	}
	
}