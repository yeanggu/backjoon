package bronze2;

public class b15596 {
//	���� N���� ��
	long sum(int[] a) {
		long ans = 0;	// a �迭 ���� �� ����
        
		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}