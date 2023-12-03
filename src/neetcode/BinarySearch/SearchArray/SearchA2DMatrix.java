package neetcode.BinarySearch.SearchArray;

public class SearchA2DMatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {

		int n = matrix.length, m = matrix[0].length - 1;

		for (int i = 0; i < n; i++) {
			if (matrix[i][0] > target)
				return false;
			if (matrix[i][m] >= target) {
				for (int j = m; j >= 0; j--)
					if (matrix[i][j] == target)
						return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1 } };
		SearchA2DMatrix.searchMatrix(matrix, 1);
	}

}
