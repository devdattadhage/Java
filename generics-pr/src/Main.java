import com.tw.step.DataProcessor;

public class Main {
    public static void main(String[] args) {
        DataProcessor<String> dp1 = new DataProcessor<>("Hello Brother");
        DataProcessor<Number> dp2 = new DataProcessor<>(123);

        printData(dp1.getData());
        printData(dp2.getData());

    }

    private static <T> void printData(T data) {
        System.out.println(data);
    }
}