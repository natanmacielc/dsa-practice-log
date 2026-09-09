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
class BSTIterator {
    Deque<TreeNode> stack = new ArrayDeque<>();

    /**
     * Push the left spine of the root so the top of the stack is always the
     * next smallest unvisited node.
     * Time Complexity:  O(h) to construct, where h is the tree height
     * Space Complexity: O(h)
     */
    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    /**
     * Pop the next smallest node, then push the left spine of its right
     * subtree so that node becomes reachable next.
     * Time Complexity:  O(1) amortized
     * Space Complexity: O(1) amortized (excluding the O(h) stack)
     */
    public int next() {
        TreeNode node = stack.pop();
        if (node.right != null) pushLeft(node.right);
        return node.val;
    }

    /**
     * Time Complexity:  O(1)
     * Space Complexity: O(1)
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushLeft(TreeNode node) {
        TreeNode current = node;
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
