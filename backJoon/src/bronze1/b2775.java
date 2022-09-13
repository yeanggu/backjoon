package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2775 {
	//	부녀회장이 될테야

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for(int i=0;i<T;i++) {
			int k = Integer.parseInt(br.readLine()); //층 수
			int n = Integer.parseInt(br.readLine()); //호 수
			
			sb.append(Integer.toString(print(k+1,n))).append('\n'); //배열 크기를 맞추려면 k+1. why? k는 0층부터 시작하니까
		}

		System.out.println(sb);
	}

	static int print(int k,int n) {
		int [][] array = new int[k][n];
		
		for(int i=0;i<k;i++) {
			array[i][0] = 1; //모든 1호수에 1저장
			if(i == 0) { //0층일때
				for(int j=0;j<n;j++) {
					array[i][j] = j+1; //1 2 3 4 5 ... 저장
				}
			}else {
				for(int j=1;j<n;j++) { //2호수부터(배열은 1번지) 저장 
					array[i][j] = array[i][j-1] + array[i-1][j]; //이전호수 + 아래층호수
				}
			}
		}
		
		return array[k-1][n-1]; //리턴할때는 배열크기가 아니라 배열 번지에 맞춰서

	}

}