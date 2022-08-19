package bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b2675 {
	// 문자열 반복
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int num = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			String[] wording = new String[word.length()]; //word길이 배열 생성
			
			for(int j=0;j<wording.length;j++){ //word를 한글자씩 끊어 배열에 저장
				wording[j]=Character.toString(word.charAt(j));
				for(int k=0;k<num;k++) {
					bw.write(wording[j]);
				}
			}
			bw.write("\n");
		}
		bw.flush(); //남아있는 데이터를 모두 출력시킴
		bw.close();
		
	}

}