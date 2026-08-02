class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--) {
              int rem=  digits[i]+carry;
               carry=rem/10;
              digits[i]=rem%10;
             if (carry == 0) {
                break;
            }
        }
        if(carry==1){
            int results[]=new int[digits.length+1];
            results[0]+=carry;
            return results;
        }
       

        return digits;
    }
}