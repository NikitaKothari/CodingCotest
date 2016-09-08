package test.hackerank;

import java.util.Scanner;

public class SetNonDivisible {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int result = 0;
		for (int i = 0; i < n; i++) {
			boolean allZero = true;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (((a[i] + a[j]) % k) != 0) {
						allZero = false;
						break;
					}
				}
			}
			if (!allZero) {
				result++;
			}
		}
		System.out.println(result);
	}
}
