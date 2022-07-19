package datastructures.stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;

    MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        System.out.println("Push 1");
        minStack.push(1);
        System.out.println("Push 2");
        minStack.push(2);
        System.out.println("Min Element: " + minStack.getMin());
        System.out.println("Top Element: " + minStack.top());
        System.out.println("Push -1");
        minStack.push(-1);
        System.out.println("Min Element: " + minStack.getMin());
        System.out.println("Pop the Element: " + minStack.top());
        minStack.pop();
        System.out.println("Min Element: " + minStack.getMin());
        System.out.println("Pop the Element: " + minStack.top());
        minStack.pop();
        System.out.println("Min Element: " + minStack.getMin());
        System.out.println("Pop the Element: " + minStack.top());
        minStack.pop();
        System.out.println("Min Element: " + minStack.getMin());
    }

    public void push(int x) {
        st.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            int x = st.pop();
            if (!minStack.isEmpty() && x == minStack.peek())
                minStack.pop();
        }
    }

    public int top() {
        if (st.isEmpty()) {
            return -1;
        }
        return st.peek();
    }

    public int getMin() {
        if (st.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }

}
