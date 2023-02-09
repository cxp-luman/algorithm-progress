/*
 * @lc app=leetcode.cn id=49 lang=golang
 *
 * [49] 字母异位词分组
 */

// @lc code=start
func groupAnagrams(strs []string) [][]string {
	if len(strs) == 1 {
		return [][]string{strs}
	}
	res := make(map[string][]string)
	for i := 0; i <= len(strs)-1; i++ {
		s := []byte(strs[i])
		sort.Slice(s, func(i, j int) bool {
			return s[i] < s[j]
		})
		str := string(s)
		res[str] = append(res[str], strs[i])
	}
	result := make([][]string, 0, len(strs))
	for _, v := range res {
		result = append(result, v)
	}
	return result
}

// @lc code=end

