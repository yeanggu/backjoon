package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b9933 {
	//	πŒ±’¿Ã¿« ∫Òπ–π¯»£
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		   
		int N=Integer.parseInt(br.readLine());
		String[] arr=new String[N];
		
		String password ="";
		boolean isFind = false;
		String tmp;
		
		for(int i=0; i<N && !isFind; i++) {
			arr[i]=br.readLine();
			sb.append(arr[i]);
			tmp = sb.reverse().toString();
			
			for(int j=0; j<=i; j++) {
				if( arr[i].equals(tmp) || (j!=i && arr[i].equals(arr[j])) ) {
					password = arr[i];
					isFind = true;
					break;
				}
			}
			
			arr[i] = tmp;
			sb.setLength(0);
		}
		
		System.out.println(password.length()+" "+password.charAt(password.length()/2));
	}
	
}