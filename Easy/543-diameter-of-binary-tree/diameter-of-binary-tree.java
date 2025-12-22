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
class Info{
    int d;
    int ht;
    public Info(int d,int ht){
        this.d=d;
        this.ht=ht;
    }
}

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        Info res=diameter(root);
        return res.d-1;
    }
    public static Info diameter(TreeNode root){
        if(root==null) return new Info(0,0);
        Info leftinfo= diameter(root.left);
        Info rightinfo= diameter(root.right);
        int diam=Math.max(Math.max(leftinfo.d,rightinfo.d),leftinfo.ht+rightinfo.ht+1);
        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
        return new Info(diam,ht);
    }
}