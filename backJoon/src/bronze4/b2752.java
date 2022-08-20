package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2752 {
	// 세수정렬
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//Arrays 클래스에 있는 sort로 정렬해준다.
		Arrays.sort(arr);
		
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}