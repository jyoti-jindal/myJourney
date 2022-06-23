package datastructures.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        reverseLinkedList.reverseList(listNode);
    }

    public ListNode reverseList(ListNode A) {
        if (A == null) {
            return null;
        }
        ListNode cur = A;
        ListNode prev = null;
        while (cur != null) {
            ListNode temp = cur.next; //2
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return A;
    }
}
