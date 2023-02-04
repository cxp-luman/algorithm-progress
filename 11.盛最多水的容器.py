#
# @lc app=leetcode.cn id=11 lang=python3
#
# [11] 盛最多水的容器
#
# @lc code=start
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        max = min(height[l], height[r]) * (r - l)
        while l < r:
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
            nowHigh = min(height[l], height[r]) * (r - l)
            if nowHigh > max:
                max = nowHigh
        return max
# @lc code=end

