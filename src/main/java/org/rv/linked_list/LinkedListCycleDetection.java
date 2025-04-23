package org.rv.linked_list;

import org.rv.entity.ListNode;

/**
 * Given the beginning of a linked list head,
 * return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * There is a cycle in a linked list if at least one node in the list can be visited again
 * by following the next pointer.
 *
 * Internally, index determines the index of the beginning of the cycle, if it exists.
 * The tail node of the list will set it's next pointer to the index-th node. If index = -1, then the tail node points to null and no cycle exists.
 *
 * Note: index is not given to you as a parameter.
 *
 * Example 1:
 */
public class LinkedListCycleDetection {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow.equals(fast))
                return true;
        }
        return false;
    }
}
