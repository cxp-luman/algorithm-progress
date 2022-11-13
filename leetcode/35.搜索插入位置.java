/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if ((nums.length == 1 && nums[0] == target) || nums.length == 0) {
            return 0;
        }
        int low = 0, high = nums.length-1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (target < nums[mid]) {
                high = mid - 1;
                mid = (low + high) / 2;
            }else if(target > nums[mid]){
                low = mid + 1;
                mid = (low + high) / 2;
            }else{
                return mid;
            }
        }
        return low;

        
    }
}
// class Main{
//     public static void main(String[] args) {
//         Solution35 s = new Solution35();
//         int nums[] = {1,3,5,6};
//         s.searchInsert(nums, 2);
//     }
// }
// @lc code=end

