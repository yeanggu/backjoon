package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1236 {
	//	성 지키기

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] yxArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int yWallSize = yxArr[0];
        int xWallSize = yxArr[1];
        Boolean[][] hasGuard2DArr = new Boolean[yWallSize][xWallSize];
        
        for (int i = 0; i < yWallSize; i++) {
            hasGuard2DArr[i] = Arrays.stream(br.readLine().split("")).map(ch -> ch.equals("X")).toArray(Boolean[]::new);
        }
        
        int yGuardSize = 0;
        int xGuardSize = 0;
        for (int i = 0; i < yWallSize; i++) {
            for (int j = 0; j < xWallSize; j++) {
                if (hasGuard2DArr[i][j]) {
                    yGuardSize++;
                    break;
                }
            }
        }
        
        for (int i = 0; i < xWallSize; i++) {
            for (int j = 0; j < yWallSize; j++) {
                if (hasGuard2DArr[j][i]) {
                    xGuardSize++;
                    break;
                }
            }
        }

        System.out.print(Math.max((xWallSize - xGuardSize), (yWallSize - yGuardSize)));
        br.close();
	}

}