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
    public int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        mps(root);
        return sum;
    }
    public int mps(TreeNode root){
        if(root==null) return 0;
        int sl=Math.max(0,mps(root.left));
        int rl=Math.max(0,mps(root.right));
        sum=Math.max(sum,sl+rl+root.val);
        return Math.max(sl,rl)+root.val;
    }
}