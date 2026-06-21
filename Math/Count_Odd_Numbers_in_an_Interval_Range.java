class Solution {
    public int countOdds(int low, int high) {
        if (high==low){return high%2;}
        
        if(high%2 == 0 && low%2 == 0){
            return (high-low)/2;
        }
        return (int) Math.floor((high-low-1)/2) + (high%2) + (low%2);
    }
}