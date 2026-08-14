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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean zigzag = true;

        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n = queue.size();

            for(int i=0; i<n; i++){
                TreeNode current = queue.poll();

                if(zigzag){
                    list.add(current.val);
                }
                else{
                    list.add(0 ,current.val);
                }

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            res.add(list);
            zigzag = !zigzag;
        }
        return res;
    }
}