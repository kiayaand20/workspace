import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date_practice {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);
        LocalDate theDayAfterTomorrow = today.plusDays(2);
        System.out.println("The day after tomorrow = " + theDayAfterTomorrow);

        LocalDate localDate = LocalDate.of(2022, Month.OCTOBER, 18);
        System.out.println("Local date = " + localDate);

        LocalTime localTime = LocalTime
                .now();
//                .plusHours(3);
        System.out.println("Local time = " + localTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Data Time = " + zonedDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //MMM needed if you want to display month i.e. Mar
        LocalDate localDate1 = LocalDate.parse("14-02-2020", dateTimeFormatter);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.of(2022, 10, 13);
        String format = localDate2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(format);

        String format2 = localDate2.format(DateTimeFormatter.ofPattern("EEE, MM-dd-yyy"));
        System.out.println(format2);

    }

}
