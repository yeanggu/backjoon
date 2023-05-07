package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 
		for(int i=0; i<T; i++){
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //C��� ������ ��
			int M = Integer.parseInt(st.nextToken()); //������ ������ ��
			long[] cIQ = new long[N];
			
			long cSum = 0;
			long eSum = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++){
				cIQ[j] = Integer.parseInt(st.nextToken());
				cSum += cIQ[j];
			}
			st = new StringTokenizer(br.readLine());
			for(int k=0; k<M; k++){
				eSum += Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			
			for(int j=0; j<N; j++){
				if(cSum > cIQ[j]*N && eSum < cIQ[j]*M){ 
					answer++;
				}
			}
			
			System.out.println(answer);
		}
	}
}