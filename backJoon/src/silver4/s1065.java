package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1065 {
	//	한수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int count = 0; //갯수 셀 용도
		
		if(N < 100) { //어차피 100이하는 전부 등차수열
			sb.append(N);
			
		}else { //100이상일때
			
			for(int i=100;i<=N;i++) { //100부터 주어진 숫자까지
				
				int num = i;
				int length = (int)(Math.log10(i)+1);
				int[] array = new int[length]; //숫자 각 자릿수 넣기위한 배열선언
				int[] common = new int[length-1]; //공차 배열선언
				int temp = 0; // 공차가 모두 같은숫자인지 확인할 용도
				
				
				for(int j=0;j<length;j++) { //자릿수 배열에 넣기
					array[j] = num%10;
					num /= 10;
				}
				
				for(int j=0;j<common.length;j++) { //공차갯수(길이-1)만큼 반복해서 공차 배열에 넣기
					common[j] = array[j] - array[j+1];
				}
				
				for(int j=1;j<common.length;j++) { //공차가 모두 같은 숫자인지
					if(common[0] == common[j]) { //첫번째 공차와 순차적으로 모두 비교
						temp++;
					}
				}
				
				if(temp == common.length-1) { //모두 같은숫자라면 공차크기-1와 같을 것임
					count++; //이때 한수 갯수 추가
				}
				
			}
			
			sb.append(count+99);
			
		}
		
		System.out.println(sb);
	}

}