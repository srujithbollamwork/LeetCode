class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList <Integer> result = new ArrayList <>();

        int colbegin = 0;
        int colend = matrix[0].length - 1;

        int rowbegin = 0;
        int rowend = matrix.length - 1;

        while (rowbegin <= rowend && colbegin <= colend) {

            for (int i = colbegin; i <= colend; i++) {
                result.add(matrix[rowbegin][i]);
            }
            rowbegin++;

            for (int i = rowbegin; i <= rowend; i++) {
                result.add(matrix[i][colend]);
            }
            colend--;

            if (rowbegin <= rowend) {
                for (int i = colend; i >= colbegin; i--) {
                    result.add(matrix[rowend][i]);
                }
                rowend--;
            }

            if (colbegin <= colend) {
                for (int i = rowend; i >= rowbegin; i--) {
                    result.add(matrix[i][colbegin]);
                }
                colbegin++;
            }
        }
        return result;
    }
}