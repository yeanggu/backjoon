package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4796 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int caseNum = 1;
        while(true) {
            st = new StringTokenizer(br.readLine());
            int canUseDate = Integer.parseInt(st.nextToken());
            int openDate = Integer.parseInt(st.nextToken());
            int vacation = Integer.parseInt(st.nextToken());
            
            if(canUseDate==0) {
                break;
            }
            
            int answer = 0;
            answer += ( (vacation/openDate) * canUseDate );
            if(vacation%openDate <= canUseDate) {
                answer += vacation%openDate;
            }else {
                answer += canUseDate;
            }
            
            sb.append("Case ").append(caseNum++).append(": "+answer+"\n");

        } 
        System.out.println(sb);
        
	}
	
}