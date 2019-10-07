class Solution {
    public boolean lemonadeChange(int[] bills) {
                  int gala = 0;
        int gala5 = 0;
        int gala10 = 0;
        int gala20 = 0;

        for (int i = 0; i < bills.length; i++) {

            int amount = bills[i];

            if (amount == 5) {
                gala += 5;
                gala5++;
            } else if (amount == 10) {
                gala += 10;
                gala10++;

                if (gala5 >= 1) {
                    gala5--;
                    gala -= 5;
                } else {
                    return false;
                }


            } else {
                gala += 20;
                gala20++;
                if (gala5 >= 1 && gala10 >= 1) {
                    gala5--;
                    gala10--;
                    gala -= 15;
                } else if (gala5 >= 3) {
                    gala5--;
                    gala5--;
                    gala5--;
                    gala -= 15;
                } else {
                    return false;
                }

            }
        }

        return true;
    }
}
