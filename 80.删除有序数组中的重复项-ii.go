/*
 * @lc app=leetcode.cn id=80 lang=golang
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
func removeDuplicates(nums []int) int {
	i, k, n := 0, 0, 0
	for k < len(nums) && i < len(nums) {
		if nums[i] != nums[k] {
			if n < 2 {
				i = i + n + 1
				nums[i+n] = nums[k]
			} else {
				nums[i+2] = nums[k]
				i = i + 2
			}
			n = 0
		} else {
			n++
		}
		k++
	}
	return i
}

// @lc code=end

