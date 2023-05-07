package bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b10807 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(st.nextToken());
			if (map.get(input) == null) {
				map.put(input, 1);
			} else {
				map.replace(input, map.get(input) + 1);
			}
		}

		int V = Integer.parseInt(br.readLine());
		if (map.get(V) == null)
			System.out.println(0);
		else
			System.out.println(map.get(V));
	}
	
}