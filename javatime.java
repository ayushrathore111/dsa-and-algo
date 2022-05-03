import java.util.*;
import java.time.LocalDate;
public class javatime {
    public static void main(String[] args) {
           //2017 is year
           // 14 date  and 8 is month
        LocalDate ld = LocalDate.of(2022,3,1);
        System.out.println(ld.getDayOfWeek().name());
    }
}
