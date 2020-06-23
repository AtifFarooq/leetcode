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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        // fast pointer moves twice as fast as slow
        // fast will reach null when list has even number
        // of elements, and will reach last element with odd
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // slow is now at the middle. Reverse the list
        // starting from this node. Put fast back to head.
        fast = head;
        slow = reverse(slow);
        
        // traverse both lists and check for element equality
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    // method to reverse a linked-list
    public ListNode reverse(ListNode head) {
        // initialize a 'previous' pointer
        ListNode prev = null;
        while (head != null) {
            // make reference to next
            ListNode next = head.next;
            // assign head's next to the prev
            head.next = prev;   
            // update head and prev
            prev = head;
            head = next;
        }
        
        return prev;
    }
}