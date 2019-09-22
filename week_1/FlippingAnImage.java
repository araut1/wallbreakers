class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
              if (A == null || A.length == 0 || A[0].length == 0) {
            return A;
        }


        for (int i = 0; i < A.length; i++) {

            int j = 0, k = A[i].length - 1;

            while (j < k) {

                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;





                j++;
                k--;
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                
                    A[i][j] ^= 1;
                
            }
        }


        return A;  
    }
}
