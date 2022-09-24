package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class s2751 {
	//	�� �����ϱ� 2
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		// Collections Ŭ������ �޼ҵ� sort�� ���. �迭 list�� �������� �����Ѵ�.
		
		for(Integer c : list) {
			sb.append(c).append('\n');
		}
		
		System.out.println(sb);
	}
	
}