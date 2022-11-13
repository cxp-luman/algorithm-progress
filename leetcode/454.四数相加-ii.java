import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int tempSum = nums1[i] + nums2[j];
                record.put(tempSum, record.containsKey(tempSum)?record.get(tempSum)+1:1);
            }
        }
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                int target = 0 - nums3[i] - nums4[j];
                if (record.containsKey(target)) {
                    res += record.get(target);
                }
            }
        }
        return res;
    }
}
// class Main{
//     public static void main(String[] args) {
//         Solution454 s = new Solution454();
//         int nums1[] = { 1, 2 }, nums2[] = { -2, -1 }, nums3[] = { -1, 2 }, nums4[] = { 0, 2 };
//         int res = s.fourSumCount(nums1, nums2, nums3, nums4);
//         System.out.println(res);
//     }
// }
// @lc code=end

