
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        Multiset<String> multiset = new Multiset<>();

        for (String ip : cpdomains) {

            String[] temp = ip.split(" ");
            int visits = Integer.parseInt(temp[0]);
            String domain = temp[1];
            multiset.add(domain, visits);

            while (find(domain, '.') >= 0) {
                domain = domain.substring(find(domain, '.') + 1);
                multiset.add(domain, visits);
            }
        }

        List<String> ans = new ArrayList<String>();

        for (String domain : multiset.elementSet()) {
            ans.add(String.valueOf(multiset.count(domain)) + " " + domain);
        }

        return ans;
    }


    public int find(String s, char c) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}
