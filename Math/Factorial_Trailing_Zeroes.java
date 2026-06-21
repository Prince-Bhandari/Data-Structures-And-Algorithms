class Solution {
    public int trailingZeroes(int n) {
        int tzeroes = 0;
        while(n > 0){
            n = n/5;
            tzeroes = tzeroes + n;
        } 
        return tzeroes;
    }
}