package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b6996 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		   
		int N=Integer.parseInt(br.readLine());
		
		for(int i=0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
 
            System.out.print(A + " & " + B + " are ");
            if(!sortStr(A).equals(sortStr(B))) {
                System.out.print("NOT ");
            }
            System.out.println("anagrams.");
        }
		
	}
	
	public static String sortStr(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).toString();
    }
	
}