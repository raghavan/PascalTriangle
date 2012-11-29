public class PascalTriangle {
	public static void main(String args[]) {
		int n = 5;
		Integer pas[][] = new Integer[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				pas[i][j] = 0;
			}
		}
		pas[0][n - 1] = 1;
		printMatrix(pas, n, n);
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
				if (i - 1 >= 0) {
					pas[i][j] += pas[i - 1][j];
				}
				if (i - 1 >= 0 && j + 1 < n) {
					pas[i][j] += pas[i - 1][j + 1];
				}
				if(pas[i][j] != 0)
					System.out.print(pas[i][j]);

			}
		}
		printMatrix(pas, n, n);
	}

	private static void printMatrix(Integer matrix[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				// System.out.print(matrix[i][j] + " ");
			}
			// System.out.println();
		}

	}
}
