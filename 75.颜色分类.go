/*
 * @lc app=leetcode.cn id=75 lang=golang
 *
 * [75] 颜色分类
 */

// @lc code=start
func sortColors(nums []int) {
	zero := -1
	two := len(nums)
	i := 0
	for i < two {
		if nums[i] < 1 {
			nums[zero+1], nums[i] = nums[i], nums[zero+1]
			zero++
			i++
		} else if nums[i] > 1 {
			nums[two-1], nums[i] = nums[i], nums[two-1]
			two--
		} else {
			i++
		}
	}
	D:\Code\leetcode\75.颜色分类.go

}

// @lc code=end

