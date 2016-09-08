package test.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GCD {

	static Map<Integer, Integer> sumOfGCD = new HashMap<Integer, Integer>();

	public static int compute(int start, int end, int[] f) {
		int result = 0;
		for (int i = start; i <= end; i++) {
			result = result + f[i - 1] % (1000000007);
		}
		return result;
	}

	private static int findGCD(int number1, int number2) {
		// base case
		if (number2 == 0) {
			return number1;
		}
		return findGCD(number2, number1 % number2);
	}

	public static int calculateSumOfGCD(int number) {
		if (sumOfGCD.get(number) != null) {
			return sumOfGCD.get(number);
		} else {
			int result = 0;
			for (int i = 1; i <= number; i++) {
				result = result + findGCD(i, number);
			}
			sumOfGCD.put(number, result);
			return result;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		if (testCases >= 1 && testCases <= 1000000) {
			String[] values = br.readLine().split(" ");
			int[] a = new int[testCases];
			int[] f = new int[testCases];
			for (int i = 0; i < values.length; i++) {
				a[i] = Integer.parseInt(values[i]);
				f[i] = calculateSumOfGCD(a[i]);
			}
			int nQueries = Integer.parseInt(br.readLine());
			if (nQueries >= 1 && nQueries <= 100000) {
				for (int i = 0; i < nQueries; i++) {
					String[] query = br.readLine().split(" ");
					int x = Integer.parseInt(query[1]);
					int y = Integer.parseInt(query[2]);
					if (query[0].equals("U")) {
						a[x - 1] = y;
						f[x - 1] = calculateSumOfGCD(y);
					} else {
						System.out.println(compute(x, y, f));
					}
				}
			}
		}
	}
}
