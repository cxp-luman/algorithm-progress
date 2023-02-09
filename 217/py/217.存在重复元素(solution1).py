#
# @lc app=leetcode.cn id=217 lang=python3
#
# [217] 存在重复元素
#

# @lc code=start
class Solution:
    """
    先排序再便利判断相邻两个数是否相等
    """

    def containsDuplicate(self, nums: List[int]) -> bool:
        if len(nums) <= 1:
            return False
        nums.sort()
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                return True
        return False


# @lc code=end
