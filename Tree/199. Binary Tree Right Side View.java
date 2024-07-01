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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
        return res;
        q.add(root);
        while(q.size()!=0)
        {
            List<Integer> levels = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode n = q.poll();
                levels.add(n.val);
                if(n.right!=null)
                q.add(n.right);
                if(n.left!=null)
                q.add(n.left);
                
            }
            int data = levels.get(0);
            res.add(data);
        }
        return res;
    }
}
