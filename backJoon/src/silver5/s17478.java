package silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s17478 {
//	����Լ��� ������?
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		print(num,0);
		finalPrint(num);
	}
	
	static void print(int n,int cnt) {
		spacePrint(cnt);
		System.out.println("\"����Լ��� ������?\"");
		
		if(n==0) {
			spacePrint(cnt);
			System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			spacePrint(cnt);
			System.out.println("��� �亯�Ͽ���.");
			return;
		}else {
			spacePrint(cnt);
			System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			spacePrint(cnt);
			System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			spacePrint(cnt);
			System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
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
		System.out.println("��� �亯�Ͽ���.");
		return finalPrint(n-1);
	}

	
	
	
	
/*	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		for(int i=0;i<num;i++) {
			spacePrint(num,num+i);
			System.out.println("\"����Լ��� ������?\"");
			spacePrint(num,num+i);
			System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			spacePrint(num,num+i);
			System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			spacePrint(num,num+i);
			System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
			if(i==num-1) {
				spacePrint(num,num+i+1);
				System.out.println("\"����Լ��� ������?\"");
				spacePrint(num,num+i+1);
				System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
				spacePrint(num,num+i+1);
				System.out.println("��� �亯�Ͽ���.");
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
		System.out.println("��� �亯�Ͽ���.");
		return finalPrint(n-1);
	}
*/
}