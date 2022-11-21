/*
 * @lc app=leetcode.cn id=26 lang=golang
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
func removeDuplicates(nums []int) int {
	f, k := 0, 0
	for k < len(nums) && f < len(nums) {
		if nums[f] != nums[k] {
			nums[f+1] = nums[k]
			f++
		}
		k++
	}
	return f + 1
}

// @lc code=end

