package utd.nikita.code;

public class Palindrom {

	public static int reverse(int x) {
		int reverse = 0;

		while (x != 0) {
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}

		return reverse;
	}

	public static void main(String args[]) {
		int a = 1534236469;
		System.out.println(reverse(1534236469));
	}

}
