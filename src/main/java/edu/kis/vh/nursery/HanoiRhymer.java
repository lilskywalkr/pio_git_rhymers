package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INT2 = 0;
    private int totalRejected = INT2;

    protected int reportRejected() {
        return totalRejected;
    }

    @Override
    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
