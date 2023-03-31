package org.example;

public class Stack {

    private class Node {
        public Object value;
        public Node next;
    }

    Node top;
    public boolean isEmpty() {

        return top == null;
    }

    public void push(Object item) {
        Node newNode = new Node();
        newNode.value = item;
        newNode.next = top;
        top = newNode;
    }

    public Object peek() throws StackEmptyException {
        if(isEmpty()) {
            throw new StackEmptyException();
        }
        return top.value;
    }

    public Object pop() {
        if(isEmpty()) {
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp.value;
    }
}
