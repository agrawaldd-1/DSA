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
    int height = 0;
    public boolean isBalanced(TreeNode root) {
        return heightOfTree(root) != -1;
    }

    private int heightOfTree(TreeNode node){
       if(node == null) return 0;

        int left = heightOfTree(node.left);
        if(left == -1) return -1;
        int right = heightOfTree(node.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }
}