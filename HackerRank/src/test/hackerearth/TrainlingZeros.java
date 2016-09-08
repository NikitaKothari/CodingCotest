package test.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainlingZeros {

	public static int calculateZeros(int n) {
		int result = 0;
		int numberOfFive = (int) n / 5;
		result = result + numberOfFive;
		while (numberOfFive != 0) {
			numberOfFive = (int) numberOfFive / 5;
			result = result + numberOfFive;
		}
		return result;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		if (N >= 1 && N <= 1000) {
			System.out.println(calculateZeros(N));
		}
	}

}
