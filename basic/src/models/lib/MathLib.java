package models.lib;

public class MathLib {
  private int firstNumber;
  private int secondNumber;
  protected int thirdNumber;

  public  MathLib() {
    this.firstNumber = 1;
    this.secondNumber = 2;
    this.thirdNumber = 3;
  }
  
  public int add() {
    return this.firstNumber + this.secondNumber;
  }
}