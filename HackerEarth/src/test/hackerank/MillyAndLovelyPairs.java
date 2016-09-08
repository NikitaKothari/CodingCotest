package test.hackerank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MillyAndLovelyPairs {
	private static int calculateNumberOfPairs(int[] students) {
		int previousDifferce = 0;
		int noOfPairs = 0;
		Arrays.sort(students);
		for (int i = 0; i < students.length - 1; i++) {
			if (i == 0 || (students[i - 1] == students[i])) {
				for (int j = i + 1; j < students.length; j++) {
					int difference = students[j] - students[i];
					if (previousDifferce < difference) {
						previousDifferce = difference;
						noOfPairs = 1;
					} else if (previousDifferce == difference) {
						noOfPairs++;
					}
				}
			} else {
				break;
			}
		}
		return noOfPairs;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCases; i++) {
			int numberOfStudents = Integer.parseInt(br.readLine());
			String[] studentsString = br.readLine().split(" ");
			int[] students = new int[numberOfStudents];
			for (int j = 0; j < numberOfStudents; j++) {
				students[j] = Integer.parseInt(studentsString[j]);
			}
			System.out.println(calculateNumberOfPairs(students));
		}

	}

}
