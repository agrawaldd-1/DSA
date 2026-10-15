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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root,list);
        return list;

    }
    private void traverse(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);      // Visit Root
        traverse(node.left, list);  // Traverse Left
        traverse(node.right, list); // Traverse Right
    }
}