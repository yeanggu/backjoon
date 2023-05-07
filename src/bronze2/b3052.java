package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b3052 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[10];
		boolean bl;
		int count = 0;
		
		for(int i=0;i<10;i++) {
			a[i] = Integer.parseInt(br.readLine())%42;
		}
		
		for(int i=0;i<10;i++) {
			bl = false;
			for(int j=i+1;j<10;j++) {
				if(a[i]==a[j]) {
					bl = true;
					break;
				}
			}
			if(bl == false) {
				count++;
			}
		}
		System.out.println(count);
		br.close();
		
	}
	
}