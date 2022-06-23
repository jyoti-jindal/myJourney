package datastructures.linkedlist;

public class RemoveLoop {
    public static void main(String[] args) {
        RemoveLoop removeLoop = new RemoveLoop();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = listNode1;
//        listNode1.next.next.next = new ListNode(4);
        removeLoop.solve(listNode1);
    }

    public ListNode solve(ListNode a) {
        ListNode slow = a;
        ListNode fast = a;

        do {

            slow = slow.next;
            fast = fast.next.next;

        } while (slow != fast && slow != null && fast != null && fast.next != null);

        // if(slow != fast) {
        //     return null;
        // }


        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
//        fast = a;
        ListNode prev = a;
        while (prev != slow) {
            prev = prev.next;
        }

        prev.next = null;
        return a;
    }
}
