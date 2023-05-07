package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b1296 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		int nameLength = name.length();
		
        //���� �̸� ���� L, O, V, E ����
		int L = nameLength - name.replaceAll("L", "").length();
		int O = nameLength - name.replaceAll("O", "").length();
		int V = nameLength - name.replaceAll("V", "").length();
		int E = nameLength - name.replaceAll("E", "").length();
		
        //�� ����
		int t = Integer.parseInt(br.readLine());
		
        //Ȯ���� ���� ���� ���� 0�� �� �̸��� ���������� ���� �������� ZZZZZZZZZZZZZZZZZZZZ�� ����
		int max = 0;
		String result = "ZZZZZZZZZZZZZZZZZZZZ";
		
        //�� �� �ϳ��� �����鼭 Ȯ�� �����ϱ�
		for (int i = 0; i < t; i++) {
			String team = br.readLine();
			int teamLength = team.length();
			int tL = teamLength - team.replaceAll("L", "").length();
			int tO = teamLength - team.replaceAll("O", "").length();
			int tV = teamLength - team.replaceAll("V", "").length();
			int tE = teamLength - team.replaceAll("E", "").length();
			
			int total = sum(L+tL, O+tO, V+tV, E+tE);
			
			if (max < total) {
				max = total;
				result = team;
			} else if (max == total) {
				if (result.compareTo(team) > 0) {
					result = team;
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static int sum(int l, int o, int v, int e) {
		return ((l+o) * (l+v) * (l+e) * (o+v) * (o+e) * (v+e)) % 100;
	}

}