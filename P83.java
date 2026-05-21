import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WatchRun {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            LocalTime time = LocalTime.now();
            System.out.print("\rCurrent Time: " + time.format(format));
            Thread.sleep(1000);
        }
    }
}
