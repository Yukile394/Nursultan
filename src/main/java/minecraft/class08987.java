package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class08987 implements class01285 {
   private static final Map<class07830, String> N = Maps.newEnumMap(
      Map.of(
         class07830.field_13194,
         "SW",
         class07830.field_13202,
         "S",
         class07830.field_13195,
         "OW",
         class07830.field_13200,
         "O",
         class07830.field_13197,
         "M",
         class07830.field_13203,
         "ML"
      )
   );
   private static final class01894 y = class01894.y("heightmaps");

   public class08987() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      class07049 class07049 = class06202.F();
      if (class07049 != null && (class03448)class06202.T_3 != null && var3 != null) {
         class07209 class07209 = class07049.method_24515();
         ArrayList arraylist = new ArrayList();
         StringBuilder stringbuilder = new StringBuilder("CH");

         for (class07830 class07830 : class07830.values()) {
            if (class07830.y()) {
               stringbuilder.append(" ")
                  .append(N.get(class07830))
                  .append(": ")
                  .append(var3.N(class07830, class07209.method_10263(), class07209.method_10260()));
            }
         }

         arraylist.add(stringbuilder.toString());
         stringbuilder.setLength(0);
         stringbuilder.append("SH");

         for (class07830 class07830x : class07830.values()) {
            if (class07830x.L()) {
               stringbuilder.append(" ").append(N.get(class07830x)).append(": ");
               if (var4 != null) {
                  stringbuilder.append(var4.N(class07830x, class07209.method_10263(), class07209.method_10260()));
               } else {
                  stringbuilder.append("??");
               }
            }
         }

         arraylist.add(stringbuilder.toString());
         var1.N(y, arraylist);
      }
   }
}
