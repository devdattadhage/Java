import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(numbers.add(1));
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers.get(1));
        System.out.println(numbers);
    }
}