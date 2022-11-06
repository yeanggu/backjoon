package bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b5597 {
	//	ÃÖ´ñ°ª

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];

		for (int i = 0; i < 9; i++) {
			String[] strArr = br.readLine().split(" ");
			for (int j = 0; j < strArr.length; j++) {
				arr[i][j] = Integer.parseInt(strArr[j]);
			}
		}

		int num = 0;
		int row = 0;
		int column = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (num < arr[i][j]) {
					num = arr[i][j];
					row = i;
					column = j;
				}
			}
		}

		System.out.println(num);
		System.out.println((row + 1) + " " + (column + 1));

	}
}	