package easy;

public class CellsWithOddValuesInAMatrix {
    public static int oddCells(int n, int m, int[][] indices) {

        if (n <= 0 || n > 50 || m <= 0 || m > 50) return 0;
        if (indices.length <= 0 || indices.length > 100) return 0;

        int[][] matrix = new int[n][m];
        int counter = 0;

        for (int i = 0; i < indices.length; i++) {
            if (indices[i][0] < 0 || indices[i][0] >= n) return 0;
            if (indices[i][1] < 0 || indices[i][1] >= m) return 0;

            for (int j = 0; j < indices[i].length; j++) {
                matrix[i][j] += indices[i][j];
                if (matrix[i][j] % 2 == 1) {
                    counter++;
                } else {
                    //counter--;
                }
            }
        }

        return counter;

    }
}
