# Merge Two Sorted Lists
#
# Merge two sorted linked lists and return it as a new list. 
# The new list should be made by splicing together the nodes 
# of the first two lists.
#
# Input: 1->2->4, 1->3->4
# Output: 1->1->2->3->4->4
#
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        # dummy_node.next will be the actual 
        # head of the merged list. current_node
        # will travel along, marking the final path 
        dummy_node = ListNode(-1)
        current_node = dummy_node
        
        while l1 != None and l2 != None:
          if l1.val <= l2.val:
            current_node.next = l1
            current_node = l1
            l1 = l1.next
          else:
            current_node.next= l2
            current_node = l2
            l2 = l2.next
        
        # if one the lists comes to and end, and there
        # are still elements in the other one
        if l1 != None:
          current_node.next = l1
        if l2 != None:
          current_node.next = l2
        
        return dummy_node.next 