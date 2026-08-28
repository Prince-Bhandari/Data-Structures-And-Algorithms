class Solution {
    public int findGCD(int[] nums) {
        
        int p = Integer.MAX_VALUE, q = Integer.MIN_VALUE;

        for(int num : nums){
            p = Math.min(p, num);
            q = Math.max(q, num);
        }
        while(p != 0){
            int temp = p;
            p = q % p;
            q = temp;
        }
        return q;
    }
}