package test.techgig;

import java.util.Arrays;

public class HeightCheck {

	public static int find(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value)
				return i;
		}
		return 0;
	}

	public static int[] uniqueValue(int input1, int[] input2) {
		int[] result = new int[input2.length];
		System.out.println(input2[Arrays.asList(input2).indexOf(1)]);
		for (int i = input2.length - 1; i <= 0; i++) {
			find(input2, input2[i]);
			if (result[input2[i]] == 0) {
				result[input2[i]] = i + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] z = { 2, 1, 1, 0 };
		System.out.println(uniqueValue(4, z));
	}
}
