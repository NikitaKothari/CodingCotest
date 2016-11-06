package cracking.coding.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Kidnap {

	private static String process(String[] magazine, String[] ransom) {
		String result = "Yes";
		for (int i = 0; i < ransom.length; i++) {
			if (!Arrays.asList(magazine).contains(ransom[i])) {
				result = "No";
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next().toLowerCase();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next().toLowerCase();
		}
		System.out.println(process(magazine, ransom));
	}

}
