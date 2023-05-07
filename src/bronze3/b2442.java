package bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2442 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= num; i++) {
			for(int j = i; j < num; j++) {
				System.out.print(" ");
			}

			for(int k = 0; k < i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}