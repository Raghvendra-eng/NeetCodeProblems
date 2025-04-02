package org.rv.entity;

public class ListNode {
    public int val;

    public int getVal() {
        return val;
    }

    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
