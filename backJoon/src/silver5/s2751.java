package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class s2751 {
	//	수 정렬하기 2
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		// Collections 클래스의 메소드 sort를 사용. 배열 list를 오름차순 정렬한다.
		
		for(Integer c : list) {
			sb.append(c).append('\n');
		}
		
		System.out.println(sb);
	}
	
}