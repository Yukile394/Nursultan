package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class08949 implements class01285 {
   private static final class01894 N = class01894.y("biome");

   public class08949() {
      super();
   }

   private static String N(class03556<class00780> var0) {
      return (String)var0.u().map(var0x -> var0x.N().toString(), var0x -> "[unregistered " + var0x + "]");
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      class07049 class07049 = class06202.F();
      if (class07049 != null && (class03448)class06202.T_3 != null) {
         class07209 class07209 = class07049.method_24515();
         if (((class03448)class06202.T_3).L(class07209.method_10264())) {
            if (class07529.NX && var2 instanceof class04782) {
               var1.N(N, List.of("Biome: " + N(((class03448)class06202.T_3).i(class07209)), "Server Biome: " + N(var2.i(class07209))));
            } else {
               var1.y("Biome: " + N(((class03448)class06202.T_3).i(class07209)));
            }
         }
      }
   }
}
