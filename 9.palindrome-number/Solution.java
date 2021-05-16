/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] s = String.valueOf(x).toCharArray();
        for (int i = 0; i < s.length / 2; i++) {
            if (s[i] != s[s.length - i - 1]) {
                return false;
            }
        }
        return true;

    }
}
// @lc code=end

