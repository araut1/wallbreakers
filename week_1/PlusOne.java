class Solution {
    public int[] plusOne(int[] digits) {
        
        return plusOne(digits, digits.length - 1);
        
    }
    
    int[] plusOne(int[] digits, int index)
    {
        if(index == 0 && digits[index] == 9)
        {
            digits[index] = 0;
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.out.println(result[0]);
            return result;
        }
        
        if(digits[index] < 9)
        {
            digits[index] += 1;
        }
        else if(digits[index] == 9)
        {
            digits[index] = 0; 
            return plusOne(digits,index - 1);
        }
        
        return digits;
    }
}
