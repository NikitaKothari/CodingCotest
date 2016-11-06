package cracking.coding.interview;

import java.util.Scanner;

public class TwosComplement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(calculateComplement(a, b));
		}

	}

	private static int calculateComplement(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
