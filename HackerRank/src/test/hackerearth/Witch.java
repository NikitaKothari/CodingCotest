package test.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Witch {

	public static int calculateMoves(int[] heights) {
		Arrays.sort(heights);
		int compareOne = heights[1] - heights[0] - 1;
		int compareTwo = heights[2] - heights[1] - 1;
		return compareOne > compareTwo ? compareOne : compareTwo;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		if (testCases >= 1 && testCases <= 100) {
			for (int i = 0; i < testCases; i++) {
				String[] heightString = br.readLine().split(" ");
				int[] heights = new int[3];
				for (int j = 0; j < 3; j++) {
					heights[j] = Integer.parseInt(heightString[j]);
				}
				System.out.println(calculateMoves(heights));
			}
		}

	}

}