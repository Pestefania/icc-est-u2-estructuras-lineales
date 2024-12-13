package Ejercicio_01_sign;

import java.util.EmptyStackException;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(char value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public char pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        char value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public char peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }
}
