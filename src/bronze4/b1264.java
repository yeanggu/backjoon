package bronze4;

import java.util.Scanner;

public class b1264 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String Word = scan.nextLine();
			if(Word.contains("#")) {
				System.out.println();
				break;
			}
			
			String[] wording = Word.split("");
			int count = 0;
			
			for(int i=0;i<Word.length();i++) {
				wording[i] = wording[i].toLowerCase();
				if(wording[i].equals("a") || 
						wording[i].equals("e") || 
						wording[i].equals("i") || 
						wording[i].equals("o") || 
						wording[i].equals("u")) {
					count += 1;
				}
			}
			
			System.out.println(count);
			
		}
		
		
		
		scan.close();
	}

}