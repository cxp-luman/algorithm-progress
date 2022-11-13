import java.util.*;

/*
 * @lc app=leetcode.cn id=451 lang=java
 *
 * [451] 根据字符出现频率排序
 */

// @lc code=start
class Solution {
    public String frequencySort(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return -(o1.getValue() - o2.getValue());
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> et : list) {
            Character key = et.getKey();
            int count = map.get(key);
            if (count > 1) {
                for (int i = 0; i < count; i++) {
                    sb.append(key);
                }
            } else {
                sb.append(key);
            }
        }
        return sb.toString();

    }
}
// @lc code=end

