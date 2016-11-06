package utd.nikita.code;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] ans = { 3, 2, 4 };
		t.twoSum(ans, 6);

	}

}
