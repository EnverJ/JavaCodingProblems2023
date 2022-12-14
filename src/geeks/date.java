package geeks;

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class date {
    static Date d1 = new Date();
@Test
public void nowDate() {
    System.out.println(d1);
}
@Test
public void localDate () {
    LocalDate cd =  LocalDate.now();
    System.out.println("Current Date: "+cd);
}
@Test
public void pastDate () {
    LocalDate pd = LocalDate.of(2021,12,20);
    System.out.println("Past Date: "+pd);
}
@Test
public  void leapYear() {
    LocalDate ly = LocalDate.of(2021,9,12);  //false
    System.out.println(ly.isLeapYear());
    LocalDate ly2 = LocalDate.of(2024,9,12); //true
    System.out.println(ly2.isLeapYear());
    LocalDate ly3 = LocalDate.of(2020,9,12); //true
    System.out.println(ly3.isLeapYear());
}
@Test
public void StringToLocalDate() {
    DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    String date= "09/13/2021";

    LocalDate ld = LocalDate.parse(date,df);
    System.out.println(ld);  //2021-09-13
    System.out.println("Local date in the given format: "+df.format(ld)); //Local date in the given format: 09/13/2021
    System.out.println("Default format date: "+ld);  //Default format date: 2021-09-13

}
}
