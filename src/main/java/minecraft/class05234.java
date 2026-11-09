package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class05234 implements class01285 {
   public class05234() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      class08337 class08337 = class06202.Na();
      class01683 class01683 = class06202.NE();
      if (class01683 != null && var2 != null) {
         class00642 class00642 = class01683.M();
         float f = class00642.method_10745();
         float f1 = class00642.method_10762();
         class03106 class03106 = var2.method_54719();
         String s;
         if (class03106.z()) {
            s = " (frozen - stepping)";
         } else if (class03106.E()) {
            s = " (frozen)";
         } else {
            s = "";
         }

         String s1;
         if (class08337 != null) {
            boolean flag = class08337.yW().N();
            if (flag) {
               s = " (sprinting)";
            }

            String s2 = flag ? "-" : String.format(Locale.ROOT, "%.1f", class03106.M());
            s1 = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", class08337.yE(), s2, s, f, f1);
         } else {
            s1 = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", class01683.V(), s, f, f1);
         }

         var1.y(s1);
      }
   }

   @Override
   public boolean method_72753(boolean var1) {
      return true;
   }
}
