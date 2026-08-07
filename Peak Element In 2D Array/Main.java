class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int start = 0;
        int end = mat[0].length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Find maximum element in the middle column
            int maxRow = 0;
            for (int i = 1; i < mat.length; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int current = mat[maxRow][mid];

            int left = (mid == 0) ? Integer.MIN_VALUE : mat[maxRow][mid - 1];
            int right = (mid == mat[0].length - 1)
                    ? Integer.MIN_VALUE
                    : mat[maxRow][mid + 1];

            // Peak found
            if (current > left && current > right) {
                return new int[] { maxRow, mid };
            }

            // Search left half
            if (left > current) {
                end = mid - 1;
            }
            // Search right half
            else {
                start = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }
}