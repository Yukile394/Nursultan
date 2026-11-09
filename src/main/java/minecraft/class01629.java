package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01629 implements class01285 {
   public static final class01894 N = class01894.y("light");

   public class01629() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      class07049 class07049 = class06202.F();
      if (class07049 != null && (class03448)class06202.T_3 != null) {
         class07209 class07209 = class07049.method_24515();
         int i = ((class03448)class06202.T_3).method_8398().L().N(class07209, 0);
         int j = ((class03448)class06202.T_3).method_8314(class00772.field_9284, class07209);
         int k = ((class03448)class06202.T_3).method_8314(class00772.field_9282, class07209);
         String s = "Client Light: " + i + " (" + j + " sky, " + k + " block)";
         if (class07529.NX) {
            String s1;
            if (var4 != null) {
               class05795 class05795 = var4.J().method_22336();
               s1 = "Server Light: ("
                  + class05795.N(class00772.field_9284).L(class07209)
                  + " sky, "
                  + class05795.N(class00772.field_9282).L(class07209)
                  + " block)";
            } else {
               s1 = "Server Light: (?? sky, ?? block)";
            }

            var1.N(N, List.of(s, s1));
         } else {
            var1.N(N, s);
         }
      }
   }
}
