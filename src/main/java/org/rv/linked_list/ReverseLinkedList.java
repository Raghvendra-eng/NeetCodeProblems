package org.rv.linked_list;

import org.rv.entity.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        return reverse(head, null);
    }
    private ListNode reverse(ListNode head, ListNode prev) {
        if (head == null)
            return prev;
        ListNode rem = head.next;
        head.next = prev;
        return reverse(rem, head);
    }
}
