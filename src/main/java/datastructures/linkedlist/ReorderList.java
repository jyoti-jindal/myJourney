package datastructures.linkedlist;

import java.util.Iterator;

public class ReorderList {
    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        reorderList.reorderList(listNode1);
    }

    public ListNode reorderList(ListNode A) {
        if (A == null) {
            return null;
        }

        ListNode node = A;
        ListNode next = A.next;
        ListNode prev = null;
        while (A.next != null) {
            prev = A;
            A = A.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        node.next = A;

        if (A != next) {
            A.next = reorderList(next);
        }
        return node;
    }
}
