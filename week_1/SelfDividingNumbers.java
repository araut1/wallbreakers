class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            res.add(i);
        }

        List<Integer> rem = new ArrayList<>();

        for (int i = 0; i < res.size(); i++) {


            boolean flag = false;
            int temp = res.get(i);
            List<Integer> divider = new ArrayList<>();

            while (temp != 0) {
                int div = temp % 10;
                if (div == 0) {
                    rem.add(i);

                    flag = true;
                    break;
                }
                divider.add(div);
                temp /= 10;
            }
            temp = res.get(i);

            if (flag) {

                continue;
            }

            for (Integer x : divider) {
                if (temp % x != 0) {
                    rem.add(i);

                    break;
                }
            }


        }

        int r =0;
        for (Integer x : rem) {
            int index = x -r;
            res.remove( index);
            r++;
        }

        return res;
    }
}
