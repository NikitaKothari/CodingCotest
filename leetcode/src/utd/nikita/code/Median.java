package utd.nikita.code;

public class Median {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length = nums1.length + nums2.length;
		int[] all = new int[length];
		boolean adddedAllN1 = (nums1.length == 0 ? true : false);
		boolean adddedAllN2 = (nums2.length == 0 ? true : false);
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < length; i++) {
			if (!adddedAllN1 && !adddedAllN2) {
				if (nums1[count1] < nums2[count2]) {
					all[i] = nums1[count1++];
					adddedAllN1 = (count1 == nums1.length ? true : false);
				} else {
					all[i] = nums2[count2++];
					adddedAllN2 = (count2 == nums2.length ? true : false);
				}
			} else if (adddedAllN1) {
				all[i] = nums2[count2++];
			} else {
				all[i] = nums1[count1++];
			}
		}

		if (length % 2 == 0) {
			return (double) (all[length / 2] + all[(length / 2) - 1]) / 2;
		} else {
			return all[(int) Math.floor(length / 2)];
		}
	}
}
