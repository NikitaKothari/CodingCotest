package cracking.coding.interview;

import java.util.Scanner;

public class Anagrams {
	public static int numberNeeded(String first, String second) {
		int result = 0;
		int totalLength = first.length() + second.length();
		for (int i = 0; i < first.length(); i++) {
			if (second.contains("" + first.charAt(i))) {
				second = second.replace("" + first.charAt(i), "");
				result++;
			}
		}
		System.out.println(second);
		return totalLength - result * 2;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		System.out.println(numberNeeded(first, second));
	}
}