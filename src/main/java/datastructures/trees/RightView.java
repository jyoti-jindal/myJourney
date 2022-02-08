package datastructures.trees;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class RightView {
//    static int size = 0;
//    ArrayList<Integer> rightView(Node node) {
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        rightView(node, result, 0);
//        return result;
//    }

//    void rightView(Node node, List<Integer> list, int level) {
//        if(node == null) return;
//
//        if(level == list.size())
//            list.add(node.data);
//
//        rightView(node.right, list, level+1);
//        rightView(node.left, list, level+1);
//    }

    void rightView(Node node) {
        int size = 0;
        rightView(node, 0, size);
    }

    int rightView(Node node, int level, Integer size) {
        if (node == null) return size;

        if (level == size) {
            System.out.print(node.data + " ");
            size++;
        }

        size = rightView(node.right, level + 1, size);
        size = rightView(node.left, level + 1, size);
        return size;
    }

    public static void main(String[] args) {
        /* creating a binary tree and entering the nodes */
        RightView rightView = new RightView();
        Node tree = new Node(12);
        tree.left = new Node(10);
        tree.right = new Node(30);
        tree.right.left = new Node(25);
        tree.right.right = new Node(40);

        rightView.rightView(tree);
    }
}
