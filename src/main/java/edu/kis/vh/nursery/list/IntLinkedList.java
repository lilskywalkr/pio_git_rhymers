package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int NEGATIVE_VALUE = -1;
    private Node last;
    private int i;

    protected void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    protected boolean isEmpty() {
        return last == null;
    }

    protected boolean isFull() {
        return false;
    }

    protected int top() {
        if (isEmpty())
            return NEGATIVE_VALUE;
        return last.value;
    }

    protected int pop() {
        if (isEmpty())
            return NEGATIVE_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
