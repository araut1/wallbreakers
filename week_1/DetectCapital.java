class Solution {
    public boolean detectCapitalUse(String word) {
             if (word.length() == 0) {
            return true;
        }
        if (word.length() == 1) {
            return true;
        }
        char first = word.charAt(0);
        char second = word.charAt(1);
        int situation;

        if (first - 'a' < 0) {
            if (second - 'a' < 0) {
                // USA
                situation = 2;
            } else {
                // Abhi
                situation = 3;
            }
        } else {
            // good
            situation = 1;
        }


        switch (situation) {
            case 1: {

                for (int i = 0; i < word.length(); i++) {

                    char c = word.charAt(i);
                    if(c  - 'a' < 0 ){
                        return false;
                    }
                }
                break;
            }


            case 2: {
                for (int i = 0; i < word.length(); i++) {

                    char c = word.charAt(i);
                    if(c  - 'a' >= 0 ){
                        return false;
                    }
                }
                break;
            }


            case 3:
            {
                for (int i = 1; i < word.length(); i++) {

                    char c = word.charAt(i);
                    if(c  - 'a' < 0 ){
                        return false;
                    }
                }

            }

        }

        return true;
    }
}
