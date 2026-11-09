package minecraft;

import java.util.Comparator;

public class class08120 {
   public class08120() {
      super();
   }

   public void N(class07937 var1, class01422 var2, class01590 var3) {
      class08112 class08112 = var1.L();
      class08112.N.sort(Comparator.comparing(class08142::B).reversed());

      for (class08142 class08142x : class08112.N) {
         var3.N(
            class08142x.u(),
            class08142x.y(),
            class08142x.L(),
            class08142x.R(),
            false,
            class08142x.N(),
            var2,
            class01583.field_33994,
            class08142x.M(),
            class08142x.i()
         );
      }

      for (class08142 class08142 : class08112.y) {
         var3.N(
            class08142.u(), class08142.y(), class08142.L(), class08142.R(), false, class08142.N(), var2, class01583.field_33993, class08142.M(), class08142.i()
         );
      }
   }
}
