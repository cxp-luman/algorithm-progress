#
# @lc app=leetcode.cn id=16 lang=python3
#
# [16] 最接近的三数之和
#

# @lc code=start
class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        for i in range(len(nums) - 2):
            for j in range(len(nums - 1)):
                l, r = j + 1, len(nums) - 1
                while l < r:
                    nums[l] nums[r]
# @lc code=end

