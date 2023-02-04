#
# @lc app=leetcode.cn id=345 lang=python3
#
# [345] 反转字符串中的元音字母
#

# @lc code=start
class Solution:
    def reverseVowels(self, s: str) -> str:
        s = list(s)
        target = "aeiouAEIOU"
        l, r = 0, len(s) - 1
        while l <= r:
            if s[l] not in target:
                l += 1
                continue
            if s[r] not in target:
                r -= 1
                continue
            temp = s[l]
            s[l] = s[r]
            s[r] = temp
            l += 1
            r -= 1
        return ''.join(s)
# s = Solution()
# s.reverseVowels("hello")
            
# @lc code=end

