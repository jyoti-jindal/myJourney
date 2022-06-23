package datastructures.trees.bst;

import datastructures.trees.TreeNode;

import java.util.Stack;

class BSTIterator {

    Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    public int next() {
        TreeNode node = stack.pop();
        pushLeft(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushLeft(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}

class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);
        BSTIterator bstIterator = new BSTIterator(root);
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        while (bstIterator.hasNext()) {
            System.out.println(bstIterator.next());
        }
    }
}