/*
 * @lc app=leetcode.cn id=3 lang=golang
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
func lengthOfLongestSubstring(s string) int {
	str := []byte(s)
	record := make(map[byte]int)
	start := 0
	maxLength := 0
	for i, ch := range str {
		if lastI, ok := record[ch]; ok && lastI >= start {
			start = lastI + 1
		}
		if i-start+1 > maxLength {
			maxLength = i - start + 1
		}
		record[ch] = i
	}
	return maxLength
}

// @lc code=end

