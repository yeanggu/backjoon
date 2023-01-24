package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b24416 {
	//	알고리즘 수업 - 피보나치 수 1
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.append(fibonacci(n)+" "+(n-2));
		bw.close();
	}
	
	public static int fibonacci(int n) {
		int[] fibos = new int[n+1];
		fibos[1]=fibos[2]=1;
		for(int i=3;i<=n;i++) {
			fibos[i]=fibos[i-1]+fibos[i-2];
		}
		return fibos[n];
	}
}