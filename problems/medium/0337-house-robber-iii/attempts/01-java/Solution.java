import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n)
// Space Complexity: O(n  n)
class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public int rob(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        lookChildren(root, deque);
        while (!deque.isEmpty()) {
            TreeNode current = deque.pop();
            int value = current.val;
            value += getValueFromGrandChildren(current, map);
            int childrenValue = getChildrenVal(current, map);
            map.put(current, Math.max(value, childrenValue));
        }
        return map.get(root);
    }

    private int getValueFromGrandChildren(TreeNode node, Map<TreeNode, Integer> map) {
        int value = 0;
        if (node.left != null) {
            value += getChildrenVal(node.left, map);
        }

        if (node.right != null) {
            value += getChildrenVal(node.right, map);
        }
        return value;
    }

    private int getChildrenVal(TreeNode node, Map<TreeNode, Integer> map) {
        int value = 0;
        value += node.left != null ? map.get(node.left) : 0;
        value += node.right != null ? map.get(node.right) : 0;
        return value;
    }

    private void lookChildren(TreeNode node, Deque<TreeNode> deque) {
        deque.push(node);
        if (node.left != null) {
            lookChildren(node.left, deque);
        }

        if (node.right != null) {
            lookChildren(node.right, deque);
        }
    }
}
