/*
 * @lc app=leetcode.cn id=125 lang=golang
 *
 * [125] 验证回文串
 */

// @lc code=start
func isPalindrome(s string) bool {
	if len(s) == 1 || len(s) == 0 {
		return true
	}
	s = strings.ToLower(s)
	l, r := 0, len(s)-1
	for l <= r {
		iteml, itemr := s[l], s[r]
		if !isNumAndLetter(iteml) {
			l++
			continue
		}else if !isNumAndLetter(itemr) {
			r--
			continue
		}
		if iteml != itemr {
			return false
		} else {
			l++
			r--
		}
	}
	return true
	
}

func isNumAndLetter(c byte) bool {
	return ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || ('0' <= c && c <= '9')
}
// @lc code=end

