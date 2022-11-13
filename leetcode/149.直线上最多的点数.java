import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
/*
 * @lc app=leetcode.cn id=149 lang=java
 *
 * [149] 直线上最多的点数
 */

// @lc code=start
class Solution {
    public int maxPoints(int[][] points) {
        if (points == null) {
            return 0;
        }
        if (points.length == 1)
            return 1;
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> records = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                records.put(this.getK(points[i], points[j]),
                        records.getOrDefault(this.getK(points[i], points[j]),
                                1) + 1);
            }
            int max = 1;
            for (Map.Entry<Double, Integer> entry : records.entrySet()) {
                int value = entry.getValue();
                if (value > max) {
                    max = value;
                }
            }
            if (max > res) {
                res = max;
            }
        }
        return res;
    }

    /**
     * param A点坐标：长度为2的一维数组·
     * param B点坐标：长度为2的一维数组
     * return 两点所连直线的斜率
     */
    public Double getK(int[] a, int[] b) {
        if ((a[1] - b[1]) != 0) {
            // double result = (a[0] - b[0]) / (a[1] - b[1]);
            BigDecimal bd = new BigDecimal(((double) a[0] - (double) b[0]) / ((double) a[1] - (double) b[1]));
            return bd.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
        } else {
            return 100000000000000.0;
        }
    }
}

// @lc code=end

