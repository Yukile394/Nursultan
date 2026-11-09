package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class02929 extends class01733 {
   public class02929(Schema var1) {
      super(var1, false, "RemoveEmptyItemInSuspiciousBlockFix", class06962.G, "minecraft:brushable_block");
   }

   private static boolean y(Dynamic<?> var0) {
      String s = class00622.N(var0.get("id").asString("minecraft:air"));
      int i = var0.get("count").asInt(0);
      return s.equals("minecraft:air") || i == 0;
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      Optional optional = var1.get("item").result();
      return optional.isPresent() && y((Dynamic<?>)optional.get()) ? var1.remove("item") : var1;
   }
}
