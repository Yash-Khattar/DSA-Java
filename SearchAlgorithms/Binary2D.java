import java.util.Arrays;

public class Binary2D {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 },
        };
       System.out.println(Arrays.toString(search(matrix, 12)) );
    }

    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (target > matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }

        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            binarySearch(matrix, target, rows - 1, 0, cols - 1);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (target == matrix[cMid][mid]) {
                return new int[] { cMid, mid };
            }
            if (target > matrix[cMid][mid]) {
                rStart = mid;
            } else {
                rEnd = mid;

            }
        }

        // now 2 rows are left
        // check in mid col
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // check in 4 parts left
        // 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        } else {
            return binarySearch(matrix, target, rStart + 1, cMid + 1, cols - 1);
        }

    }
}
