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
    public boolean isBalanced(TreeNode root) {
        return func(root)==-1? false: true;
    }

    static int func(TreeNode r){
        if(r==null) return 0;

        int lh = func(r.left);
        int rh = func(r.right);

        if(lh ==-1 || rh ==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;

        return 1+Math.max(lh,rh);
    }
}