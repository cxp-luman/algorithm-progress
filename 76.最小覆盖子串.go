/*
 * @lc app=leetcode.cn id=76 lang=golang
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
func minWindow(s string, t string) string {
	if len(s) < len(t) {
		return ""
	}
	record := make([]int32, 256)
	originRecord := make([]int32, 256)
	for _, v := range t {
		record[v]++
		originRecord[v]++
	}
	resL, resR := 0, -1
	minLen := len(s) + 1
	l, r := 0, -1
	for l < len(s) {
		if (r+1) < len(s) && !isContainer(record, originRecord) {
			r++
			assd := record[int32(s[r])]
			if assd != 0 {
				record[int32(s[r])]++
			}
		} else {
			if record[int32(s[l])] != 0 {
				record[int32(s[l])]--
			}
			l++
		}
		if isContainer(record, originRecord) {
			if r-l+1 < minLen {
				resL = l
				resR = r
			}
			minLen = int(math.Min(float64(minLen), float64(r-l+1)))
		}
	}
	return s[resL : resR+1]
}

func isContainer(record []int32, originRecord []int32) bool {
	flag := true
	l, r := 0, len(record)-1
	for r-l != 1 {
		if originRecord[l]*2 > record[l] || originRecord[r]*2 > record[r] {
			flag = false
			break
		}
		r--
		l++
	}
	return flag
}
// @lc code=end

