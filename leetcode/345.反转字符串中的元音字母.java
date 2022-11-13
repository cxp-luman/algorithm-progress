import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {

    public String reverseVowels(String s) {
        int l = 0, r = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        Character lowerChar[] = { 'a', 'e', 'i', 'o', 'u' };
        Character upperChar[] = { 'A', 'E', 'I', 'O', 'U' };
        while (l < r) {
            char rChar = s.charAt(r), lChar = s.charAt(l);
            if (!Arrays.asList(lowerChar).contains(rChar) && !Arrays.asList(upperChar).contains(rChar)) {
                r--;
            } else if (!Arrays.asList(lowerChar).contains(lChar)
                    && !Arrays.asList(upperChar).contains(lChar)) {
                l++;
            } else {
                char temp = lChar;
                sb.setCharAt(l, rChar);
                sb.setCharAt(r, temp);
                r--;
                l++;
            }
        }
        return sb.toString();
    }

}
// @lc code=end

