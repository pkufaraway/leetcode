import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = numbers.get(target - nums[i]);
                return result;
            } else {
                numbers.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("Hello World!\n");
    }
}
// @lc code=end
