import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if (set1.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }
        int len = resultSet.size();
        int res[] = new int[len];
        int index = 0;
        for (int r : resultSet) {
            res[index++] = r;
        }
        return res;
    }
}
// @lc code=end

