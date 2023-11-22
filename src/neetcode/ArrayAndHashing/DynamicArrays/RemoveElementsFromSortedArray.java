package neetcode.ArrayAndHashing.DynamicArrays;

public class RemoveElementsFromSortedArray {
	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n ; i++) {
			if (i > 0) {
				for (int sx = i - 1; sx >= 0; sx--) {
					if (nums[i] == nums[sx]) {
						swap(nums, sx + 1, n);
						n--;
					}
				}
			}
			for (int dx = i + 1; dx < n; dx++) {
				if (nums[i] == nums[dx]) {
					swap(nums, dx + 1, n);
					n--;
				}
			}
		}
		return n;
	}

	public static void swap(int[] nums, int j, int n) {
		while (j < n) {
			nums[j - 1] = nums[j];
			j++;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int k = RemoveElementsFromSortedArray.removeDuplicates(nums);
		k++;

		int[] nums1 = { 1, 1, 1, 1 };
		k = RemoveElementsFromSortedArray.removeDuplicates(nums1);
		k++;
		// { 0, 1, 1, 2, 2, 3, 3, 4, 4, 4 };
	}
}