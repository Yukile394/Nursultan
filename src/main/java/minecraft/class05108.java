package minecraft;

import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface class05108 {
   class00392 N = class00392.L("mco.errorMessage.noDetails");
   Logger y = LogUtils.getLogger();

   String L();

   class00392 y();

   static class05108 N(int var0, String var1) {
      if (var0 == 429) {
         return class05124.L;
      } else if (Strings.isNullOrEmpty(var1)) {
         return class05124.y(var0);
      } else {
         try {
            JsonObject jsonobject = class08314.N(var1).getAsJsonObject();
            String s = class05001.N(jsonobject, "reason", null);
            String s1 = class05001.N(jsonobject, "errorMsg", null);
            int i = class05001.N(jsonobject, "errorCode", -1);
            if (s1 != null || s != null || i != -1) {
               return new class05136(var0, i != -1 ? i : var0, s, s1);
            }
         } catch (Exception exception) {
            y.error("Could not parse RealmsError", exception);
         }

         return new class05128(var0, var1);
      }
   }

   int N();
}
