import com.step.batch10.Square;
import com.step.batch10.model.Days;
import com.step.batch10.model.Drawable;
import com.step.batch10.model.Position;

public class Main implements Drawable {
    public static void main(String[] args) {
        Position initialPos = new Position();
        System.out.println(initialPos.getX());

        Square square = new Square(4);
        System.out.printf("Square(%d)\n", square.getSide());

        Days monday = Days.MONDAY;
        System.out.println(monday);

        for (Days days : Days.values()) System.out.println(days);

        System.out.println(monday.getMarathiName());
        System.out.println(monday.isWeekend());
    }

    @Override
    public void draw() {
        System.out.println("Implemented Drawable");
    }
}
