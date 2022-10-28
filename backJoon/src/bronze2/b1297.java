package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1297 {
//	TV Å©±â
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		int d = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		double height = Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2)) * Math.pow(h, 2);
		double width = Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2)) * Math.pow(w, 2);
		
		sb.append((int)Math.sqrt(height)+" "+(int)Math.sqrt(width));
		System.out.println(sb);
		
	}
	
}