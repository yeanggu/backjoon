package bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b5597 {
	//	과제 안 내신 분..?
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] student = new int[31];
		
		for(int i=1; i<29; i++) {
			int success = Integer.parseInt(br.readLine());
			student[success] = 1;
		}
		
		for(int i=1; i<student.length; i++) {
			if(student[i]!=1)
				System.out.println(i);
		}
	}
	
}