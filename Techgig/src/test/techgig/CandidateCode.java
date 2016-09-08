package test.techgig;

public class CandidateCode {

	public static int passCount(int input1, int input2, int input3) {
		if (input1 >= 3 && input1 <= 1000 && input2 >= 3 && input2 <= 1000) {
			int[] visit = new int[input1];
			int result = 0;
			int i = 0;
			visit[i] = 1;
			while (true) {
				result++;
				if (visit[i] % 2 == 0) {
					i = i - input3;
					if (i < 0) {
						i = i + input1;
					}
				} else {
					i = i + input3;
					i = i % 5;
				}
				visit[i] = visit[i] + 1;
				if (visit[i] >= input2) {
					break;
				}
			}
			return result;
		}
		return -1;
	}

	public static void main(String args[]) {
		System.out.println(CandidateCode.passCount(5, 3, 2));
	}

}
