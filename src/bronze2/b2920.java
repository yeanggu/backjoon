package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2920 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean asc = true;
		boolean desc = true;
		
		for (int i = 0; i < 7; i++) {
			if (arr[i+1] > arr[i]) desc = false;
			if (arr[i+1] < arr[i]) asc = false;
		}
		
		if (asc) {
			System.out.print("ascending");
		} else if (desc) {
			System.out.print("descending");
		} else {
			System.out.print("mixed");
		}
	}

}