package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class b10798 {
	// 세로읽기
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		char[][] ch = new char[5][15];
        int max = 0;
        
        for (int i = 0; i < ch.length; i++) {
            String str = br.readLine();
            if(max < str.length()) max = str.length();
            
            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }
        
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(ch[j][i] == '\0') continue;
                sb.append(ch[j][i]);
            }
        }
 
		System.out.println(sb);
	}
}