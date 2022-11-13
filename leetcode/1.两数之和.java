import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean flag = false;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            result[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == sub) {
                    flag = true;
                    result[1] = j;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return result;
    }
}
// @lc code=end

