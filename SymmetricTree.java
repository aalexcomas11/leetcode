/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
            return true;
        return isSymmetric_helper(root.left, root.right);
    }
    
    public boolean isSymmetric_helper(TreeNode l, TreeNode r){
        if(l == r){
            return true;
        }
        
        if( (l != null && r != null) && l.val == r.val){
            return isSymmetric_helper(l.left,r.right) && isSymmetric_helper(l.right,r.left);
        }
        
        return false;
    }
}