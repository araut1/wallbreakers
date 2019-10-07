class Solution {
    public int[][] merge(int[][] intervals) {
                if(intervals.length == 0){
            return new int[][] {};
        }
        Stack<int[]> stack = new Stack<>();

        Arrays.sort(intervals, (x,y)-> x[0]-y[0]);

        stack.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] temp = stack.pop();
            if((temp[1] >= intervals[i][0])){
                 temp[1] = Math.max( intervals[i][1] , temp[1]);
                stack.push(temp);
            } else{
                stack.push(temp);
                stack.push(intervals[i]);
            }
        }

        int[][] result = new int[stack.size()][2];
        for (int i = stack.size() -1; i >=0 ; i--) {

            result[i] = stack.pop();
        }

        return result;
    }
}
