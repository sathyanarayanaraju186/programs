package org.dsalgo.leetcode;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        // consider the pointer at head
        ListNode current = head;
        // move the pointer from the head to end
        while (current != null && current.next != null) {
            // if the pointer has same value of the next node value, 
            // then pointer next node should not be the next node, 
            // so point the next node of the pointer -> next node of next node.
            // else move the pointer to the next node for next iteration validation
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
