class Solution {
    public String reverseVowels(String s) {
         if(s == null || s.length() == 0){
            return s;
        }

        List<Integer> vowelPos = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == 'a' || c == 'o' || c == 'i' || c == 'e' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelPos.add(i);
                stack.push(i);
            }
        }

        char[] ans = s.toCharArray();
        for (int i = 0; i < vowelPos.size(); i++) {

            int x = vowelPos.get(i);
            int y = stack.pop();

            if (x > y) {
                break;
            }

            char temp = ans[x];
            ans[x] = ans[y];
            ans[y] = temp;


        }

        return String.valueOf(ans);
    }
}
