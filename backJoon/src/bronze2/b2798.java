package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2798 {
	//	����
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer> card = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < N ; i++) {
			card.add(Integer.parseInt(st.nextToken()));
		}
		
		int max = 0;
        for(int i=0;i<N-2;i++) {
            for(int j=i+1; j<N-1;j++) {
                for(int k=j+1;k<N;k++) {
                    int sum = card.get(i)+card.get(j)+card.get(k);
                    if(sum <= M) {
                        max = Math.max(max, sum);
                    }
                    if(max == M) {
                        System.out.println(max);
                        return;
                    }
                }
            }
        }
        System.out.println(max);
		
		
	}
	
}