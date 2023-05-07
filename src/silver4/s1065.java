package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1065 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		if(N < 100) {
			sb.append(N);
			
		}else {
			
			for(int i=100;i<=N;i++) {
				
				int num = i;
				int length = (int)(Math.log10(i)+1);
				int[] array = new int[length];
				int[] common = new int[length-1];
				int temp = 0;
				
				
				for(int j=0;j<length;j++) {
					array[j] = num%10;
					num /= 10;
				}
				
				for(int j=0;j<common.length;j++) {
					common[j] = array[j] - array[j+1];
				}
				
				for(int j=1;j<common.length;j++) {
					if(common[0] == common[j]) {
						temp++;
					}
				}
				
				if(temp == common.length-1) {
					count++;
				}
				
			}
			
			sb.append(count+99);
			
		}
		
		System.out.println(sb);
	}

}