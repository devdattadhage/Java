package models;

public enum Directions {
    N(0),
    E(1),
    S(2),
    W(3);

    private final int val;

    Directions(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
