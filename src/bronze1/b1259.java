package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1259 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        	int N = Integer.parseInt(br.readLine());
            if(N == 0){
                break;
            }else{
                int cnt = 0;
                String str = Integer.toString(N);
                for(int i = 0; i < str.length()/2; i++){
                    if(str.charAt(i) == str.charAt(str.length()-1-i)){
                        cnt++;
                    }
                }
                if(cnt == str.length()/2){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
	}

}