package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int NEGATIVE = -1;
    private static final int ERROR = -1;
    private static final int SIZE = 12;
    private static final int FULL = SIZE - 1;

    private final int[] numbers = new int[SIZE];

    private int total = NEGATIVE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == NEGATIVE;
        }
        
            public boolean isFull() {
                return total == FULL;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ERROR;
                    return numbers[total];
                }
            
                public int countOut() {
                    if (callCheck())
                        return ERROR;
                    return numbers[total--];
                }

    public int getTotal() {
        return total;
    }
}
