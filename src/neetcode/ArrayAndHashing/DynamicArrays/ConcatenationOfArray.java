package neetcode.ArrayAndHashing.DynamicArrays;

public class ConcatenationOfArray {

	public int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[nums.length + i] = nums[i];
		}

		return ans;
	}

	public static void main(String[] args) {

	}

}
