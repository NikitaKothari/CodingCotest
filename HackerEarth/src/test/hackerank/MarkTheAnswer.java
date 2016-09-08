package test.hackerank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MarkTheAnswer {

	private static boolean equal(int[] initial, int[] target) {
		return Arrays.equals(initial, target);
	}

	private static int[] rotate(int[] initial, String side, int rotateBy) {
		if (side.equals("L")) {
			return rotateLeft(initial, rotateBy);
		} else {
			return rotateRight(initial, rotateBy);
		}
	}

	private static int[] rotateRight(int[] initial, int rotateBy) {
		final int length = initial.length;
		final int[] rotated = new int[length];
		for (int i = 0; i < length; i++) {
			rotated[(i + rotateBy) % length] = initial[i];
		}
		return rotated;
	}

	private static int[] rotateLeft(int[] initial, int rotateBy) {
		final int length = initial.length;
		final int[] rotated = new int[length];
		for (int i = 0; i < length; i++) {
			rotated[(i - rotateBy + length) % length] = initial[i];
		}
		return rotated;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] test = br.readLine().split(" ");
		int arraylength = Integer.parseInt(test[0]);
		int noOfOperations = Integer.parseInt(test[1]);

		String[] testString = br.readLine().split(" ");
		int[] initial = new int[arraylength];
		for (int j = 0; j < arraylength; j++) {
			initial[j] = Integer.parseInt(testString[j]);
		}

		String[] targetString = br.readLine().split(" ");
		int[] target = new int[arraylength];
		for (int j = 0; j < arraylength; j++) {
			target[j] = Integer.parseInt(targetString[j]);
		}

		boolean find = false;
		int i = 0;
		for (i = 0; i < noOfOperations; i++) {
			String[] str = br.readLine().split(" ");
			initial = rotate(initial, str[0], Integer.parseInt(str[1]));
			if (equal(initial, target)) {
				find = true;
				break;
			}
		}

		if (find) {
			System.out.println(i + 1);
		} else {
			System.out.println(-1);
		}
	}
}
