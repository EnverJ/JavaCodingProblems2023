package Chapter_3;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenTime_76 {

    public void Temporal_JDK8 () {
        LocalDate 1d1 = LocalDate.of(2003,11,23);
        LocalDate 1d2 = LocalDate.of(2023,9,5);
        long betweenInDays = Math.abs(ChronoUnit.DAYS.between(1d1,1d2));
        System.out.println(betweenInDays);
    }
}
