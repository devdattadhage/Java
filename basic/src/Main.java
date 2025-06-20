import models.Position;
import models.lib.MathLib;

public class Main {
  public static int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    int a = 2;
    int b = 4;
    float f = 2.1f;
    double d = 20.48;
    String fb = "Drogba";
    
    System.out.printf("a: %d and b: %d\n", a, b);
    System.out.printf("f: %f and d: %f and fb: %s \n", f, d, fb);

    int sum = add(a, b);
    System.out.printf("Sum of a and b %d\n",sum);

    Position initialPos = new Position(a, b);
    System.out.printf("Before x : %d and y : %d\n", initialPos.x, initialPos.y);

    Position finalPos = initialPos.right();
    System.out.printf("After x : %d and y : %d\n", finalPos.x, finalPos.y);

    MathLib mathInstance = new MathLib();
    System.out.printf("addition of two number is: %d", mathInstance.add());
  }
}
