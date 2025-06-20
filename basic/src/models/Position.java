package models;

public class Position {
  public final int x;
  public final int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Position right() {
    return new Position(this.x + 1, this.y);
  }
  
  public Position left(){
    return new Position(this.x - 1, this.y);
  }
}