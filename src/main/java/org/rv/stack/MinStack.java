package org.rv.stack;

class MinStack {
    StackNode head;
    public MinStack() {
        head = null;
    }

    public void push(int val) {
        int minValue = head == null ? val : Math.min(val, head.minValue);
        StackNode s = new StackNode(val, minValue, head);
        head = s;
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.minValue;
    }

    private class StackNode {
        int value;
        int minValue;
        StackNode next;

        StackNode(int value, int minValue) {
            this.value = value;
            this.minValue = minValue;
            this.next = null;
        }

        StackNode(int value, int minValue, StackNode node) {
            this.value = value;
            this.minValue = minValue;
            this.next = node;
        }
    }
}

