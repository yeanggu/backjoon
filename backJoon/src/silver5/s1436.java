package silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class s1436 {
	// ��ȭ���� ��
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		int count = 1;
        
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
			
		}
		System.out.println(num);
		
	}
}