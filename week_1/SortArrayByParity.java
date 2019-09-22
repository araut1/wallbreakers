import java.util.*;


public class Solution {


    static public int[] sortArrayByParity(int[] A) {

        if (A == null || A.length == 0) {
            return A;
        }

        int current = 0;
        int partition = 0;

        while ((current < A.length)) {

            if (A[current] % 2 == 0) {

                int temp = A[current];
                A[current] = A[partition];
                A[partition] = temp;

                partition++;

            }

            current++;
        }


        return A;

    }

    public static void main(String args[]) {

        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));

    }

}
