package datastructures.linkedlist;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);
        mergeTwoLists(listNode1, listNode2);

    }

    /**
     * Definition for singly-linked list.
     **/
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode headMerged = null;
        if (list1.val < list2.val) {
            headMerged = list1;
            list1 = list1.next;
        } else {
            headMerged = list2;
            list2 = list2.next;
        }
        ListNode curr = headMerged; // 1 -> 1 -> 2
        while (list1.next != null && list2.next != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1 == null) {
            curr.next = list2;
        } else {
            curr.next = list1;
        }
        return headMerged;
    }
}
