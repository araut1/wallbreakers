class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        if (A == null || B == null) {
            return new String[]{};
        }
        Map<String, Integer> map = new HashMap<>();


        for (String a : A.split(" ")) {

            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }

        }


        for (String a : B.split(" ")) {

            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }

        }

        int count = 0;
        for (Map.Entry e : map.entrySet()) {

            if ((int) e.getValue() == 1) {
                count++;
            }
        }

        String[] ans = new String[count];

        int i = 0;
        for (Map.Entry e : map.entrySet()) {

            if ((int) e.getValue() == 1)
                ans[i++] = (String) e.getKey();

        }

        return ans;
    }
}
