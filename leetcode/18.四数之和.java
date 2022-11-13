import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int newTarget = target - nums[i];
            for(int j=i+1;i<nums.length;j++){
                int l = j+1,r = nums.length-1;
                while (l<r) {
                    int flag = nums[j] + nums[l] + nums[r];
                    if(flag == newTarget){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        if (!res.contains(temp)) {
                                res.add(temp);
                        }
                        l++;
                        r--;
                    }else if(flag > newTarget){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
        }
        return res;
    }

    
}
// @lc code=end

