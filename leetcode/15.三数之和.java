import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 && nums == null) {
            res.add(null);
            return res;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int target = nums[i];
            int l = i + 1, r = len - 1;
            while (l < r) {
                int left = nums[l], right = nums[r];
                int flag = nums[l] + nums[r];
                if (flag + target == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(target);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    if (!res.contains(temp)) {
                        res.add(temp);
                    }
                    l++;
                    r--;
                } else if (flag + target > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}
// @lc code=end

