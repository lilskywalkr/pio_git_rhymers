package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NEGATIVE_VALUE = -1;
    private static final int MEDIUM_CAPACITY = 11;
    private static final int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];

    protected int getTotal() {
        return total;
    }

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == NEGATIVE_VALUE;
    }

    protected boolean isFull() {
        return total == MEDIUM_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_VALUE;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return NEGATIVE_VALUE;
        return numbers[total--];
    }

}
