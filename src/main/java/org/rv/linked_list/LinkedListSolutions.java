package org.rv.linked_list;

import org.rv.entity.ListNode;

import java.util.Scanner;

import static org.rv.util.StringManipulationUtil.getIntegerArrayFromString;

public class LinkedListSolutions {
    private String problemCode;
    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public LinkedListSolutions() {}

    public void printListOfProblemCode() {
        System.out.println("LL-1 : Reverse a linked list");
        System.out.println();
    }

    public void setProblemCode(String problemCode) {
        this.problemCode = problemCode;
    }

    public void solve() {
        switch (problemCode) {
            case "LL-1":
                System.out.println("Reverse a Linked List");
                System.out.println("Please provide comma separated integer values list (with space after comma)");
                System.out.println("eg. 1, 2, 3, 4");
                String inputArray = sc.next();
                ListNode head = createLinkedList(getIntegerArrayFromString(inputArray));
                ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
                ListNode reverseNode = reverseLinkedList.reverseList(head);
                printLinkedList(reverseNode);
                break;
            default:
                System.out.println("Invalid problemCode for sliding window");
        }
    }

    private void printLinkedList(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            System.out.print(p.getVal() + " ");
        }
        System.out.println();
    }

    private ListNode createLinkedList(int[] integerArrayFromString) {
        ListNode head = null, p = null;
        for (int num : integerArrayFromString) {
            if (head == null) {
                head = new ListNode(num);
                p = head;
                continue;
            }
            p.next = new ListNode(num);
            p = p.next;
        }
        return head;
    }
}
