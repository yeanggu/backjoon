package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(prime(num) == true) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	
	
	public static boolean prime(int num) {
		if((num%2 == 0 && num != 2) || num == 1) { //1����, ¦������
			return false;
		}else if(num == 2){ //2�� �Ҽ�
			return true;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}