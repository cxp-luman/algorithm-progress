/*
 * @lc app=leetcode.cn id=18 lang=golang
 *
 * [18] 四数之和
 */

// @lc code=start
func fourSum(nums []int, target int) [][]int {
	sort.Ints(nums)
	if len(nums) < 4 {
		return [][]int{}
	}
	res := make([][]int, 0)
	for i := 0; i < len(nums) - 3; i++ {
		if i > 0 && nums[i] == nums[i-1] {
			continue
		}
		for j := i + 1; j < len(nums) - 2; j++ {
			if j > i + 1 && nums[j] == nums[j-1] {
				continue
			}
			l, r := j+1, len(nums)-1
			for l < r {
				if nums[i]+nums[j]+nums[r]+nums[l] == target {
					res = append(res, []int{nums[i], nums[j], nums[l], nums[r]})
					for l < r && nums[l] == nums[l+1] {
						l++
					}
					for l < r && nums[r] == nums[r-1] {
						r--
					}
					l++
					r--
				} else if nums[i]+nums[j]+nums[r]+nums[l] < target {
					l++
				} else {
					r--
				}
			}
		}
	}
	return res
}
// @lc code=end

