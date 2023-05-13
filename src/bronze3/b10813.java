package bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b10813 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int basket[] = new int[N+1];

		for (int i = 1 ; i <= N; i++) {
			basket[i] = i;
		}

		for (int i = 0 ; i < M; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());

			int temp = basket[a];

			basket[a] = basket[b];
			basket[b] = temp;
		}

		for (int i = 1 ; i <=N; i++) {
			System.out.print(basket[i]+ " ");
		}
	}
	
}