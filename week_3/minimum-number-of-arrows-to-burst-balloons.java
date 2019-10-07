class Solution {
    public int findMinArrowShots(int[][] points) {
         
        if (points.length == 0) {
            return 0;
        }

        Stack<int[]> stack = new Stack<>();

        Arrays.sort(points, (x, y) -> x[0] - y[0]);

        stack.push(points[0]);

        for (int i = 1; i < points.length; i++) {

            int[] top = stack.pop();
            int[] cur = points[i];

            if (top[1] >= cur[0]) {
                int[] in = { Math.max( cur[0], top[0]) , Math.min( cur[1], top[1]) };
                stack.push(in);
            } else {
                stack.push(top);
                stack.push(cur);
            }

        }


        return stack.size();
    }
}
