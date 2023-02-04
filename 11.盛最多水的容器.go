/*
 * @lc app=leetcode.cn id=11 lang=golang
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
func maxArea(height []int) int {
	x, y := int(math.Min(float64(height[0]), float64(height[len(height) - 1]))), len(height) - 1
	l, r := 0, len(height) - 1
	max := x * y
	for l < r {
		if height[l] < height[r] {
			l++
		} else {
			r--
		}
		nowHigh := int(math.Min(float64(height[l]), float64(height[r]))) * (r - l)
		if nowHigh >= max {
			max = nowHigh
		}
	}
	return max
}
// @lc code=end

