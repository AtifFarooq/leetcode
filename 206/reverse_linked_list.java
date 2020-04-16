/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while(head != null) {
            ListNode next_node = head.next;
            head.next = previous;
            previous = head;
            head = next_node;
        }
        return previous;
    }
}