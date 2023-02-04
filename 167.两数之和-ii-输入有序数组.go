/*
 * @lc app=leetcode.cn id=167 lang=golang
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
func twoSum(numbers []int, target int) []int {
	// 采用对撞指针的方式
	l, r := 0, len(numbers)-1
	res := make([]int, 2)
	for l < r {
		if numbers[l]+numbers[r] == target {
			res[0] = l + 1
			res[1] = r + 1
			break
		} else if numbers[l]+numbers[r] < target {
			l++
		} else {
			r--
		}
	}
	return res
}
// @lc code=end

