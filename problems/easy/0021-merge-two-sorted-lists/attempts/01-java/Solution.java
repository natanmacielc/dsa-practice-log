/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /**
     * Dummy head node, iteratively splice in the smaller of the two current
     * nodes, treating an exhausted list as Integer.MAX_VALUE.
     * Time Complexity:  O(n)
     * Space Complexity: O(1)
     *
     * @param  list1 head of the first sorted list
     * @param  list2 head of the second sorted list
     * @return head of the merged sorted list
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode current = root;
        while (list1 != null || list2 != null) {
            int val1 = list1 != null ? list1.val : Integer.MAX_VALUE;
            int val2 = list2 != null ? list2.val : Integer.MAX_VALUE;
            if (val1 <= val2) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        return root.next;
    }
}
