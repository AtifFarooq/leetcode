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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        }
        // decrement the node's val from the sum and ask the same question recursively
        return hasPathSum(root.left, sum - root.val) || 
        hasPathSum(root.right, sum - root.val);
    }

    public boolean hasPathSumIterative(TreeNode root, int sum) {
        if (root == null) return false;
        Stack<TreeNode> nodes = new Stack();
        Stack<Integer> sums = new Stack();
        nodes.add(root);
        sums.add(root.val);
        while (!nodes.isEmpty()) {
            TreeNode current = nodes.pop();
            Integer currentSum = sums.pop();
            if (current.left == null && current.right == null && currentSum == sum) {
                return true;
            }
            
            if (current.left != null) {
                nodes.add(current.left);
                sums.add(currentSum + current.left.val);
            }
            
            if (current.right != null) {
                nodes.add(current.right);
                sums.add(currentSum + current.right.val);
            }
        }
        
        return false;
    }
}