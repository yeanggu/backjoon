package bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b10813 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] num = new int[N];

		int arr[] = new int[N + 1];

		int i, j, tmp;

		for(int s = 1; s <= N; s++) {
			arr[s] = s;
		}

		for(int s = 0; s < M; s++) {
			String as = br.readLine();
			StringTokenizer stt = new StringTokenizer(as, " ");
			i = Integer.parseInt(stt.nextToken());
			j = Integer.parseInt(stt.nextToken());

			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}

		for(int s = 1; s <= N; s++) {
			bw.write(arr[s] + " ");
		}
	}
	
}