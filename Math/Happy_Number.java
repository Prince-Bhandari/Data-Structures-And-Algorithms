import java.util.LinkedList;

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
    
        do{
             slow = solve(slow);
             fast = solve(solve(fast));
        } while(slow != fast && fast != 1);
        return fast == 1;
    }

    public int solve(int num){
        int ans = 0;
        while(num > 0){
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }
}