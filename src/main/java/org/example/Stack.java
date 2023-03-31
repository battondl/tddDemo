package org.example;

public class Stack {

    Object top;
    public boolean isEmpty() {

        return top == null;
    }

    public void push(Object item) {
        top = item;
    }

    public Object peek() throws StackEmptyException {
        if(isEmpty()) {
            throw new StackEmptyException();
        }
        return top;
    }

    public Object pop() {
        if(isEmpty()) {
            return null;
        }
        Object temp = top;
        top = null;
        return temp;
    }
}
