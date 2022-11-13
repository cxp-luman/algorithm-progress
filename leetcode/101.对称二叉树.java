import java.util.ArrayDeque;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Solution s = new Solution();
        return s.midSeq(root.left, root.right);
    }

    public boolean midSeq(TreeNode left, TreeNode right){
        if (left==null&&right==null) {
            return true;
        }else if (left!=null&&right!=null) {
            if (left.val == right.val) {
                return this.midSeq(left.left, right.right) && this.midSeq(left.right, right.left);
            }else{
                return false;
            }
        }else{
            return false;
        }

        
    }
}
// @lc code=end

