class Solution {
    public int findNthDigit(int n) {
        int length_of_digits = 1;
        int start = 1;
        long no_of_digits = 9;

        while(n > length_of_digits * no_of_digits){
            n -= length_of_digits * no_of_digits;
            length_of_digits++;
            start *=10;
            no_of_digits *=10;
        }
        start = start + (n-1)/length_of_digits;
        String str = Integer.toString(start);
        return Character.getNumericValue(str.charAt((n-1) % length_of_digits));
    }
}