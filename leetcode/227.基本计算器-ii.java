import java.util.HashMap;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=227 lang=java
 *
 * [227] 基本计算器 II
 */

// @lc code=start
class Solution227 {
    public int calculate(String s) {
        Solution227 q = new Solution227();
        int[] in = q.midToTail(s);
        int temp =  q.TailCalculate(in);
        return 0;
    }

    public int[] midToTail(String s){
        Stack<Character> operater = new Stack<>();
        int[] res = new int[s.length()];
        HashMap<Character, Integer> record = new HashMap<>();
        record.put('+',0);
        record.put('-', 0);
        record.put('*',1); 
        record.put('/', 1);
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(!record.containsKey(s.charAt(i))){
                System.out.println(s.charAt(i));
                res[j] = (int)s.charAt(i);
                j++;
            }else{
                while(!operater.empty()){
                    Character tempOPerator = operater.peek();
                    System.out.println(tempOPerator);
                    if (record.get(tempOPerator)>=record.get(s.charAt(i))) {
                        res[i] = operater.pop();
                    }else{
                        break;
                    }
                }
                operater.push(s.charAt(i));
            }
        }
        return res;
    }

    public int TailCalculate(int[] nums){
        Stack<Integer> digitStack = new Stack<>();
        for(int i=0;i<nums.length;i++){
            // System.out.println(nums[i]);
            int curChar = nums[i];
            if (0<curChar&&curChar<9) {
                digitStack.push(curChar);
            }else{
                digitStack.push(digitStack.pop()+digitStack.pop());
            }
        }
        return digitStack.pop();
    }
}
class Main{
    public static void main(String[] args) {
        String s = "1+2*3-5";
        Solution227 q = new Solution227();
        q.calculate(s);
    }
}
// @lc code=end

