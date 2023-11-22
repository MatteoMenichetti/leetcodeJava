package neetcode.ArrayAndHashing.StaticArrays;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == val) {
				swap(nums, i, n - 1);
				n--;
			}
			if (nums[i] == val && i < n) {
				swap(nums, i, n - 1);
				n--;
			}
		}

		if (nums[n - 1] == val && n != 0)
			n--;

		return n;

	}

	private static void swap(int[] nums, int i, int n) {
		while (i < n) {
			nums[i] = nums[i + 1];
			i++;
		}

	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };

		int n = RemoveElement.removeElement(nums, 2);
		n++;

		int[] nums1 = { 0, 4, 4, 0, 4, 4, 4, 0, 2 };

		n = RemoveElement.removeElement(nums1, 4);
		n++;
	}
}
