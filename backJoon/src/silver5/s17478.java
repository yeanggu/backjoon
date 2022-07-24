package silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s17478 {
//	재귀함수가 뭔가요?
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		print(num,0);
		finalPrint(num);
	}
	
	static void print(int n,int cnt) {
		spacePrint(cnt);
		System.out.println("\"재귀함수가 뭔가요?\"");
		
		if(n==0) {
			spacePrint(cnt);
			System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			spacePrint(cnt);
			System.out.println("라고 답변하였지.");
			return;
		}else {
			spacePrint(cnt);
			System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			spacePrint(cnt);
			System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			spacePrint(cnt);
			System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		}
		print(n-1,++cnt);
	}

	static void spacePrint(int cnt) {
		for(int i=0;i<cnt;i++) {
		System.out.print("____");
		}
	}
	
	static String finalPrint(int n) {
		if(n==0) {
			return "";
		}
		spacePrint(n-1);
		System.out.println("라고 답변하였지.");
		return finalPrint(n-1);
	}

	
	
	
	
/*	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		for(int i=0;i<num;i++) {
			spacePrint(num,num+i);
			System.out.println("\"재귀함수가 뭔가요?\"");
			spacePrint(num,num+i);
			System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			spacePrint(num,num+i);
			System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			spacePrint(num,num+i);
			System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		
			if(i==num-1) {
				spacePrint(num,num+i+1);
				System.out.println("\"재귀함수가 뭔가요?\"");
				spacePrint(num,num+i+1);
				System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
				spacePrint(num,num+i+1);
				System.out.println("라고 답변하였지.");
			}
		}
		System.out.println(finalPrint(num));
	}
	
	static String spacePrint(int a, int n) {
		if(a==n || a==0) {
			return "";
		}
		System.out.print("____");
		return spacePrint(a+1, n);
	}
	
	static String finalPrint(int n) {
		if(n==0) {
			return "";
		}
		spacePrint(1,n);
		System.out.println("라고 답변하였지.");
		return finalPrint(n-1);
	}
*/
}