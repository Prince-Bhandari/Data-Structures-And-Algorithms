class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            digits[i]=0;
        }

        //Special case !!!
        //it will only run if above return statement does not execute, i.e. all digits are 9

        //creating a new array takes 0 as default value so we just need 1 in MSB 
        digits=new int[digits.length + 1];
        digits[0]=1;
        return digits;
    }
}