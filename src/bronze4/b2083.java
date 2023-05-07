package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2083 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			int kg = Integer.parseInt(st.nextToken());
			
			if(name.equals("#") && age == 0 && kg == 0)
				break;
			
			if(age>17 || kg>=80)
				System.out.println(name+ " Senior");
			else
				System.out.println(name+ " Junior");
		}
	}

}