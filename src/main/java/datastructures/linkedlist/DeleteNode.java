package datastructures.linkedlist;

public class DeleteNode {
    static ListNode head = null;
    static int size = 0;

    public static void main(String[] args) {
        insert_node(1, 1);
        insert_node(1, 23);
        insert_node(2, 24);
        print_ll();
        System.out.println();
        delete_node(2);
        print_ll();
        System.out.println();
        delete_node(2);
        print_ll();
    }

    public static void delete_node(int position) {

        if (position > size) {
            return;
        }
        if (position == 1) {
            head = head.next;
        } else {
            ListNode cur = head;
            ListNode prev = null;
            while (position > 1) {
                prev = cur;
                cur = cur.next;
                position--;
            }
            prev.next = cur.next;
        }
        size--;
    }

    public static void print_ll() {
        ListNode cur = head;
        for (int i = 0; i < size - 1; i++) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }

        System.out.print(cur.val);
    }

    public static void insert_node(int position, int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
        } else {
            ListNode cur = head;
            if (position == 1) {
                node.next = head;
                head = node;
            } else {
                for (int i = 1; i < position - 1; i++) {
                    cur = cur.next;
                }
                ListNode temp = cur.next;
                cur.next = node;
                node.next = temp;
            }
            size++;
        }
    }
}
