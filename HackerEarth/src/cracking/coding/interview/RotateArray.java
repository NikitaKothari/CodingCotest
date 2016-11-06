package cracking.coding.interview;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		a = rotate(a, k);
		for (int a_i = 0; a_i < n; a_i++) {
			System.out.print(a[a_i] + " ");
		}

	}

	private static int[] rotate(int[] a, int k) {
		int[] afterRotation = new int[a.length];
		for (int a_i = 0; a_i < a.length; a_i++) {
			afterRotation[a_i] = a[(a_i + k) % a.length];
		}
		return afterRotation;
	}
}