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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        if(left == right){
            return (1 << left) + countNodes(root.right);
        }
        return (1 << right) + countNodes(root.left);
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + height(root.left);
    }
}