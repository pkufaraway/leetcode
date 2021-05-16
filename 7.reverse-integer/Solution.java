/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int abs = x;
        int result = 0;
        if(abs < 0) {
            abs = abs * -1;
        }
        while(abs > 0) {
            if(result > Integer.MAX_VALUE / 10) {
                return 0;
            } else if (result == Integer.MAX_VALUE) {
                if(x < 0 && abs % 10 >= (Integer.MIN_VALUE + 10) * (-1)  % 10) {
                    return 0;
                }
                if(x > 0 && abs % 10 >= Integer.MAX_VALUE % 10) {
                    return 0;
                }

            }
            result = result * 10 + abs % 10;
            abs /= 10;
        }
        if(x < 0) {
            result *= -1;
        }
        return result;
        
    }
}
// @lc code=end

