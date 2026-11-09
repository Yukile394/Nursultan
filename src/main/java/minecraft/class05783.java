package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class05783 implements class01285 {
   public class05783() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class05630 class05630 = (class05630)class06202.Nq().i_7;
      var1.y(
         String.format(
            Locale.ROOT,
            "%s%s B: %d",
            class05630.s().method_41753() ? "improved-transparency" : "",
            class05630.U().method_41753() == class01301.field_18162
               ? ""
               : (class05630.U().method_41753() == class01301.field_18163 ? " fast-clouds" : " fancy-clouds"),
            class05630.a().method_41753()
         )
      );
      class06532 class06532 = class05630.c().method_41753();
      if (class06532 == class06532.field_64665) {
         var1.y(String.format(Locale.ROOT, "Filtering: %s %dx", class06532.N().getString(), class05630.H()));
      } else {
         var1.y(String.format(Locale.ROOT, "Filtering: %s", class06532.N().getString()));
      }
   }

   @Override
   public boolean method_72753(boolean var1) {
      return true;
   }
}
