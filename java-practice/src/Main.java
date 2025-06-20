import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Java Practice!!");

        try (
                FileReader fileReader = new FileReader("./data/sample.txt");
                FileWriter fileWriter = new FileWriter("./outputs/sample-output.txt")) {

            long start = System.currentTimeMillis();

            int character;
            while ((character = fileReader.read()) != -1) {
//                System.out.println((char) character);
                fileWriter.write(character);
            }

            long end = System.currentTimeMillis();
            System.out.printf("start : %s | end : %s", end, start);
            System.out.printf("\ndiff : %s", end - start);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}