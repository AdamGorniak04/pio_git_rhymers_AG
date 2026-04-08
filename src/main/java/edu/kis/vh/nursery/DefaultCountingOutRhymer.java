package edu.kis.vh.nursery;

/**
 *Klasa reprezentująca domyślną wyliczankę.
 */
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

    /**
     *Sprzawdza czy wyliczanka jest pusta
     * @return true jesli jest pusta false w przecwinym wypadku
     */
    public boolean callCheck() {
        return total == NEGATIVE;
    }

    /**
     * Sprzawdza czy jest pelna.
     * @return true jezeli pelna false w przeciwnym razie.
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Zwraca ostatnia liczbe
     * @return ostatnia liczba lub -1 jezeli jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }
    /**
     *Zwraca i usuwa ostatnia liczbe
     * @return ostatnia liczba lub -1 jezeli jest pusta
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
