package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NEGATIVE_VALUE = -1;
    public static final int MEDIUM_CAPACITY = 11;
    public static final int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_VALUE;
    }

    public boolean isFull() {
        return total == MEDIUM_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE_VALUE;
        return numbers[total--];
    }

}
