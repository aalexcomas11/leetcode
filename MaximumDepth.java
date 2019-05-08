/** Definition for a binary tree node.*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int maxDepth(TreeNode root) {
        int d = depth_helper(root);
        
        if(d == 0){
            return 0;
        }
        else{
            return d;
        }
    }
    
    public int depth_helper(TreeNode root){
        if(root == null){
            return 0;
        }
        
        return Math.max(depth_helper(root.left),depth_helper(root.right)) + 1;
    }
}

