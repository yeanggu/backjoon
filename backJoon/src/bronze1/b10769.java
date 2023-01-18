package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class b10769 {
	// 행복한지 슬픈지
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
		String str = br.readLine();

		int smile = (str.length() - str.replace(":-)", "").length()) / 3;
		int sad = (str.length() - str.replace(":-(", "").length()) / 3;

		String ret = "";
		if (smile == 0 && sad == 0) {
			ret = "none";
		} else if (smile > sad) {
			ret = "happy";
		} else if (sad > smile) {
			ret = "sad";
		} else {
			ret = "unsure";
		}
		
		System.out.println(ret);
	}
}