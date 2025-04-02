package org.rv.linked_list;

import org.rv.entity.ListNode;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted linked list and return the head of the new sorted linked list.
 *
 * The new list should be made up of nodes from list1 and list2.
 */
public class MergeTwoSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val > list2.val)
            return mergeTwoLists(list2, list1);
        ListNode p = list1.next, q = list2;
        ListNode prevP = list1;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                prevP = p;
                p = p.next;
            } else {
                prevP.next = q;
                q = p;
                p = prevP.next;
            }
        }
        if (q != null)
            prevP.next = q;
        return list1;
    }
}
