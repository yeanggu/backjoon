package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b4344 {
//	OXÄûÁî
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int[] c = new int[b];
			int avg = 0;
			int count = 0;
			double per = 0;
			
			for(int j=0;j<b;j++) {
				c[j] = Integer.parseInt(st.nextToken());
				avg += c[j];
			}
			avg /= b;
			for(int j=0;j<b;j++) {
				if(c[j] > avg) {
					count++;
				}
			}
			per = Math.round((count/(double)b*100)*1000)/1000.0;
			bw.write(String.format("%.3f", per)+"%\n");
		}
		bw.close();
		br.close();
	}
	
}