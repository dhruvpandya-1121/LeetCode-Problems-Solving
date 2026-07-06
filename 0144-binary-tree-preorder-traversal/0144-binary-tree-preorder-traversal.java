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
        preOrder(list, root);
        return list;
    }

    public void preOrder(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }

        list.add(root.val);        // Root
        preOrder(list, root.left); // Left
        preOrder(list, root.right);// Right
    }
}