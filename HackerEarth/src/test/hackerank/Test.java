package test.hackerank;

class person {
	protected String name;

	person(String name) {
		this.name = name;
	}
}

public class Test extends person {
	private int[] testScores;

	Test(String name, int[] testscore) {
		super(name);
		this.testScores = testscore;
	}

	public char calculate() {
		int sum = 0;
		for (int i = 0; i < testScores.length; i++) {
			sum = sum + testScores[i];
		}
		int avg = sum / testScores.length;

		if (avg >= 90 && avg <= 100) {
			return 'O';
		} else if (avg >= 80 && avg < 90) {
			return 'E';
		} else if (avg >= 70 && avg < 80) {
			return 'A';
		} else if (avg >= 55 && avg < 70) {
			return 'P';
		} else if (avg >= 40 && avg < 55) {
			return 'D';
		} else if (avg < 40) {
			return 'T';
		}
		return 'X';
	}
}
