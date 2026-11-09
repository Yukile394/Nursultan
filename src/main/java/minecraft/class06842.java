package minecraft;

import java.time.Month;
import java.time.MonthDay;
import java.time.ZonedDateTime;
import java.util.List;

public class class06842 {
   public static final MonthDay N = MonthDay.of(Month.OCTOBER, 31);
   public static final List<MonthDay> y = List.of(MonthDay.of(Month.DECEMBER, 24), MonthDay.of(Month.DECEMBER, 25), MonthDay.of(Month.DECEMBER, 26));
   public static final MonthDay L = MonthDay.of(Month.DECEMBER, 24);
   public static final MonthDay u = MonthDay.of(Month.JANUARY, 1);

   public static boolean L() {
      return y.contains(N());
   }

   public class06842() {
      super();
   }

   public static boolean y() {
      return N.equals(N());
   }

   public static MonthDay N() {
      return MonthDay.from(ZonedDateTime.now());
   }
}
