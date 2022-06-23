package datastructures.linkedlist;

public class ReverseRange {
    public static void main(String[] args) {
        ReverseRange reverseRange = new ReverseRange();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        reverseRange.reverseBetween(node, 1, 2);
    }

    public ListNode reverseBetween(ListNode A, int B, int C) {
        if (A == null) {
            return null;
        }

        if (B == C) {
            return A;
        }

        ListNode cur = A;

        ListNode start = null;

        while (cur != null && cur.val != B) {
            start = cur;
            cur = cur.next;
        }
        if (start == null) {
            start = cur;
        }
        ListNode prev = null;
        while (cur != null && cur.val != C) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        ListNode end = cur.next;
        cur.next = prev;
        prev = cur;

        if (start.next != null) {
            ListNode temp = start.next;
            start.next = prev;
            temp.next = end;
        } else {
            start.next = end;
            A = cur;
        }


        return A;
    }
}
