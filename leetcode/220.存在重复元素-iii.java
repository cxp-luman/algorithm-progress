import java.util.HashSet;
import java.util.TreeSet;

/*
 * @lc app=leetcode.cn id=220 lang=java
 *
 * [220] 存在重复元素 III
 */

// @lc code=start
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> record = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            int ele = nums[i] - t;
            // if (record.first()<=ele&&record.last()>=ele&&record.contains(ele)) {
            //     return true;
            // }
            if (record.contains(record.floor(ele))&&record.floor(ele)<=nums[i] - t) {
                return true;
            }
            record.add(nums[i]);
            if (record.size() == k+1) {
                record.remove(nums[i-k]);
            }
        }

        return false;
    }
}
// @lc code=end

