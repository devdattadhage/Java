import com.step.errors.MarJaMitraException;
import com.step.errors.YouAreBhuddhuException;

public class Main {
    public static void main(String[] args) {
        RuntimeException rte = new RuntimeException();
        int points = (int) (Math.random() * 100);
        String name = "Vineet";

        try {
            if (points < 35) throw new MarJaMitraException(name, "kya karega jee ke!");

            if (points < 80) throw new YouAreBhuddhuException(name, "yeh umid nahi thi!");

            throw rte;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (MarJaMitraException | YouAreBhuddhuException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }
}