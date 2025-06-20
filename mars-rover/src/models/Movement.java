package models;

public class Movement {
    private int x;
    private int y;
    private Directions direction;

    public Movement(int x, int y, Directions direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getCurrentCoordinates() {
        return "x: " + this.x + " y: " + this.y;
    }

    public Directions getDirection() {
        return this.direction;
    }

    public Directions turnLeft() {
        int val = this.direction.getVal();
        int newVal = (val + 3) % 4;
        return this.direction = Directions.values()[newVal];
    }

    public Directions turnRight() {
        int val = this.direction.getVal();
        int newVal = (val + 1) % 4;
        return this.direction = Directions.values()[newVal];
    }

    public int move() {
        int result;
        switch (this.direction) {
            case N:
                result = this.y += 1;
                break;
            case E:
                result = this.x += 1;
                break;
            case S:
                result = this.y -= 1;
                break;
            case W:
                result = this.x -= 1;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
