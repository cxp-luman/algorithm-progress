/*
 * @lc app=leetcode.cn id=344 lang=golang
 *
 * [344] 反转字符串
 */

// @lc code=start
func reverseString(s []byte)  {
	l, r := 0, len(s) - 1
	for l <= r {
		temp := s[l]
		s[l] = s[r]
		s[r] = temp
		l++
		r--
	}
}
// @lc code=end

