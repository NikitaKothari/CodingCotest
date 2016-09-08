package test.hackerank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JPAndRotations {

	private static int calculateNoOfQuestionSolved(int[] questions, int difficultyLevel) {
		boolean skip = false;
		int nquestions = 0;
		for (int i = 0; i < questions.length; i++) {
			if (questions[i] <= difficultyLevel) {
				nquestions++;
			} else if (skip == false) {
				skip = true;
			} else {
				break;
			}
		}
		return nquestions;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] test = br.readLine().split(" ");
		int noOfcases = Integer.parseInt(test[0]);
		int difficultyLevel = Integer.parseInt(test[1]);

		String[] questionsString = br.readLine().split(" ");
		int[] questions = new int[noOfcases];
		for (int j = 0; j < noOfcases; j++) {
			questions[j] = Integer.parseInt(questionsString[j]);
		}
		System.out.println(calculateNoOfQuestionSolved(questions, difficultyLevel));
	}
}
