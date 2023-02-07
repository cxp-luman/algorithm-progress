/*
 * @lc app=leetcode.cn id=1 lang=golang
 *
 * [1] 两数之和
 */

// @lc code=start
func twoSum(nums []int, target int) []int {
	record := make(map[int]int)
	res := make([]int, 2)
	for i, v := range nums {
		complement := target - v
		val, ok := record[complement]
		if ok {
			res[0] = val
			res[1] = i
			break
		} else {
			record[v] = i
		}
	}
	return res
}
// @lc code=end

