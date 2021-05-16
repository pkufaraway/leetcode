import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    private static Map<Character, Integer> values;

    public int romanToInt(String s) {
        values = new HashMap<>();
        int result = 0;
        int tempValue = 0;
        int v = 0, preValue = 0;
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            preValue = v;
            v = values.get(s.charAt(i));
            if (i == 0) {
                tempValue += v;
                continue;
            }
            if (v > preValue) {
                result -= tempValue;
                tempValue = v;
            } else if (v == preValue) {
                tempValue += v;
            } else {
                result += tempValue;
                tempValue = v;
            }
        }
        result += tempValue;
        return result;
    }
}
// @lc code=end

