import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            ArrayList<String> temp = new ArrayList<>();
            res.add(temp);
            return res;
        }
        if (strs.length == 1) {
            List<String> temp = new ArrayList<>();
            temp.add(strs[0]);
            res.add(temp);
            return res;
        }
        int flag[] = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char freq[] = new char[26];
            List<String> temp = new ArrayList<>();
            if (flag[i] == 0) {
                temp.add(strs[i]);
                flag[i]++;
                for (int j = 0; j < strs[i].length(); j++) {
                    char w = strs[i].charAt(j);
                    int t = strs[i].charAt(j) - 'a';
                    freq[strs[i].charAt(j) - 'a']++;
                }
                int l = i + 1, r = strs.length - 1;
                while (l <= r) {
                    int lFlag = 0, rFlag = 0;
                    for (int j = 0; j < strs[l].length(); j++) {
                        if (!(freq[strs[l].charAt(j) - 'a'] == 1)) {
                            break;
                        }
                        lFlag++;
                    }
                    for (int j = 0; j < strs[r].length(); j++) {
                        if (!(freq[strs[r].charAt(j) - 'a'] == 1)) {
                            break;
                        }
                        rFlag++;
                    }
                    if (lFlag == strs[i].length() && strs[i] != "" && flag[l] == 0) {
                        temp.add(strs[l]);
                        flag[l]++;
                    }
                    if (rFlag == strs[i].length() && strs[i] != "" && l != r && flag[r] == 0) {
                        temp.add(strs[r]);
                        flag[r]++;
                    }
                    l++;
                    r--;
                }
                if (temp != null)
                    res.add(temp);
            }
        }
        return res;
    }
}
// class Main{
//     public static void main(String[] args) {
//         Solution49 s = new Solution49();
//         String[] strs = {"", "b"};
//         List<List<String>> lists = s.groupAnagrams(strs);
//         System.out.println(lists);
//     }
// }
// @lc code=end

