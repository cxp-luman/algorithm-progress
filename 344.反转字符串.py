#
# @lc app=leetcode.cn id=344 lang=python3
#
# [344] 反转字符串
#

# @lc code=start
class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        l, r = 0, len(s) - 1
        while l <= r:
            tem = s[l]
            s[l] = s[r]
            s[r] = tem
            l += 1
            r -= 1
        return s
# @lc code=end

