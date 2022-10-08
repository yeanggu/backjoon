package silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class s18870 {
	// ��ǥ ���� (	���� �ʿ� )
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] origin = new int[N];	// ���� �迭
		int[] sorted = new int[N];	// ���� �� �迭
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank�� �ű� HashMap
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			// ������ �迭�� ���� �迭�� ���� �־��ش�.
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		
		// ���� �� �迭�� ���� ������ �������ش�.
		Arrays.sort(sorted);
		
		// ���� �� �迭�� ��ȸ�ϸ鼭 map�� �־��ش�.
		int rank = 0;
		for(int v : sorted) {
			/*
			 *  �� �� ���� �ռ� ���Ұ� �̹� ������ �Ű����ٸ�
			 *  �ߺ��Ǹ� �ȵǹǷ�, ���Ұ� �ߺ����� ���� ����
			 *  map�� ���ҿ� �׿� �����Ǵ� ������ �־��ش�.
			 */
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;		// map�� �ְ��� ���� ������ ����ų �� �ֵ��� 1�� �����ش�.
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	// ���� �迭 ����(key)�� ���� value(����)�� ����´�.
			sb.append(ranking).append(' ');
		}
        
		System.out.println(sb);
		
	}
}