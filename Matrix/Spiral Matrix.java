class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();

        while (startCol <= endCol && startRow <= endRow) {

            // TOP
            for (int i = startCol; i <= endCol; i++) {
                list.add(matrix[startRow][i]);
            }

            // RIGHT
            for (int i = startRow + 1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }

            // BOTTOM
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    list.add(matrix[endRow][i]);
                }
            }

            // LEFT
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    list.add(matrix[i][startCol]);
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return list;
    }
}
