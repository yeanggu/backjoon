package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2441 {
//	º°Âï±â
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) { 
            for(int j=num-i; j<num; j++) {
                System.out.print(" ");     
            }         
            
            for(int k=i; k<num; k++) {
                System.out.print("*");
            }            
            System.out.println();            
        }
	}
	
}