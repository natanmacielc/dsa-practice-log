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
    /**
     * Time Complexity: O(h + k)
     * Space Complexity: O(h), O(n) worst case
     */
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        pushLeft(root, stack);
        int traversalCounter = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (++traversalCounter == k) {
                return node.val;
            }
            if (node.right != null) {
                pushLeft(node.right, stack);
            }
        }
        throw new IllegalArgumentException("k value is invalid");
    }

    private void pushLeft(TreeNode node, Deque<TreeNode> stack) {
        TreeNode current = node;
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
    }
}
