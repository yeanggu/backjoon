package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b8958 {

	public static void main(String[] args) throws IOException {
	      
	      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	      StringBuilder sb = new StringBuilder();
	      
	      int t = Integer.parseInt(bf.readLine());
	      String str;
	      int score = 0;
	      int total = 0;
	   
	      for(int i = 0; i < t; i++) {
	         str = bf.readLine();
	         for(int j = 0; j < str.length(); j++) {
	            score++;
	            if(str.charAt(j) == 'X') {
	               score = 0;
	            }
	            total += score;            
	         }
	         sb.append(total+"\n");
	         score = 0;
	         total = 0;
	      }
	      System.out.println(sb);
	      bf.close();            
	   }

/*	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String[] b = new String[a];
		String[] c = null;
		int score = 0;
		
		for(int i=0;i<a;i++) {
			b[i] = br.readLine();
		}
		
		for(int i=0;i<a;i++) {
			int cal = 1;
			for(int j=0;j<b[i].length();j++) {
				c = b[i].split("");
				if(j>0) {
					if(c[j].equals("O")) {
						if(c[j-1].equals("O")) {
							++cal;
						}else if(c[j-1].equals("X")) {
							cal = 1;
						}
						score += cal;
					}
				}else {
					if(c[j].equals("O")) {
						score = 1;
					}
				}
			}
			
			System.out.println(score);
		}
		br.close();
	}
*/	
}