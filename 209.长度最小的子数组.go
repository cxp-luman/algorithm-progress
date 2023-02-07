/*
 * @lc app=leetcode.cn id=209 lang=golang
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
func minSubArrayLen(target int, nums []int) int {
	res, l, r := len(nums) + 1, 0, -1
	sum := 0
	for l < len(nums) {
		if sum < target && r + 1 < len(nums) {
			r++
			sum += nums[r]
		} else {
			sum -= nums[l]
			l++
		}
		if sum >= target {
			res = int(math.Min(float64(res), float64(r - l + 1)))
		}
	}
	if res == len(nums) + 1 {
		res = 0
	}
	return res

}
// @lc code=end

