class Solution {
    public int findComplement(int num) {
        
        int comp = (1 << Integer.toBinaryString(num).length()) - 1;
        return num ^= comp;
    }
}
