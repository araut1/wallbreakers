class Solution {
    public int[][] transpose(int[][] A) {
       
        if (A.length == 0 || A[0].length == 0) {
            return A;
        }

        int r = A.length;
        int c = A[0].length;

        int[][] res = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                res[j][i] = A[i][j];
            }
        }

        return res;
    }
}
