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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> left1 = new ArrayList<>();
        List<Integer> left2 = new ArrayList<>();

        child(root1,left1);
        child(root2,left2);

        return left1.equals(left2);
    }
    static void child(TreeNode mohan , List<Integer> list){
        if(mohan == null){
            return;
        }

        if(mohan.left == null && mohan.right == null){
            list.add(mohan.val);
        }
        child(mohan.left,list);
        child(mohan.right,list);
    }
}