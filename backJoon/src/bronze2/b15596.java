package bronze2;

public class b15596 {
//	정수 N개의 합
	long sum(int[] a) {
		long ans = 0;	// a 배열 정수 합 변수
        
		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}