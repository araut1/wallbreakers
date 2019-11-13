class Solution {
    public int calPoints(String[] ops) {
             Stack<Integer> stack = new Stack<>();

        for (String s : ops) {

            if (s.equals("+")) {
                int temp2 = stack.pop();
                int temp1 = stack.pop();
                int temp3 = temp1 + temp2;

                stack.push(temp1);
                stack.push(temp2);
                stack.push(temp3);
            } else if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
            } else {

                int temp = Integer.parseInt(s);
                stack.push(temp);

            }
        }
        int score = 0;
        while (!stack.isEmpty()) {
            score += stack.pop();
        }
        return score;
    }
}
