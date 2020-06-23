/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode currentA = headA;
        ListNode currentB = headB;
        HashSet<ListNode> set = new HashSet<ListNode>();
        // traverse one list and put all nodes in the set
        while (currentA != null) {
            set.add(currentA);
            currentA = currentA.next;
        }
        
        // traverse over the second list and look for duplicates
        while (currentB != null) {
            if (set.contains(currentB)) return currentB;
            currentB = currentB.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeConstantSpace(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        
        // to check the case where there is no intersection
        // this is the case where both lists have been traversed
        // and the last node is not the same
        while (dummyA.next != null) {
            dummyA = dummyA.next;
        }
        
        while (dummyB.next != null) {
            dummyB = dummyB.next;
        }
        
        if (dummyA != dummyB) return null;
        
        // reset dummy node values
        dummyA = headA;
        dummyB = headB;
        
        // Point end of A to B and vice verca to find the common node
        while (dummyA != dummyB) {
            if (dummyA == null) {
                dummyA = headB;
            } else {
                dummyA = dummyA.next;
            }
            
            if (dummyB == null) {
                dummyB = headA;
            } else {
                dummyB = dummyB.next;
            }
        }
        
        return dummyA;
    }

}