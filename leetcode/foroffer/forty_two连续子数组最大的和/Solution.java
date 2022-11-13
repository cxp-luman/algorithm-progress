package foroffer.forty_two连续子数组最大的和;

public class Solution {
    public int maxSubArray(int[] nums) {
        // if (nums.length<0 && nums == null) {
        //     return 0;
        // }
        // int maxSum = nums[0], curSum = nums[0];
        // for(int i = 1;i<nums.length;i++){
        //     if (curSum > 0) {
        //         curSum = curSum + nums[i];
        //     }else{
        //         curSum = nums[i];
        //     }
        //     if (curSum > maxSum) {
        //         maxSum = curSum;
        //     }

        // }
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i-1] > 0) {
                nums[i] = nums[i-1] + nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
