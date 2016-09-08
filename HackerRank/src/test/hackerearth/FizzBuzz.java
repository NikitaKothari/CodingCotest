package test.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FizzBuzz {
	public void processNumber(int num) {
		if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("FizzBuzz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println(num);
		}
	}

	public static void main(String[] args) throws IOException {
		FizzBuzz fz = new FizzBuzz();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		if (N >= 1 && N <= 10) {
			for (int i = 0; i < N; i++) {
				String[] inputNumbers = br.readLine().split(" ");
				for (int j = 0; j < inputNumbers.length; j++) {
					int inputNumber = Integer.parseInt(inputNumbers[j]);
					for (int k = 1; k <= inputNumber; k++) {
						fz.processNumber(k);
					}

				}

			}
		}

	}
}