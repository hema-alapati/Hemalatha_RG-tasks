package q6_DateTime;

import java.time.LocalDateTime;

public class DateTimeNow {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
    }
}
