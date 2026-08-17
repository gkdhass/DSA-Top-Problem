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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        path(root ,"", res);
        return res;
    }
    static void path(TreeNode root , String current, List<String> res){
        if(root == null){
            return;
        }
        if(current.equals("")){
            current = "" + root.val;
        }
        else{
            current = current + "->" + root.val;
        }

        if(root.left == null && root.right == null){
            res.add(current);
            return;
        }
        
        path(root.left,current , res);
        path(root.right ,current ,res);
    }
}