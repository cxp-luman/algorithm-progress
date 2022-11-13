/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution27 {
    /*
    采用双指针的方法（对撞指针），左、右指针分别从头尾开始遍历，左右指针初始值分别为0和nums.length - 1,左指针从头开始遍历，当遍历到与val相等的数时，判断右指针所指当前元素是否等于val如果等于，则右指针向左移动直到右指针所指数值不等于val并覆盖左指针所指数。
    notice: 1、循环遍历结束条件为r<l
            2、当出现右指针向左直到左指针之前的位置时，此时双指针退化成单指针
    */
    public int removeElement(int[] nums, int val) {
        if ((nums.length==1 && nums[0] == val) || nums.length == 0) {
            return 0;
        }
        int l = 0, r = nums.length-1, res = nums.length;
        while (l<=r) {
            if (nums[l] == val) {
                while (nums[r]==val&&r>l) {
                    res--;
                    r--;
                }
                nums[l] = nums[r];
                l++;
                r--;
                res--;
            }else {
                l++;
            }
        }
        return res;
    }
}
/*
//测试主函数
class Main{
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        int[] nums = {1,2,3,4,4,4,4};
        s.removeElement(nums, 4);
    }
}
*/
// @lc code=end

