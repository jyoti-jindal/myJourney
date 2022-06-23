package datastructures.linkedlist;

public class AddAtFront {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        print(listNode1);
        listNode1 = addAtFront(listNode1, 0);
        print(listNode1);
        listNode1 = addAtFront(listNode1, -1);
        print(listNode1);
    }

    public static ListNode addAtFront(ListNode head, int val) {
        if (head == null) return null;

        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
