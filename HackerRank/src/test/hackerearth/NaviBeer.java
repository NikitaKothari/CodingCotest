package test.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NaviBeer {
	public static int calculateLentMoney(int N, int K, int M) {
		int result = 0;
		int totalAmount = 0;
		for (int i = 1; i <= N; i++) {
			totalAmount = totalAmount + K * i * i * i;
		}
		result = totalAmount - M;
		return result < 0 ? 0 : result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		if (testCases >= 1 && testCases <= 10000) {
			for (int i = 0; i < testCases; i++) {
				String[] RangeString = br.readLine().split(" ");
				int N = Integer.parseInt(RangeString[0]);
				int K = Integer.parseInt(RangeString[1]);
				int M = Integer.parseInt(RangeString[2]);
				System.out.println(calculateLentMoney(N, K, M));
			}
		}

	}
}
