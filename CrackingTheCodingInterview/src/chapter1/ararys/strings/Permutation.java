package chapter1.ararys.strings;

import java.util.Arrays;

public class Permutation {

	public static String sort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public static void main(String args[]) {
		System.out.println(permutation("asds", "sdas"));
	}

}