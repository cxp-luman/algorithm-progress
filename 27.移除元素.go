/*
 * @lc app=leetcode.cn id=27 lang=golang
 *
 * [27] 移除元素
 */

// @lc code=start
func removeElement(nums []int, val int) int {
	k := len(nums) - 1
	i := 0
	res := 0
	for i <= k {
		if nums[i] == val {
			nums[i], nums[k] = nums[k], nums[i]
			k--
			res++
		}
		// if nums[k] == val {
		// 	res++
		// }
		if nums[i] != val {
			i++
		}
	}
	return len(nums) - res
}

// @lc code=end

