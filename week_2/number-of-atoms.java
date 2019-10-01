class Solution {
    public String countOfAtoms(String formula) {

        Multiset<String> multiset = new Multiset<>();
        Stack<Integer> factors = new Stack<>();

        int count = 1;
        int factor = 1;
        String temp = "";


        for (int i = formula.length() - 1; i >= 0; i--) {

            char c = formula.charAt(i);

            if (Character.isUpperCase(c)) {

                count = temp.isEmpty() ? 1 : Integer.parseInt(temp);
                String element = String.valueOf(c);
                multiset.add(element, count * factor);
                temp = "";

            } else if (Character.isLowerCase(c)) {

                count = temp.isEmpty() ? 1 : Integer.parseInt(temp);
                String element = formula.charAt(--i) + "" + c;
                multiset.add(element, count * factor);
                temp = "";
                
            } else if (Character.isDigit(c)) {

                temp = c + temp;

            } else if (c == ')') {

                count = Integer.parseInt(temp);
                factor *= count;
                factors.push(count);
                temp = "";

            } else {

                factor /= factors.pop();
            }
        }

        List<String> s = new ArrayList<>();
        s.addAll(multiset.elementSet());

        Collections.sort(s);
        StringBuilder ans = new StringBuilder();

        for (String str : s) {
            ans.append(str + (multiset.count(str) > 1 ? multiset.count(str) : ""));
        }

        return ans.toString();
    }
}
