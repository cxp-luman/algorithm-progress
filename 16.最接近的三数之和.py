#
# @lc app=leetcode.cn id=16 lang=python3
#
# [16] 最接近的三数之和
#

# @lc code=start
import math


class Solution:
    def threeSumClosest(self, nums, target: int) -> int:
        nums.sort()
        max_near = 10**7
        res = 0
        for i in range(len(nums) - 1):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l, r = i+1, len(nums) - 1
            while l < r:
                if nums[i] + nums[l] + nums[r] == target:
                    return nums[i] + nums[l] + nums[r]
                elif nums[i] + nums[l] + nums[r] < target:
                    if math.fabs(target - (nums[i] + nums[l] + nums[r])) < max_near:
                        max_near = int(
                            math.fabs(target - (nums[i] + nums[l] + nums[r])))
                        res = nums[i] + nums[l] + nums[r]
                    l = l + 1
                else:
                    if math.fabs(target - (nums[i] + nums[l] + nums[r])) < max_near:
                        max_near = int(
                            math.fabs(target - (nums[i] + nums[l] + nums[r])))
                        res = nums[i] + nums[l] + nums[r]
                    r = r - 1
        return res
# S = Solution()
# print(S.threeSumClosest([-1, 2, 1, -4], 1))
# @lc code=end

