package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] b = new int[a];
		double[] c = new double[a];
		int max = 0;
		double avg = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<a;i++) {
			b[i] = Integer.parseInt(st.nextToken());
			if(b[i]>max) {
				max = b[i];
			}
		}
		
		for(int i=0;i<a;i++) {
			c[i] = (double)b[i]/(double)max*100;
			avg += c[i];
		}
		
		avg = avg/a;
		
		System.out.println(avg);
		br.close();
		
	}
	
}