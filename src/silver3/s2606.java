package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class s2606 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int cnt = 0;
	
		ArrayList<Integer>[] list = new ArrayList[N+1];
		boolean[] check = new boolean[N+1];		
		
		for (int i = 0; i < N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		StringTokenizer st;
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		
		Stack<Integer> stack = new Stack();
		stack.add(1);
		check[1] = true;
		
		while (stack.isEmpty() == false) {
			int a = stack.pop();
			cnt++;
			
			for (int i : list[a]) {
				if (check[i] == false) {
					stack.add(i);
					check[i] = true;
				}
			}
		}
		System.out.println(cnt - 1);

	}

}
