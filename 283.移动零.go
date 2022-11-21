/*
 * @lc app=leetcode.cn id=283 lang=golang
 *
 * [283] 移动零
 */

// @lc code=start
func moveZeroes(nums []int) {
	k := 0
	for i := 0; i < len(nums); i++ {
		if nums[i] != 0 {
			if k != i {
				nums[k], nums[i] = nums[i], nums[k]
				k++
			} else {
				k++
			}
		}
	}
}

// @lc code=end

