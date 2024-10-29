import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        //get todays date
        LocalDate date = LocalDate.now();
        System.out.println("the date today is: "+date);

        // get local time
        LocalTime time = LocalTime.now();
        System.out.println("the time is: "+time);

        // get local datetime
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //format date according to your preference
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyy HH:mm:ss");

        String fullDate = ldt.format(dateFormat);

        System.out.println("full date is: "+fullDate);
    }
}
