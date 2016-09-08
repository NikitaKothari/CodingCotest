package test.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckeyNumber {

	public static int calculateLuckyNumber(long[] range) {
		int result = 0;
		long i = range[0];
		while (i <= range[1]) {
			String luckyNumber = "" + i;
			if (luckyNumber.contains("4") || luckyNumber.contains("7")) {
				luckyNumber = luckyNumber.replaceAll("4", "");
				luckyNumber = luckyNumber.replaceAll("7", "");
				if (luckyNumber.length() == 0) {
					result++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		if (testCases >= 1 && testCases <= 10000) {
			for (int i = 0; i < testCases; i++) {
				String[] RangeString = br.readLine().split(" ");
				long[] range = new long[2];
				for (int j = 0; j < 2; j++) {
					range[j] = Long.parseLong(RangeString[j]);
				}
				System.out.println(calculateLuckyNumber(range));
			}
		}
	}
}
