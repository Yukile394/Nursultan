package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class05633 implements class06904 {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = class01603.field_14190.N() + "/minecraft/structure/";

   public class05633() {
      super();
   }

   public static class07001 y(String var0, class07001 var1) {
      class01207 class01207 = new class01207();
      int i = class07717.y(var1, 500);
      short short1 = 4650;
      if (i < 4650) {
         N.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{i, 4650, var0});
      }

      class07001 class07001 = class05715.field_19217.N(class04999.N(), var1, i);
      class01207.N(class04206.i, class07001);
      return class01207.N(new class07001());
   }

   @Override
   public class07001 N(String var1, class07001 var2) {
      return var1.startsWith(y) ? y(var1, var2) : var2;
   }
}
