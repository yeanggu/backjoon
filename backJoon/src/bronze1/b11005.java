package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b11005 {
	//	진법 변환 2
	
	static int[][] dp;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		List<Character> list = new ArrayList<>();
        while (N > 0) {
            if (N % b < 10) {
                list.add((char) (N % b + '0'));
            }
            else{
                list.add((char) (N % b - 10 + 'A'));
            }

            N /= b;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
	}
}