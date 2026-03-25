package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int ujemne = -1;
    public static final int eleven = 11;
    public static final int size = 12;

    private int[] numbers = new int[size];

    public int total = ujemne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == ujemne;
        }
        
            public boolean isFull() {
                return total == eleven;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ujemne;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ujemne;
                        return numbers[total--];
                    }

}
