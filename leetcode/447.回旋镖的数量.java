import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=447 lang=java
 *
 * [447] 回旋镖的数量
 */

// @lc code=start
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for(int i=0;i<points.length;i++){
            HashMap<Integer, Integer> record = new HashMap<>();
            for(int j=0;j<points.length;j++){
                record.put(this.dis(points[i], points[j]), record.getOrDefault(this.dis(points[i], points[j]), 0)+1);
            }
            for(Map.Entry<Integer, Integer> entry : record.entrySet()){
                int value  = entry.getValue();
                res += value*(value - 1);
            }
        }

        return res;
    }
    public int dis(int[] first, int[] second){
        return (first[0] - second[0]) * (first[0] - second[0]) + (first[1] - second[1]) * (first[1] - second[1]);
    }
}
// @lc code=end

