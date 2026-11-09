package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class06115 extends class08158 {
   public class06115(Schema var1, boolean var2) {
      super("EntityCatSplitFix", var1, var2);
   }

   @Override
   protected Pair<String, Dynamic<?>> N(String var1, Dynamic<?> var2) {
      if (Objects.equals("minecraft:ocelot", var1)) {
         int i = var2.get("CatType").asInt(0);
         if (i == 0) {
            String s = var2.get("Owner").asString("");
            String s1 = var2.get("OwnerUUID").asString("");
            if (!s.isEmpty() || !s1.isEmpty()) {
               var2.set("Trusting", var2.createBoolean(true));
            }
         } else if (i > 0 && i < 4) {
            var2 = var2.set("CatType", var2.createInt(i));
            var2 = var2.set("OwnerUUID", var2.createString(var2.get("OwnerUUID").asString("")));
            return Pair.of("minecraft:cat", var2);
         }
      }

      return Pair.of(var1, var2);
   }
}
