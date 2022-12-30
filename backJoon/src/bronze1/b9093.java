package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class b9093 {
	//	단어 뒤집기
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<Character>();
		
		while(T != 0) {
			String input = br.readLine()+"\n";
			
			for(char ch : input.toCharArray()) {
				if(ch == ' ' || ch == '\n') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch); // 공백
				} else
					stack.push(ch);
			}
			
			T--;
		}
		
		bw.flush();
	}
	
}